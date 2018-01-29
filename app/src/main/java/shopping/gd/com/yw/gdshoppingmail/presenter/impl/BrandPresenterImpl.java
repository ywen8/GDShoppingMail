package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.BrandContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.BrandModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.brand.BrandActivity;

/**
 * Created by yw on 2018/1/15.
 */

public class BrandPresenterImpl extends BasePresenter<BrandModelImpl, BrandActivity> implements BrandContract.BrandPresenter {
    @Override
    public void getBrands() {
        model.loadBrands(view);
    }
}
