package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Integral;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/18.
 */

public class IntegralContract {

    public interface IntegralView extends BaseContract.IBaseView {

        void integralShow(Integral integral);

        void integralRecordShow(List<Integral> list);

    }

    public interface IntegralPresenter extends BaseContract.IBasePresenter {
        void getIntegral();

        void getIntegralRecord();
    }

    public interface IntegralModel extends BaseContract.IBaseModule {
        void loadIntegral(IntegralView view);

        void loadIntegralRecord(IntegralView view);
    }
}
