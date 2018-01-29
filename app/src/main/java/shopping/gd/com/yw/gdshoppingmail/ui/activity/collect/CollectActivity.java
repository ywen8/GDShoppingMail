package shopping.gd.com.yw.gdshoppingmail.ui.activity.collect;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.Collect;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.CollectContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.CollectPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.CollectModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.CollectAdapter;

/**
 * Created by yw on 2018/1/19.
 */

public class CollectActivity extends BaseActivity<CollectPresenterImpl> implements CollectContract.CollectView {
    @BindView(R.id.activity_collect_rv)
    RecyclerView collect_rv;
    CollectAdapter adapter;


    @Override
    protected CollectPresenterImpl initPresent() {
        return new CollectPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new CollectModelImpl();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getCollect();
    }

    @Override
    public void collectShow(List<Collect> list) {
        collect_rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CollectAdapter(this, list);
        collect_rv.setAdapter(adapter);
    }
}
