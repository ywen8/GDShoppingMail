package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.BrandClassify;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/15.
 */

public class BrandContract {

    public interface BrandView extends BaseContract.IBaseView {
        void barndsShow(List<BrandClassify> list);

    }

    public interface BrandPresenter extends BaseContract.IBasePresenter {
        void getBrands();
    }

    public interface BrandModel extends BaseContract.IBaseModule {

        void loadBrands(BrandView view);
    }
}
