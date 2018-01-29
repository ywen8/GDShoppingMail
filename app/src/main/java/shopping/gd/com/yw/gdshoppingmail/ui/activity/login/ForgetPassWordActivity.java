package shopping.gd.com.yw.gdshoppingmail.ui.activity.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.Map;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.LoginContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.LoginPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.LoginModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;

public class ForgetPassWordActivity extends BaseActivity<LoginPresenterImpl> implements LoginContract.LoginView {
    @Override
    protected LoginPresenterImpl initPresent() {
        return new LoginPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new LoginModelImpl(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @OnClick(R.id.at_register_next_bt)
    void forgetNext() {

    }

    @Override
    public Map<String, String> geMap() {
        return null;
    }

    @Override
    public void loginResult(ResponseBody res) {

    }
}
