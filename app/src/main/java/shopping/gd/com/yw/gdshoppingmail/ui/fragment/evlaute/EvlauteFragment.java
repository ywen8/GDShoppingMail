package shopping.gd.com.yw.gdshoppingmail.ui.fragment.evlaute;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.EvlautePresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.EvaluateContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.EvlauteModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.WaresEvluateAdapter;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class EvlauteFragment extends BaseAppFragment<EvlautePresenterImpl> implements EvaluateContract.EvlauteView {
    @BindView(R.id.fm_evlaute_rv)
    RecyclerView evlaute_rv;

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
    public void evaluateShow(List<Evlaute> list) {
        evlaute_rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        evlaute_rv.setNestedScrollingEnabled(false);
        evluateAdapter = new WaresEvluateAdapter(getActivity(), list);
        evlaute_rv.setAdapter(evluateAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getEvlautes();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fm_evlaute;
    }

    @Override
    protected void initView(View parentView) {

    }

    @Override
    protected EvlautePresenterImpl initPresenter() {
        return new EvlautePresenterImpl();
    }

    @Override
    protected BaseModule initModule() {
        return new EvlauteModelImpl(getActivity());
    }

    @Override
    public void finishCreateView(Bundle bundle) {

    }
}
