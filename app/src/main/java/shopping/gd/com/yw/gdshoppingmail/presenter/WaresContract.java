package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.model.WaresType;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/16.
 */

public class WaresContract {

    public interface WaresView extends BaseContract.IBaseView {

        void waresReveal(List<Shopping> list);

    }

    public interface WaresDetailsView extends BaseContract.IBaseView {

        void waresDetialShow(Shopping shopping);

        void waresDetialTypeShow(List<WaresType> list);

        void waresDetialEvaluteShow(List<Evlaute> list);
    }

    public interface WaresPresenter extends BaseContract.IBasePresenter {

        void getWares();


    }

    public interface WaresDetialsPresenter extends BaseContract.IBasePresenter {
        void getWaresDetial();

        void getWaresDetialType();

        void getwaresDetialEvalutes();
    }

    public interface WaresModel extends BaseContract.IBaseModule {

        void loadWares(WaresView view);

        void loadwaresDetial(WaresDetailsView view);

        void loadwaresDetialType(WaresDetailsView view);

        void getwaresDetialEvalutes(WaresDetailsView view);
    }
}
