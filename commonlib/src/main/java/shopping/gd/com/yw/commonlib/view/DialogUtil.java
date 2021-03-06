package shopping.gd.com.yw.commonlib.view;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import shopping.gd.com.yw.commonlib.R;


/**
 * Created by Rain on 2017/6/6 0006.
 */

public class DialogUtil {

    public static TextView tv_data, tv_cancle, tv_sure;
    private static Dialog dialog;
    private static ImageView iv_dialog_hint;

    public static void dialog(AppCompatActivity activity, String text) {
        dialog = new Dialog(activity, R.style.MyDialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        View view = LayoutInflater.from(activity).inflate(R.layout.dialog_layout, null);
        tv_data = (TextView) view.findViewById(R.id.tv_data);
        tv_cancle = (TextView) view.findViewById(R.id.tv_cancle);
        tv_sure = (TextView) view.findViewById(R.id.tv_sure);
        tv_sure.setVisibility(View.GONE);
        tv_cancle.setBackgroundResource(R.drawable.textview_dialog_back_below);
        tv_data.setText(text);
        WindowManager wm = activity.getWindowManager();
        int mWeight = wm.getDefaultDisplay().getWidth();
        dialog.setContentView(view, new ViewGroup.LayoutParams((int) (mWeight * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT));
        dialog.show();
    }


    public static void dialogColor(AppCompatActivity activity, String text) {
        dialog = new Dialog(activity, R.style.MyDialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        View view = LayoutInflater.from(activity).inflate(R.layout.dialog_layout, null);
        tv_data = (TextView) view.findViewById(R.id.tv_data);
        tv_cancle = (TextView) view.findViewById(R.id.tv_cancle);
        tv_sure = (TextView) view.findViewById(R.id.tv_sure);
        tv_cancle.setVisibility(View.GONE);
        tv_data.setTextColor(activity.getResources().getColor(R.color.login_select_no));
        tv_sure.setBackgroundResource(R.drawable.textview_dialog_back_below);
        tv_data.setText(text);
        WindowManager wm = activity.getWindowManager();
        int mWeight = wm.getDefaultDisplay().getWidth();
        dialog.setContentView(view, new ViewGroup.LayoutParams((int) (mWeight * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT));
        dialog.show();
    }

    public static void deleteDialog(AppCompatActivity activity, String text) {
        dialog = new Dialog(activity, R.style.MyDialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        View view = LayoutInflater.from(activity).inflate(R.layout.dialog_layout, null);
        tv_data = (TextView) view.findViewById(R.id.tv_data);
        tv_cancle = (TextView) view.findViewById(R.id.tv_cancle);
        tv_sure = (TextView) view.findViewById(R.id.tv_sure);
        tv_cancle.setBackgroundResource(R.drawable.textview_dialog_back_below);
        tv_data.setText(text);
        tv_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        WindowManager wm = activity.getWindowManager();
        int mWeight = wm.getDefaultDisplay().getWidth();
        dialog.setContentView(view, new ViewGroup.LayoutParams((int) (mWeight * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT));
        dialog.show();
    }

    public static void ErrorDilog(Activity activity, String text) {
        dialog = new Dialog(activity, R.style.MyDialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(true);
        View view = LayoutInflater.from(activity).inflate(R.layout.dialog_hint, null);
        tv_data = (TextView) view.findViewById(R.id.tv_data);
        tv_data.setText(text);
        WindowManager wm = activity.getWindowManager();
        int mWeight = wm.getDefaultDisplay().getWidth();
        dialog.setContentView(view, new ViewGroup.LayoutParams((int) (mWeight * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT));
        dialog.show();
    }

    /**
     * 提示
     *
     * @param activity
     * @param text
     */
    public static void hintDilog(AppCompatActivity activity, String text) {
        dialog = new Dialog(activity, R.style.MyDialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(true);
        View view = LayoutInflater.from(activity).inflate(R.layout.dialog_hint_success, null);
        tv_data = (TextView) view.findViewById(R.id.tv_data);
        tv_sure = (TextView) view.findViewById(R.id.tv_sure);
        iv_dialog_hint = (ImageView) view.findViewById(R.id.iv_dialog_hint);
        tv_data.setText(text);
        iv_dialog_hint.setImageResource(R.drawable.success_yuyue);
        WindowManager wm = activity.getWindowManager();
        int mWeight = wm.getDefaultDisplay().getWidth();
        dialog.setContentView(view, new ViewGroup.LayoutParams((int) (mWeight * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT));
        dialog.show();
    }


    public static void dismissDialog() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static ImageView getIv_dialog_hint() {
        return iv_dialog_hint;
    }

    public static void setIv_dialog_hint(ImageView iv_dialog_hint) {
        DialogUtil.iv_dialog_hint = iv_dialog_hint;
    }

    public static TextView getTv_data() {
        return tv_data;
    }

    public static void setTv_data(TextView tv_data) {
        DialogUtil.tv_data = tv_data;
    }

    public static TextView getTv_cancle() {
        return tv_cancle;
    }

    public static void setTv_cancle(TextView tv_cancle) {
        DialogUtil.tv_cancle = tv_cancle;
    }

    public static TextView getTv_sure() {
        return tv_sure;
    }

    public static void setTv_sure(TextView tv_sure) {
        DialogUtil.tv_sure = tv_sure;
    }
}
