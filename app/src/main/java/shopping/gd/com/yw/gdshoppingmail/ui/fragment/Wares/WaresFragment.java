package shopping.gd.com.yw.gdshoppingmail.ui.fragment.Wares;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.model.WaresType;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.WaresContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.WaresDetialsPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.WaresModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.WaresEvluateAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.WaresTypeAdapter;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;
import shopping.gd.com.yw.gdshoppingmail.view.FullyGridLayoutManager;
import shopping.gd.com.yw.gdshoppingmail.view.FullyLinearLayoutManager;

/**
 * Created by yw on 2018/1/17.
 */

public class WaresFragment extends BaseAppFragment<WaresDetialsPresenterImpl> implements WaresContract.WaresDetailsView {

    @BindView(R.id.wares_shopptype_rv)
    RecyclerView shopptype_rv;
    @BindView(R.id.wares_shoppevalute_rv)
    RecyclerView shoppevalute_rv;
    WaresTypeAdapter adapter;

    WaresEvluateAdapter evluateAdapter;

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
    public void waresDetialShow(Shopping shopping) {

    }

    @Override
    public void waresDetialTypeShow(List<WaresType> list) {
        shopptype_rv.setLayoutManager(new FullyGridLayoutManager(getActivity(), 4));
        shoppevalute_rv.setNestedScrollingEnabled(false);
        adapter = new WaresTypeAdapter(getActivity(), list);
        shopptype_rv.setAdapter(adapter);
    }

    @Override
    public void waresDetialEvaluteShow(List<Evlaute> list) {
        shoppevalute_rv.setLayoutManager(new FullyLinearLayoutManager(getActivity()));
        shoppevalute_rv.setNestedScrollingEnabled(false);
        evluateAdapter = new WaresEvluateAdapter(getActivity(), list);
        shoppevalute_rv.setAdapter(evluateAdapter);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fm_wares_shopp;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getWaresDetialType();
        presenter.getwaresDetialEvalutes();
    }

    @Override
    protected void initView(View parentView) {

    }

    @Override
    protected WaresDetialsPresenterImpl initPresenter() {
        return new WaresDetialsPresenterImpl();
    }

    @Override
    protected BaseModule initModule() {
        return new WaresModelImpl(getActivity());
    }

    @Override
    public void finishCreateView(Bundle bundle) {

    }
}
