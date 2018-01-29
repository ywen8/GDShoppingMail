package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.WaresContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.WaresModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.wares.WaresActivity;

/**
 * Created by yw on 2018/1/16.
 */

public class WaresPresenterImpl extends BasePresenter<WaresModelImpl, WaresActivity> implements WaresContract.WaresPresenter {
    @Override
    public void getWares() {
        model.loadWares(view);
    }
}
