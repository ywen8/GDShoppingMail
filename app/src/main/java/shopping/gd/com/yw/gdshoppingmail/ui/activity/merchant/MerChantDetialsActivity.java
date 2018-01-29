package shopping.gd.com.yw.gdshoppingmail.ui.activity.merchant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

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
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.MerChantDetialPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.MerChantModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.MerChantDetialsAdapter;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantDetialsActivity extends BaseActivity<MerChantDetialPresenterImpl> implements MerChantContract.MerChantView, MerChantDetialsAdapter.ShoppingOnclickListener {
    @BindView(R.id.activity_merchant_detial_rv)
    RecyclerView merchant_detial_rv;

    private MerChantDetialsAdapter merChantDetialsAdapter;

    @Override
    public void merChantShow(List<MerChant> list) {

    }

    @Override
    public void merChantDetialShow(MerChantDetials merChantDetials) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getMerChantShoppings();
    }

    @Override
    public void merChantShoppingShow(List<Shopping> list) {
        merchant_detial_rv.setLayoutManager(new LinearLayoutManager(this));
        merChantDetialsAdapter = new MerChantDetialsAdapter(this, list);
        merchant_detial_rv.setAdapter(merChantDetialsAdapter);
        merChantDetialsAdapter.setShoppingOnclickListener(this);
    }


    @Override
    protected BaseModule initModel() {
        return new MerChantModelImpl(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant_detials);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    protected MerChantDetialPresenterImpl initPresent() {
        return new MerChantDetialPresenterImpl();
    }

    @Override
    public void shoppingClick(View v, Shopping shopping, int position) {

    }
}
