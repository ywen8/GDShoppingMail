package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.MerChant;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.MerChantContract;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantModelImpl extends BaseModule implements MerChantContract.MerChantModel {
    private Context mContext;

    public MerChantModelImpl(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void loadMerChant(MerChantContract.MerChantView view) {
        List<MerChant> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MerChant merChant = new MerChant();
            merChant.name = "商家名称A";
            merChant.detials = "主营项目1 项目A 项目B 项目C";
            list.add(merChant);
        }
        view.merChantShow(list);
    }

    @Override
    public void loadMerChantDetial(MerChantContract.MerChantView view) {

    }

    @Override
    public void loadMerChantShoppongs(MerChantContract.MerChantView view) {
        List<Shopping> shoppings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Shopping shopping = new Shopping();
            shopping.details = "【买即送体验包装4包+精美茶具一套】送礼自饮皆宜 香气浓郁口";
            shopping.name = "新会陈皮普洱茶熟茶叶";
            shopping.price = "1231-1231";
            shopping.discount = "1231-131";
            shoppings.add(shopping);
        }
        view.merChantShoppingShow(shoppings);

    }


}
