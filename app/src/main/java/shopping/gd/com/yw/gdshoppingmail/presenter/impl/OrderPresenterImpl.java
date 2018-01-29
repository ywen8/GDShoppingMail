package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.order.OrderActivity;

/**
 * Created by yw on 2018/1/17.
 */

public class OrderPresenterImpl extends BasePresenter<OrderModelImpl, OrderActivity> implements OrderContract.OrderPresenter {
    @Override
    public void getOrder() {
        model.loadOrder(view);
    }
}
