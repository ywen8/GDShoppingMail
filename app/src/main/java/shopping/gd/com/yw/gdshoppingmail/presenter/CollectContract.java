package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.Collect;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/19.
 */

public class CollectContract {

    public interface CollectView extends BaseContract.IBaseView {

        void collectShow(List<Collect> list);
    }

    public interface CollectPresenter extends BaseContract.IBasePresenter {

        void getCollect();

    }

    public interface CollectModel extends BaseContract.IBaseModule {
        void loadCollect(CollectView view);
    }
}
