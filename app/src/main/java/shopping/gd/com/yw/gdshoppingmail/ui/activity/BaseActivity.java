package shopping.gd.com.yw.gdshoppingmail.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;

public abstract class BaseActivity<P extends BasePresenter> extends BaseAppActivity implements BaseContract.IBaseView {
    public P present;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        present = initPresent();

        if (present != null) {
            present.attatchWindow(initModel(), this);
        }
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showProgress() {
        loading.showLoading();
    }

    @Override
    public void hideProgress() {
        loading.dismissLoading();
    }

    protected abstract P initPresent();

    protected abstract BaseModule initModel();

}
