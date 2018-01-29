package shopping.gd.com.yw.gdshoppingmail.presenter;

import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

public class RegisterContract {

    public interface RegisterView extends BaseContract.IBaseView {


    }

    public interface RegisterSendMessagePresenter extends BaseContract.IBasePresenter {

        void sendMessage(String phone);

    }

    public interface RegisterSubmitPresenter extends BaseContract.IBasePresenter {

        void registersubmit();

    }

    public interface RegisterUpdatePresenter extends BaseContract.IBasePresenter {

        void updatePassword();
    }

    public interface RegisterModel extends BaseContract.IBaseModule {

        void sendMessage(String phone, RegisterView registerView);

        void registersubmit(RegisterView registerView);

        void updatePassword(RegisterView registerView);
    }

}
