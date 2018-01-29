package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.RefundFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class RefundOrderPresenterImpl extends BasePresenter<OrderModelImpl, RefundFragment> implements OrderContract.RefundOrderPresenter {


    @Override
    public void getRefundOrder() {
        model.loadRefundOrder(view);
    }
}
