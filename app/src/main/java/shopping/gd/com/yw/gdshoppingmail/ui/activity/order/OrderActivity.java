package shopping.gd.com.yw.gdshoppingmail.ui.activity.order;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import shopping.gd.com.yw.domain.model.Order;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.OrderPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.OrderModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;

/**
 * Created by yw on 2018/1/17.
 */

public class OrderActivity extends BaseActivity<OrderPresenterImpl> implements OrderContract.OrderView {
    @BindView(R.id.activity_order_title)
    TextView order_title;

    @BindView(R.id.activity_order_count)
    TextView order_count;

    @BindView(R.id.activity_order_discounts)
    TextView order_discounts;

    @BindView(R.id.activity_order_detial)
    TextView order_detial;

    @BindView(R.id.activity_order_phone)
    TextView order_phone;

    @BindView(R.id.activity_order_price)
    TextView order_price;

    @BindView(R.id.activity_order_sale)
    TextView order_sale;

    @BindView(R.id.order_commit)
    TextView order_commit;


    @Override
    public void orderShow(Order order) {
        order_title.setText(order.shopping.name);
    }

    @Override
    protected OrderPresenterImpl initPresent() {
        return new OrderPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new OrderModelImpl();
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getOrder();
    }

    @OnClick(R.id.order_commit)
    void topayment() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);
    }
}
