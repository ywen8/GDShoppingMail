package shopping.gd.com.yw.gdshoppingmail.ui.activity.site;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.commonlib.view.DialogUtil;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.AddSiteContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.AddSitePresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.AddSiteModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;

/**
 * Created by yw on 2018/1/19.
 */

public class AddSiteActivity extends BaseActivity<AddSitePresenterImpl> implements AddSiteContract.AddSiteView {
    @Override
    public void resultShow(String str) {

    }

    @BindView(R.id.activity_addsite_commit)
    TextView addsite_commit;

    @OnClick(R.id.activity_addsite_commit)
    void addsiteClick() {
        DialogUtil.deleteDialog(this, "添加成功");

    }

    @Override
    protected AddSitePresenterImpl initPresent() {
        return new AddSitePresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new AddSiteModelImpl();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addsite);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }
}
