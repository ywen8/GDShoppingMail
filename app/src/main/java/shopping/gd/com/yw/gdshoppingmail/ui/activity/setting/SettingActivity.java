package shopping.gd.com.yw.gdshoppingmail.ui.activity.setting;

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.OnClick;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseAppActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.address.AddressActivity;

/**
 * Created by yw on 2018/1/19.
 */

public class SettingActivity extends BaseAppActivity {
    @OnClick(R.id.activity_setting_address)
    void addressClick() {
        startActiviys(AddressActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }
}
