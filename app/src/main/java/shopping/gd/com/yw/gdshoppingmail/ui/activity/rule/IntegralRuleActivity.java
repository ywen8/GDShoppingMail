package shopping.gd.com.yw.gdshoppingmail.ui.activity.rule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Rule;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.RuleContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.RulePresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.RuleModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;

/**
 * Created by yw on 2018/1/18.
 */

public class IntegralRuleActivity extends BaseActivity<RulePresenterImpl> implements RuleContract.RuleView {
    @BindView(R.id.activity_urle_detial)
    TextView urle_detial;

    @BindView(R.id.activity_urle_img)
    ImageView urle_img;

    @BindView(R.id.activity_urle_name)
    TextView urle_name;

    @Override
    public void ruleShow(Rule rule) {
        urle_detial.setText(rule.detial);
        urle_name.setText(rule.name);
    }

    @Override
    protected RulePresenterImpl initPresent() {
        return new RulePresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new RuleModelImpl();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_urle);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }
}
