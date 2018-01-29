package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.MyContract;

public class MyModelImpl extends BaseModule implements MyContract.MyModel {
    private Context mContext;

    public MyModelImpl(Context mContext) {
        this.mContext = mContext;
    }
}
