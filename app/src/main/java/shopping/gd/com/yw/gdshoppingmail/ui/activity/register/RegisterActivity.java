package shopping.gd.com.yw.gdshoppingmail.ui.activity.register;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.RegisterContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.RegisterPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.RegisterModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;

public class RegisterActivity extends BaseActivity<RegisterPresenterImpl> implements RegisterContract.RegisterView {


    @Override
    protected RegisterPresenterImpl initPresent() {
        return new RegisterPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new RegisterModelImpl(this);
    }

    @OnClick(R.id.at_register_next_bt)
    void registerNext() {
        Log.i("--------",""+this.getClass().getName());
        startActiviys(RegisterSecondActivity.class);
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }
}
