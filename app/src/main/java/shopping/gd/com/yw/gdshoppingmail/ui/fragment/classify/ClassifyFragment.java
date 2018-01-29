package shopping.gd.com.yw.gdshoppingmail.ui.fragment.classify;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import shopping.gd.com.yw.domain.model.Classify;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.ClassifyContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.ClassifyPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.ClassifyModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.ClassifyLeftAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.ClassifyRightAdapter;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;

public class ClassifyFragment extends BaseAppFragment<ClassifyPresenterImpl> implements ClassifyContract.ClassifyView {

    @BindView(R.id.fm_classify_rv_left)
    RecyclerView classify_left_rv;

    @BindView(R.id.fm_classify_rv_right)
    RecyclerView classify_right_rv;

    ClassifyLeftAdapter classifyLeftAdapter;

    ClassifyRightAdapter classifyRightAdapter;


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
    public int getLayoutResId() {
        return R.layout.fm_classify;
    }

    @Override
    protected void initView(View parentView) {

    }

    @Override
    protected ClassifyPresenterImpl initPresenter() {
        return new ClassifyPresenterImpl();
    }

    public static ClassifyFragment newInstance() {
        return new ClassifyFragment();
    }

    @Override
    protected BaseModule initModule() {
        return new ClassifyModelImpl(getActivity());
    }

    @Override
    public void finishCreateView(Bundle bundle) {

    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getleftData();
        presenter.getrightData();
    }

    @Override
    public void showleftData(List<Classify> list) {
        classify_left_rv.setNestedScrollingEnabled(false);
        classify_left_rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        classifyLeftAdapter = new ClassifyLeftAdapter(getActivity(), list);
        classify_left_rv.setAdapter(classifyLeftAdapter);
    }

    @Override
    public void showrightData(List<Shopping> list) {
        classify_right_rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        classify_right_rv.setNestedScrollingEnabled(false);
        classifyRightAdapter = new ClassifyRightAdapter(getActivity(), list);
        classify_right_rv.setAdapter(classifyRightAdapter);
    }
}
