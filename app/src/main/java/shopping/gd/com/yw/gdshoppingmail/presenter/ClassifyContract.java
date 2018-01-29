package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Classify;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

public class ClassifyContract {

    public interface ClassifyView extends BaseContract.IBaseView {

        void showleftData(List<Classify> list);

        void showrightData(List<Shopping> list);

    }


    public interface ClassifyPresenter extends BaseContract.IBasePresenter {

        void getleftData();

        void getrightData();

    }


    public interface ClassifyModel extends BaseContract.IBaseModule {

        void loadleftData(ClassifyView view);

        void loadrightData(ClassifyView view);
    }
}
