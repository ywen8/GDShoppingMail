package shopping.gd.com.yw.gdshoppingmail.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by yw on 2018/1/14.
 */

public class ScrollviewPager extends ViewPager {
    public ScrollviewPager(Context context) {
        super(context);
    }

    public ScrollviewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
