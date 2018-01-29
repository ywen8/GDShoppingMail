package shopping.gd.com.yw.gdshoppingmail.ui.fragment.shopping;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;
import shopping.gd.com.yw.domain.model.ShoppingCar;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.ShoppingContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.ShoppingPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.ShoppingModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.order.OrderActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.ShoppingAdater;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;

public class ShoppingCarFragment extends BaseAppFragment<ShoppingPresenterImpl> implements ShoppingContract.ShoppingView {

    @BindView(R.id.rv_list)
    RecyclerView shopping_reclView;

    @BindView(R.id.fm_shopping_title_del)
    Button shopping_del_btn;

    @BindView(R.id.fm_shopping_go_pay)
    Button shopping_go_pay;

    private boolean isDel;

    private ShoppingAdater shoppingAdater;

    @Override
    public int getLayoutResId() {
        return R.layout.fm_shopping;
    }

    @Override
    protected void initView(View parentView) {

    }

    @OnClick(R.id.fm_shopping_title_del)
    void shoppingdel() {
        isDel = true;
        presenter.loadShoppingCarData();
    }

    @OnClick(R.id.fm_shopping_go_pay)
    void shoppingpay() {
            startActiviys(OrderActivity.class);
    }

    @Override
    protected ShoppingPresenterImpl initPresenter() {
        return new ShoppingPresenterImpl();
    }

    @Override
    protected BaseModule initModule() {
        return new ShoppingModelImpl(getActivity());
    }

    @Override
    public void finishCreateView(Bundle bundle) {

    }


    @Override
    public void onResume() {
        super.onResume();
        presenter.loadShoppingCarData();
        presenter.loadTotalPrice();
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    public static ShoppingCarFragment newInstance() {
        return new ShoppingCarFragment();
    }


    @Override
    public void showShoppingCar(ShoppingCar shoppingCar) {
        shoppingCar.isDel = isDel;
        shopping_reclView.setLayoutManager(new LinearLayoutManager(getActivity()));
        shoppingAdater = new ShoppingAdater(getActivity(), shoppingCar);
        shopping_reclView.setAdapter(shoppingAdater);
        shopping_reclView.setHasFixedSize(true);
    }

    @Override
    public void showTotalPrice(ShoppingCar shoppingCar) {

    }
}
