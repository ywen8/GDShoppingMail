package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.MerChantContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.MerChantModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.merchant.MerChantActivity;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantPresenterImpl extends BasePresenter<MerChantModelImpl, MerChantActivity> implements MerChantContract.MerChantPresenter {
    @Override
    public void getMerChant() {
        model.loadMerChant(view);
    }

    @Override
    public void getMerChantDetails() {
        model.loadMerChantDetial(view);
    }

    @Override
    public void getMerChantShoppings() {
        model.loadMerChantShoppongs(view);
    }


}
