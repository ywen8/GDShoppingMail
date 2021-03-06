package shopping.gd.com.yw.gdshoppingmail.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class MyRecyClerView extends RecyclerView {
    public MyRecyClerView(Context context) {
        super(context);
    }

    public MyRecyClerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyClerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int height = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthSpec, height);

    }
}
