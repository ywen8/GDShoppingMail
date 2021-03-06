package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.ConsignmentFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class ConsignOrderPresenterImpl extends BasePresenter<OrderModelImpl, ConsignmentFragment> implements OrderContract.ConsignOrderPresenter {


    @Override
    public void getConsignOrder() {
        model.loadConsignOrder(view);
    }
}
