package shopping.gd.com.yw.gdshoppingmail.presenter;

import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/19.
 */

public class AddSiteContract {

    public interface AddSiteView extends BaseContract.IBaseView {

        void resultShow(String str);
    }

    public interface AddSitePresenter extends BaseContract.IBasePresenter {
        void addSite();
    }

    public interface AddSiteModel extends BaseContract.IBaseModule {
        void loadaddSite(AddSiteView view);
    }
}
