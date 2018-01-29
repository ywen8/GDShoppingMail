package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.Map;

import okhttp3.ResponseBody;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

public class LoginContract {

    public interface LoginView extends BaseContract.IBaseView {
        Map<String, String> geMap();

        void loginResult(ResponseBody res);
    }

    public interface LoginPresenter extends BaseContract.IBasePresenter {

        void login(Map<String, String> map);

    }

    public interface LoginModel extends BaseContract.IBaseModule {

        void login(Map<String, String> map, LoginView view);
    }

}
