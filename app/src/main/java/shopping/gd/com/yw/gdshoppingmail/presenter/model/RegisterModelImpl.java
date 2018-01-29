package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.RegisterContract;

public class RegisterModelImpl extends BaseModule implements RegisterContract.RegisterModel {

    private Context mContext;

    public RegisterModelImpl(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void sendMessage(String phone, RegisterContract.RegisterView registerView) {

    }

    @Override
    public void registersubmit(RegisterContract.RegisterView registerView) {

    }

    @Override
    public void updatePassword(RegisterContract.RegisterView registerView) {

    }
}
