package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Order;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/17.
 */

public class OrderContract {

    public interface OrderView extends BaseContract.IBaseView {
        void orderShow(Order order);
    }

    public interface OwnOrderView extends BaseContract.IBaseView {
        void ownOrderShow(List<Order> list);
    }

    public interface OBligationOrderView extends BaseContract.IBaseView {
        void obligationOrderShow(List<Order> list);
    }

    public interface ConsignOrderView extends BaseContract.IBaseView {
        void consignOrderShow(List<Order> list);
    }

    public interface ReceiveOrderView extends BaseContract.IBaseView {
        void receiveOrderShow(List<Order> list);
    }

    public interface RefundOrderView extends BaseContract.IBaseView {
        void refundOrderShow(List<Order> list);
    }

    public interface OwnFinishOrderView extends BaseContract.IBaseView {
        void OwnFinishOrderShow(List<Order> list);
    }

    public interface OrderPresenter extends BaseContract.IBasePresenter {
        void getOrder();
    }

    public interface OwnOrderPresenter extends BaseContract.IBasePresenter {
        void getOwnOrder();
    }

    public interface OBligationOrderPresenter extends BaseContract.IBasePresenter {
        void getObligationOrder();
    }

    public interface ConsignOrderPresenter extends BaseContract.IBasePresenter {
        void getConsignOrder();
    }

    public interface ReceiveOrderPresenter extends BaseContract.IBasePresenter {
        void getReceiveOrder();
    }

    public interface RefundOrderPresenter extends BaseContract.IBasePresenter {
        void getRefundOrder();
    }

    public interface OwnFinishOrderPresenter extends BaseContract.IBasePresenter {
        void getOwnFinishOrder();
    }

    public interface OrderModel extends BaseContract.IBaseModule {
        void loadOrder(OrderView view);

        void loadOwnOrder(OwnOrderView view);

        void loadObligationOrder(OBligationOrderView view);

        void loadConsignOrder(ConsignOrderView view);

        void loadReceiveOrder(ReceiveOrderView view);

        void loadRefundOrder(RefundOrderView view);

        void loadOwnFinishOrder(OwnFinishOrderView view);
    }
}
