package shopping.gd.com.yw.gdshoppingmail.ui.fragment.my;

import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.MyContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.MyPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.MyModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.collect.CollectActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.integral.IntegralActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.message.MessageActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.obligation.ObligationActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.setting.SettingActivity;

public class MyFragment extends BaseAppFragment<MyPresenterImpl> implements MyContract.MyView {

    @OnClick(R.id.fm_my_obligation)
    void obligtaionClick() {
        startActiviys(ObligationActivity.class);
    }

    @OnClick(R.id.fm_my_integral)
    void integralClick() {
        startActiviys(IntegralActivity.class);
    }

    @OnClick(R.id.fm_my_collect)
    void collectClick() {
        startActiviys(CollectActivity.class);
    }

    @OnClick(R.id.fm_my_setting)
    void settingClick() {
        startActiviys(SettingActivity.class);
    }

    @OnClick(R.id.fm_my_message)
    void messageClick() {
        startActiviys(MessageActivity.class);
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public int getLayoutResId() {
        return R.layout.fm_my;
    }

    @Override
    protected void initView(View parentView) {

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    protected MyPresenterImpl initPresenter() {
        return new MyPresenterImpl();
    }

    @Override
    protected BaseModule initModule() {
        return new MyModelImpl(getActivity());
    }

    @Override
    public void finishCreateView(Bundle bundle) {

    }

    public static MyFragment newInstance() {
        return new MyFragment();
    }
}
