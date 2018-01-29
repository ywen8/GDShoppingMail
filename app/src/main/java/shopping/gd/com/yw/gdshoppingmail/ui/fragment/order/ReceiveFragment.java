package shopping.gd.com.yw.gdshoppingmail.ui.fragment.order;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import shopping.gd.com.yw.domain.model.Order;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.ReceiveOrderPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.OrderAdapter;

/**
 * Created by yw on 2018/1/18.
 */

public class ReceiveFragment extends BaseAppFragment<ReceiveOrderPresenterImpl> implements OrderContract.ReceiveOrderView {

    @BindView(R.id.fm_own_order)
    RecyclerView ownorder_rv;
    OrderAdapter adapter;

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
    public void receiveOrderShow(List<Order> list) {
        ownorder_rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new OrderAdapter(getActivity(), list);
        ownorder_rv.setAdapter(adapter);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fm_ownorder;
    }

    @Override
    protected void initView(View parentView) {

    }

    @Override
    protected ReceiveOrderPresenterImpl initPresenter() {
        return new ReceiveOrderPresenterImpl();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getReceiveOrder();
    }

    @Override
    protected BaseModule initModule() {
        return new OrderModelImpl();
    }

    @Override
    public void finishCreateView(Bundle bundle) {

    }
}
