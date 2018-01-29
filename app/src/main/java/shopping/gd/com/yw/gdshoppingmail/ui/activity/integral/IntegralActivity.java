package shopping.gd.com.yw.gdshoppingmail.ui.activity.integral;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Integral;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.IntegralContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.IntegralPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.IntegralModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.rule.IntegralRuleActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.IntegralDetialAdapter;

/**
 * Created by yw on 2018/1/18.
 */

public class IntegralActivity extends BaseActivity<IntegralPresenterImpl> implements IntegralContract.IntegralView {

    IntegralDetialAdapter adapter;

    @BindView(R.id.activity_integral_detial_rv)
    RecyclerView integral_detial_rv;

    @BindView(R.id.activity_integral_score)
    TextView integral_score;

    @OnClick(R.id.activity_use_integral)
    void useintegral() {
        startActiviys(IntegralRuleActivity.class);
    }

    @Override
    public void integralShow(Integral integral) {
        integral_score.setText(integral.score + "");
    }

    @Override
    public void integralRecordShow(List<Integral> list) {
        integral_detial_rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new IntegralDetialAdapter(this, list);
        integral_detial_rv.setAdapter(adapter);
    }

    @Override
    protected IntegralPresenterImpl initPresent() {
        return new IntegralPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new IntegralModelImpl();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integral);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getIntegral();
        present.getIntegralRecord();
    }
}
