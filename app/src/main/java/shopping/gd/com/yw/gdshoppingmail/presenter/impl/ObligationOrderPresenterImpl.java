package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.ObligationFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class ObligationOrderPresenterImpl extends BasePresenter<OrderModelImpl, ObligationFragment> implements OrderContract.OBligationOrderPresenter {


    @Override
    public void getObligationOrder() {
        model.loadObligationOrder(view);
    }
}
