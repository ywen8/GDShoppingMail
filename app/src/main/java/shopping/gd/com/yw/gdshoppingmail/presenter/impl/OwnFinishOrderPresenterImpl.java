package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.OwnFinishFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class OwnFinishOrderPresenterImpl extends BasePresenter<OrderModelImpl, OwnFinishFragment> implements OrderContract.OwnFinishOrderPresenter {


    @Override
    public void getOwnFinishOrder() {
        model.loadOwnFinishOrder(view);
    }
}
