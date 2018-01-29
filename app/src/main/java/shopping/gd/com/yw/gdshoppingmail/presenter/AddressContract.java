package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Address;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/19.
 */

public class AddressContract {

    public interface AddressView extends BaseContract.IBaseView {
        void addressShow(List<Address> list);
    }

    public interface AddressPresenter extends BaseContract.IBasePresenter {
        void getAddress();
    }

    public interface AddressModel extends BaseContract.IBaseModule {
        void loadAddress(AddressView view);
    }
}
