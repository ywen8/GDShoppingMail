package shopping.gd.com.yw.gdshoppingmail.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import shopping.gd.com.yw.commonlib.view.DialogLoading;


/**
 * author : Rain
 * time : 2017/10/17 0017
 * explain : 基于fragmentUI的基类
 */

public abstract class BaseAppFragment<P extends BasePresenter> extends Fragment implements BaseContract.IBaseView {
    private FragmentActivity activity;

    public P presenter;

    public DialogLoading loading;

    private View parentView;
    // 标志位 标志已经初始化完成。
    protected boolean isPrepared;

    //标志位 fragment是否可见
    protected boolean isVisible;
    public Unbinder bind;
    public static final String TAG = "============";

    public abstract
    @LayoutRes
    int getLayoutResId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        parentView = inflater.inflate(getLayoutResId(), container, false);
        presenter = initPresenter();
        if (presenter != null) {
            presenter.attatchWindow(initModule(), this);
        }
        activity = getSupportActivity();
        loading = new DialogLoading(activity);
        initView(parentView);
        return parentView;
    }

    protected abstract void initView(View parentView);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bind = ButterKnife.bind(this, view);
        finishCreateView(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (FragmentActivity) activity;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
        }
    }

    protected void onVisible() {
        lazyLoad();
    }

    protected void lazyLoad() {
    }

    protected abstract P initPresenter();

    protected abstract BaseModule initModule();

    @Override
    public void onDetach() {
        super.onDetach();
        this.activity = null;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bind.unbind();
        presenter.detachWindow();
    }

    public abstract void finishCreateView(Bundle bundle);

    public FragmentActivity getSupportActivity() {
        return super.getActivity();
    }

    public <T extends View> T $(int id) {
        return (T) parentView.findViewById(id);
    }

    public void startActiviys(Class c) {
        Intent intent = new Intent(getActivity(), c);
        startActivity(intent);
    }

    public void startActiviys(Class c, int type) {
        Intent intent = new Intent(getActivity(), c);
        intent.putExtra("type", type);
        startActivity(intent);
    }
}
