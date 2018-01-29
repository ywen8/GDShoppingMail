package shopping.gd.com.yw.gdshoppingmail.base;

/**
 * author : Rain
 * time : 2017/10/13 0013
 * explain :
 */

public class BaseContract {

    public interface IBaseModule {
    }

    public interface IBasePresenter {
    }


    public interface IBaseView {

        void showToast(String msg);
        /**
         * 显示loading框
         */
        void showProgress();

        /**
         * 隐藏loading框
         */
        void hideProgress();

    }
}
