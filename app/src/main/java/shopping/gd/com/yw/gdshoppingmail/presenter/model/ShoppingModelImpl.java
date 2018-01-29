package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.model.ShoppingCar;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.ShoppingContract;

public class ShoppingModelImpl extends BaseModule implements ShoppingContract.ShoppingModel {

    private Context mContext;
    private ShoppingCar shoppingCar;

    public ShoppingModelImpl(Context context) {
        this.mContext = context;

        shoppingCar = new ShoppingCar();
    }

    @Override
    public void takeShoppingCarData(ShoppingContract.ShoppingView view) {
        List<Shopping> shoppings=new ArrayList<Shopping>();
        for (int i = 0; i < 10; i++) {
            Shopping shop = new Shopping();
            shop.imageUrl = "/background/img/logo.png";
            shop.details = "【买即送体验包装4包+精美茶具一套】送礼自饮皆宜 香气浓郁口";
            shop.name = "新会陈皮普洱熟茶叶";
            shop.price = "¥168.0";
            shop.discount = "¥105.00";
            shop.number = 1;
            shoppings.add(shop);
        }
        shoppingCar.shoppings=shoppings;
        shoppingCar.sum = 12;
        shoppingCar.totalprice = 2658.50;
        view.showShoppingCar(shoppingCar);
    }

    @Override
    public void takeTotalPrice(ShoppingContract.ShoppingView view) {
        view.showTotalPrice(shoppingCar);
    }
}
