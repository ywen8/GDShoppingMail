package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Collect;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.CollectContract;

/**
 * Created by yw on 2018/1/19.
 */

public class CollectModelImpl extends BaseModule implements CollectContract.CollectModel {

    @Override
    public void loadCollect(CollectContract.CollectView view) {
        List<Collect> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Collect collect = new Collect();
            Shopping shopping = new Shopping();
            shopping.imageUrl = "/background/img/logo.png";
            shopping.details = "【买即送体验包装4包+精美茶具一套】送礼自饮皆宜 香气浓郁口";
            shopping.name = "新会陈皮普洱熟茶叶";
            shopping.price = "¥168.0";
            shopping.discount = "¥105.00";
            shopping.number = 1;
            collect.shopping = shopping;
            collect.time = "2017年/12月/12日";
            list.add(collect);
        }
        view.collectShow(list);

    }
}
