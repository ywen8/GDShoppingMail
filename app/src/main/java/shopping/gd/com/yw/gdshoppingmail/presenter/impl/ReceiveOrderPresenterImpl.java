package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.ReceiveFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class ReceiveOrderPresenterImpl extends BasePresenter<OrderModelImpl, ReceiveFragment> implements OrderContract.ReceiveOrderPresenter {


    @Override
    public void getReceiveOrder() {
        model.loadReceiveOrder(view);
    }
}
