package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Address;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.AddressContract;

/**
 * Created by yw on 2018/1/19.
 */

public class AddressModelImpl extends BaseModule implements AddressContract.AddressModel {
    @Override
    public void loadAddress(AddressContract.AddressView view) {
        List<Address> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Address address = new Address();
            address.address = "西安市新城区新城广场";
            address.name = "王宏伟";
            address.phone = "1868888888";
            list.add(address);
        }
        view.addressShow(list);
    }
}
