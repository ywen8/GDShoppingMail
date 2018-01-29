package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.CollectContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.CollectModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.collect.CollectActivity;

/**
 * Created by yw on 2018/1/19.
 */

public class CollectPresenterImpl extends BasePresenter<CollectModelImpl,CollectActivity> implements CollectContract.CollectPresenter {
    @Override
    public void getCollect() {
        model.loadCollect(view);
    }
}
