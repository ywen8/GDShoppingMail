package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.WaresContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.WaresModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.Wares.WaresFragment;

/**
 * Created by yw on 2018/1/16.
 */

public class WaresDetialsPresenterImpl extends BasePresenter<WaresModelImpl, WaresFragment> implements WaresContract.WaresDetialsPresenter {
    @Override
    public void getWaresDetial() {
        model.loadwaresDetial(view);
    }

    @Override
    public void getWaresDetialType() {
        model.loadwaresDetialType(view);
    }

    @Override
    public void getwaresDetialEvalutes() {
        model.getwaresDetialEvalutes(view);
    }
}
