package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.Map;

import okhttp3.ResponseBody;
import shopping.gd.com.yw.domain.http.BaseSubscriber;
import shopping.gd.com.yw.domain.http.ExceptionHandle;
import shopping.gd.com.yw.domain.http.RetrofitClient;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.LoginContract;

public class LoginModelImpl extends BaseModule implements LoginContract.LoginModel {

    private Context mContext;

    public LoginModelImpl(Context context) {
        this.mContext = context;
    }


    @Override
    public void login(Map<String, String> map, LoginContract.LoginView view) {
        RetrofitClient.getInstance(mContext).createBaseApi().login(map, new BaseSubscriber<ResponseBody>(mContext) {
            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {
                Log.i("---11---",e.toString()+"------");
            }

            @Override
            public void onCompleted() {
                super.onCompleted();
            }

            @Override
            public void onNext(ResponseBody responseBody) {
                super.onNext(responseBody);
                try {
                    Log.i("------",responseBody.string().toString()+"------");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
