package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.HomeContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.HomeModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.home.HomeFragment;

public class HomePresenterImpl extends BasePresenter<HomeModelImpl, HomeFragment> implements HomeContract.HomeBannerPresenter, HomeContract.HomeShoppingPresenter, HomeContract.HomeSpeedyPresenter {


    @Override
    public void getbanners() {
        model.loadbanner(view);

    }


    @Override
    public void getShoppings() {
        model.loadShopping(view);
    }


    @Override
    public void getSpeedy() {
        model.loadSpeedy(view);
    }
}
