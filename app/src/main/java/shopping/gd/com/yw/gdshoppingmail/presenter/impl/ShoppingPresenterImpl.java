package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.ShoppingContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.ShoppingModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.shopping.ShoppingCarFragment;

public class ShoppingPresenterImpl extends BasePresenter<ShoppingModelImpl, ShoppingCarFragment> implements ShoppingContract.ShoppingPresent {
    @Override
    public void loadTotalPrice() {
        model.takeTotalPrice(view);
    }

    @Override
    public void loadShoppingCarData() {
        model.takeShoppingCarData(view);
    }
}
