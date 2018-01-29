package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;

/**
 * Created by yw on 2018/1/17.
 */

public class EvlauteModelImpl extends BaseModule implements EvaluateContract.EvlauteModel {
    private Context mContext;

    public EvlauteModelImpl(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void loadEvlaute(EvaluateContract.EvlauteView view) {
        List<Evlaute> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Evlaute evlaute = new Evlaute();
            evlaute.name = "嘿嘿";
            evlaute.message = "给老妈买的电视收到了，挺满意物流挺快的服务好，安装费也不高";
            list.add(evlaute);
        }
        view.evaluateShow(list);
    }
}
