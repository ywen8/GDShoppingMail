package shopping.gd.com.yw.gdshoppingmail.ui.activity.classify;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Classify;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.ClassifyContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.ClassifyPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.ClassifyModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.ClassifyLeftAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.ClassifyRightAdapter;

/**
 * Created by yw on 2018/1/16.
 */

public class ClassifyActivity extends BaseActivity<ClassifyPresenterImpl> implements ClassifyContract.ClassifyView {


    @BindView(R.id.fm_classify_rv_left)
    RecyclerView classify_left_rv;

    @BindView(R.id.fm_classify_rv_right)
    RecyclerView classify_right_rv;

    ClassifyLeftAdapter classifyLeftAdapter;

    ClassifyRightAdapter classifyRightAdapter;

    @Override
    public void showleftData(List<Classify> list) {
        classify_left_rv.setNestedScrollingEnabled(false);
        classify_left_rv.setLayoutManager(new LinearLayoutManager(this));
        classifyLeftAdapter = new ClassifyLeftAdapter(this, list);
        classify_left_rv.setAdapter(classifyLeftAdapter);
    }

    @Override
    public void showrightData(List<Shopping> list) {
        classify_right_rv.setLayoutManager(new LinearLayoutManager(this));
        classify_right_rv.setNestedScrollingEnabled(false);
        classifyRightAdapter = new ClassifyRightAdapter(this, list);
        classify_right_rv.setAdapter(classifyRightAdapter);
    }

    @Override
    protected ClassifyPresenterImpl initPresent() {
        return new ClassifyPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new ClassifyModelImpl(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getleftData();
        present.getrightData();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fm_classify);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);

    }
}
