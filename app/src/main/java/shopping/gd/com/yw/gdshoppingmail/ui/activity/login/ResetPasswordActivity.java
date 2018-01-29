package shopping.gd.com.yw.gdshoppingmail.ui.activity.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.Map;

import butterknife.ButterKnife;
import okhttp3.ResponseBody;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.LoginContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.RegisterPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.RegisterModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;

public class ResetPasswordActivity extends BaseActivity<RegisterPresenterImpl> implements LoginContract.LoginView {

    @Override
    protected RegisterPresenterImpl initPresent() {
        return new RegisterPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new RegisterModelImpl(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    public Map<String, String> geMap() {
        return null;
    }

    @Override
    public void loginResult(ResponseBody res) {

    }
}
