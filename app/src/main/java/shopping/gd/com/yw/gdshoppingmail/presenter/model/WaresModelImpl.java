package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.model.WaresType;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.WaresContract;

/**
 * Created by yw on 2018/1/16.
 */

public class WaresModelImpl extends BaseModule implements WaresContract.WaresModel {

    private Context mConext;

    public WaresModelImpl(Context mConext) {
        this.mConext = mConext;
    }

    @Override
    public void loadWares(WaresContract.WaresView view) {
        List<Shopping> shoppings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Shopping shopping = new Shopping();
            shopping.details = "【买即送体验包装4包+精美茶具一套】送礼自饮皆宜 香气浓郁口";
            shopping.name = "新会陈皮普洱茶熟茶叶";
            shopping.price = "1231-1231";
            shopping.discount = "1231-131";
            shoppings.add(shopping);
        }
        view.waresReveal(shoppings);
    }

    @Override
    public void loadwaresDetial(WaresContract.WaresDetailsView view) {

    }

    @Override
    public void loadwaresDetialType(WaresContract.WaresDetailsView view) {
        List<WaresType> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            WaresType waresType = new WaresType();
            waresType.name = "型号1";
            list.add(waresType);
        }
        view.waresDetialTypeShow(list);
    }

    @Override
    public void getwaresDetialEvalutes(WaresContract.WaresDetailsView view) {
        List<Evlaute> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Evlaute evlaute = new Evlaute();
            evlaute.name = "嘿嘿";
            evlaute.message = "给老妈买的电视收到了，挺满意物流挺快的服务好，安装费也不高";
            list.add(evlaute);
        }
        view.waresDetialEvaluteShow(list);
    }


}
