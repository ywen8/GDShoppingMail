package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.AddressContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.AddressModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.address.AddressActivity;

/**
 * Created by yw on 2018/1/19.
 */

public class AddressPresenterImpl extends BasePresenter<AddressModelImpl, AddressActivity> implements AddressContract.AddressPresenter {

    @Override
    public void getAddress() {
        model.loadAddress(view);
    }
}
