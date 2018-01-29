package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.IntegralContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.IntegralModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.integral.IntegralActivity;

/**
 * Created by yw on 2018/1/18.
 */

public class IntegralPresenterImpl extends BasePresenter<IntegralModelImpl,IntegralActivity> implements IntegralContract.IntegralPresenter {
    @Override
    public void getIntegral() {
        model.loadIntegral(view);
    }

    @Override
    public void getIntegralRecord() {
        model.loadIntegralRecord(view);
    }
}
