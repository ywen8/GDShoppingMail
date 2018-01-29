package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Order;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.OrderContract;

/**
 * Created by yw on 2018/1/17.
 */

public class OrderModelImpl extends BaseModule implements OrderContract.OrderModel {
    List<Order> list = new ArrayList<>();

    @Override
    public void loadOrder(OrderContract.OrderView view) {
        Order order = new Order();
        order.discounts = "¥60";
        order.name = "王某某";
        order.phone = "1231312313";
        order.address = "jdlsafjssfjlsjf sa";
        Shopping shopping = new Shopping();
        shopping.discount = "1990";
        shopping.price = "3862";
        shopping.name = "SkyWorth/创维 42X5 英寸 智能";
        shopping.details = "超高清";
        order.shopping = shopping;
        view.orderShow(order);
    }

    @Override
    public void loadOwnOrder(OrderContract.OwnOrderView view) {
        getorder();
        view.ownOrderShow(list);
    }

    @Override
    public void loadObligationOrder(OrderContract.OBligationOrderView view) {
        getorder();
        view.obligationOrderShow(list);
    }

    @Override
    public void loadConsignOrder(OrderContract.ConsignOrderView view) {
        getorder();
        view.consignOrderShow(list);
    }

    @Override
    public void loadReceiveOrder(OrderContract.ReceiveOrderView view) {
        getorder();
        view.receiveOrderShow(list);
    }

    @Override
    public void loadRefundOrder(OrderContract.RefundOrderView view) {
        getorder();
        view.refundOrderShow(list);
    }

    @Override
    public void loadOwnFinishOrder(OrderContract.OwnFinishOrderView view) {
        getorder();
        view.OwnFinishOrderShow(list);
    }

    private void getorder() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.discounts = "¥60";
            order.name = "王某某";
            order.phone = "1231312313";
            order.address = "jdlsafjssfjlsjf sa";
            Shopping shopping = new Shopping();
            shopping.discount = "1990";
            shopping.price = "3862";
            shopping.name = "SkyWorth/创维 42X5 英寸 智能";
            shopping.details = "超高清";
            order.shopping = shopping;
            list.add(order);
        }
    }
}
