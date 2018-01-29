package shopping.gd.com.yw.commonlib.utils;

import android.content.Context;

public class Pixel {

    public static int pxTodip(Context context, float pxValue) {

        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);

    }
}
