package shopping.gd.com.yw.commonlib.utils;


import android.content.Context;
import android.util.Log;

import java.util.logging.Logger;

import okhttp3.logging.HttpLoggingInterceptor;


/**
 * @Description 全局Crash捕获处理
 * @Author Micky Liu
 * @Email sglazelhw@126.com
 * @Date 2015-04-03 下午 1:43
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

    public final HttpLoggingInterceptor.Logger mLogger = (HttpLoggingInterceptor.Logger) Logger.getLogger(getClass().getName());

    private static CrashHandler INSTANCE = new CrashHandler();
    private Thread.UncaughtExceptionHandler mDefaultUEH;
    private Context mContext;

    private CrashHandler() {
        mDefaultUEH = Thread.getDefaultUncaughtExceptionHandler();
    }

    public static CrashHandler getInstance() {
        return INSTANCE;
    }

    public void init(Context ctx) {
        Thread.setDefaultUncaughtExceptionHandler(this);
        mContext = ctx;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Log.e("CrashHandler", ex.getMessage(), ex);
        mDefaultUEH.uncaughtException(thread, ex);
    }

}
