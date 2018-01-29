package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.MerChant;
import shopping.gd.com.yw.domain.model.MerChantDetials;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantContract {

    public interface MerChantView extends BaseContract.IBaseView {

        void merChantShow(List<MerChant> list);

        void merChantDetialShow(MerChantDetials merChantDetials);

        void merChantShoppingShow(List<Shopping> list);
    }


    public interface MerChantPresenter extends BaseContract.IBasePresenter {
        void getMerChant();

        void getMerChantDetails();

        void getMerChantShoppings();

    }

    public interface MerChantModel extends BaseContract.IBaseModule {
        void loadMerChant(MerChantView view);

        void loadMerChantDetial(MerChantView view);

        void loadMerChantShoppongs(MerChantView view);
    }
}
