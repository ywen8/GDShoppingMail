package shopping.gd.com.yw.gdshoppingmail.ui.activity.merchant;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.MerChant;
import shopping.gd.com.yw.domain.model.MerChantDetials;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.MerChantContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.MerChantPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.MerChantModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.MerChantAdapter;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantActivity extends BaseActivity<MerChantPresenterImpl> implements MerChantContract.MerChantView, MerChantAdapter.MerChantItemClickListener {
    @BindView(R.id.activity_merchant_rv)
    RecyclerView merchant_rv;

    @BindView(R.id.activity_merchant_title_tv)
    TextView merchant_tv;


    private MerChantAdapter merChantAdapter;


    @Override
    protected void onResume() {
        super.onResume();
        present.getMerChant();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
        init();
    }

    @Override
    protected MerChantPresenterImpl initPresent() {
        return new MerChantPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new MerChantModelImpl(this);
    }

    private void init() {
        merchant_tv.setText(R.string.merchant);

    }


    @Override
    public void merChantShow(List<MerChant> list) {
        merchant_rv.setLayoutManager(new LinearLayoutManager(this));
        merChantAdapter = new MerChantAdapter(this, list);
        merchant_rv.setAdapter(merChantAdapter);
        merChantAdapter.setItemClisklistener(this);

    }

    @Override
    public void merChantDetialShow(MerChantDetials merChantDetials) {

    }

    @Override
    public void merChantShoppingShow(List<Shopping> list) {

    }

    @Override
    public void onItemClick(View view, MerChant merChant, int position) {
        startActiviys(MerChantDetialsActivity.class);
    }
}
