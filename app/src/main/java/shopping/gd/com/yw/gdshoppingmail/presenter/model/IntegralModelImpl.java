package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Integral;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.IntegralContract;

/**
 * Created by yw on 2018/1/18.
 */

public class IntegralModelImpl extends BaseModule implements IntegralContract.IntegralModel {
    @Override
    public void loadIntegral(IntegralContract.IntegralView view) {
        Integral integral = new Integral();
        integral.score = 1685;
        view.integralShow(integral);
    }

    @Override
    public void loadIntegralRecord(IntegralContract.IntegralView view) {
        List<Integral> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Integral integral = new Integral();
            integral.record = "4";
            integral.time="2018/1/10";
            list.add(integral);
        }
        view.integralRecordShow(list);
    }
}
