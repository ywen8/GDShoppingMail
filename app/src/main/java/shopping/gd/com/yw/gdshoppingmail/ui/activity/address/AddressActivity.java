package shopping.gd.com.yw.gdshoppingmail.ui.activity.address;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Address;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.AddressContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.AddressPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.AddressModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.site.AddSiteActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.AddressAdapter;
import shopping.gd.com.yw.gdshoppingmail.view.FullyLinearLayoutManager;

/**
 * Created by yw on 2018/1/19.
 */


public class AddressActivity extends BaseActivity<AddressPresenterImpl> implements AddressContract.AddressView {
    @BindView(R.id.activity_address_rv)
    RecyclerView address_rv;

    @OnClick(R.id.activity_address_add)
    void address_add() {
        startActiviys(AddSiteActivity.class);
    }

    AddressAdapter adapter;

    @Override
    public void addressShow(List<Address> list) {
        address_rv.setNestedScrollingEnabled(false);
        address_rv.setLayoutManager(new FullyLinearLayoutManager(this));
        adapter = new AddressAdapter(this, list);
        address_rv.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getAddress();
    }

    @Override
    protected AddressPresenterImpl initPresent() {
        return new AddressPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new AddressModelImpl();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }
}
