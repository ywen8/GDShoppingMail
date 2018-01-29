package shopping.gd.com.yw.gdshoppingmail.ui.activity.wares;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.WaresContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.WaresPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.WaresModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.MerChantDetialsAdapter;

/**
 * Created by yw on 2018/1/16.
 */

public class WaresActivity extends BaseActivity<WaresPresenterImpl> implements WaresContract.WaresView, MerChantDetialsAdapter.ShoppingOnclickListener {

    @BindView(R.id.activity_wares_rv)
    RecyclerView wares_rv;

    MerChantDetialsAdapter adapter;

    @Override
    public void waresReveal(List<Shopping> list) {
        wares_rv.setNestedScrollingEnabled(false);
        wares_rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MerChantDetialsAdapter(this, list);
        wares_rv.setAdapter(adapter);
        adapter.setShoppingOnclickListener(this);
    }

    @Override
    protected WaresPresenterImpl initPresent() {
        return new WaresPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new WaresModelImpl(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getWares();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wares);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    public void shoppingClick(View v, Shopping shopping, int position) {
        startActiviys(WaresDetialActivity.class);
    }
}
