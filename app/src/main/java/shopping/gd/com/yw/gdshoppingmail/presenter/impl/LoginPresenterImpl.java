package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import java.util.Map;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.LoginContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.LoginModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.login.LoginActivity;

public class LoginPresenterImpl extends BasePresenter<LoginModelImpl, LoginActivity> implements LoginContract.LoginPresenter {


    @Override
    public void login(Map<String, String> map) {
        model.login(map, view);
    }
}
