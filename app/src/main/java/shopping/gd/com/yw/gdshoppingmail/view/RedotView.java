package shopping.gd.com.yw.gdshoppingmail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import shopping.gd.com.yw.gdshoppingmail.R;

public class RedotView extends View {
    Paint paint;
    int dotSize;
    int current;
    private int viewH;

    private int viewW;

    public RedotView(Context context) {
        this(context, null, 0);
    }

    public RedotView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RedotView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        paint.setStrokeWidth(3);
        paint.setColor(getResources().getColor(R.color.fm_banner_reddot));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);

    }

    public void setWidthAndHeight(int viewW,int viewH){
        this.viewW=viewW;
        this.viewH=viewH;
    }
    public void setdotSize(int dotSize) {
        this.dotSize = dotSize;
    }

    public void setcurrent(int current) {
        this.current = current;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < dotSize; i++) {
            if (i == current) {
                paint.setStyle(Paint.Style.FILL);
            } else {
                paint.setStyle(Paint.Style.STROKE);
            }
            canvas.drawCircle((viewW-(15 * 2 * dotSize + 4 * 15))/2+i * 15 * 2 -10+i*15, viewH, 15, paint);
        }

    }
}
