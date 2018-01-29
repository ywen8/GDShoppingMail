package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.RegisterContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.RegisterModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.register.RegisterActivity;

public class RegisterPresenterImpl extends BasePresenter<RegisterModelImpl, RegisterActivity> implements RegisterContract.RegisterSendMessagePresenter, RegisterContract.RegisterSubmitPresenter, RegisterContract.RegisterUpdatePresenter {

    @Override
    public void sendMessage(String phone) {
        model.sendMessage(phone, view);
    }

    @Override
    public void registersubmit() {
        model.registersubmit(view);
    }

    @Override
    public void updatePassword() {
        model.updatePassword(view);
    }


}
