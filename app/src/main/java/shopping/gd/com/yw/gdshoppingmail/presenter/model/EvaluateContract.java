package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import java.util.List;

import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/17.
 */

public class EvaluateContract {

    public interface EvlauteView extends BaseContract.IBaseView {
        void evaluateShow(List<Evlaute> list);
    }

    public interface EvlautePresenter extends BaseContract.IBasePresenter {
        void getEvlautes();
    }

    public interface EvlauteModel extends BaseContract.IBaseModule {
        void loadEvlaute(EvlauteView view);
    }
}
