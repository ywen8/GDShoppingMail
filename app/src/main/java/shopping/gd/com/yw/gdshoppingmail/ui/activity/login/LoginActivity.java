package shopping.gd.com.yw.gdshoppingmail.ui.activity.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
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
import shopping.gd.com.yw.gdshoppingmail.ui.activity.register.RegisterActivity;

public class LoginActivity extends BaseActivity<LoginPresenterImpl> implements LoginContract.LoginView {

    @BindView(R.id.activity_login_login)
    Button login_bt;
    @BindView(R.id.activity_login_username)
    EditText login_username;

    @BindView(R.id.activity_login_password)
    EditText login_passwrod;

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
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @OnClick(R.id.at_login_forget_password)
    void forgetPassWord() {
        startActiviys(ForgetPassWordActivity.class);
        finish();
    }

    @OnClick(R.id.activity_login_login)
    void login(){
        present.login(geMap());
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @OnClick(R.id.at_login_go_register)
    void goregister() {
        startActiviys(RegisterActivity.class);
        finish();
    }

    @Override
    public Map<String, String> geMap() {
        Map<String, String> map = new HashMap<>();
        map.put("userName", login_username.getText().toString().trim());
        map.put("password", login_passwrod.getText().toString().trim());
        return map;
    }

    @Override
    public void loginResult(ResponseBody res) {

    }
}
