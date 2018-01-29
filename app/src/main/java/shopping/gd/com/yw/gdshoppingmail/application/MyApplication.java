package shopping.gd.com.yw.gdshoppingmail.application;

import android.app.Application;

import shopping.gd.com.yw.domain.db.manager.BaseManager;

/**
 * Created by yw on 2018/1/18.
 */

public class MyApplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        BaseManager.initOpenHelper(this);
    }
}
