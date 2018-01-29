package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Classify;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.ClassifyContract;

public class ClassifyModelImpl extends BaseModule implements ClassifyContract.ClassifyModel {
    private Context mContext;

    public ClassifyModelImpl(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public void loadleftData(ClassifyContract.ClassifyView view) {
        List<Classify> list = new ArrayList<Classify>();
        for (int i = 0; i < 6; i++) {
            Classify classify = new Classify();
            classify.name = "酒水饮料";
            list.add(classify);
        }
        view.showleftData(list);
    }

    @Override
    public void loadrightData(ClassifyContract.ClassifyView view) {
        List<Shopping> shoppings = new ArrayList<Shopping>();
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
        view.showrightData(shoppings);
    }
}
