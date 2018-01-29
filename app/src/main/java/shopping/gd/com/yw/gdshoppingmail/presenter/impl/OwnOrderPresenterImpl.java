package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.OwnOrderFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class OwnOrderPresenterImpl extends BasePresenter<OrderModelImpl, OwnOrderFragment> implements OrderContract.OwnOrderPresenter {

    @Override
    public void getOwnOrder() {
        model.loadOwnOrder(view);
    }
}
