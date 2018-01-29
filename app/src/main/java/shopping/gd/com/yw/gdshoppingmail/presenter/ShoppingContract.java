package shopping.gd.com.yw.gdshoppingmail.presenter;

import shopping.gd.com.yw.domain.model.ShoppingCar;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

public class ShoppingContract {

    public interface ShoppingView extends BaseContract.IBaseView {


        void showShoppingCar(ShoppingCar shoppingCar);

        void showTotalPrice(ShoppingCar shoppingCar);


    }

    public interface ShoppingPresent extends BaseContract.IBasePresenter {

        void loadTotalPrice();

        void loadShoppingCarData();
    }

    public interface ShoppingModel extends BaseContract.IBaseModule {

        void takeShoppingCarData(ShoppingView view);

        void takeTotalPrice(ShoppingView view);
    }
}
