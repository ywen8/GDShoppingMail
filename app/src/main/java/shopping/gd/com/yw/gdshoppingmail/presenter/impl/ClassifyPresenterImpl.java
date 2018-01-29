package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.ClassifyContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.ClassifyModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.classify.ClassifyFragment;

public class ClassifyPresenterImpl extends BasePresenter<ClassifyModelImpl, ClassifyFragment> implements ClassifyContract.ClassifyPresenter {


    @Override
    public void getleftData() {
        model.loadleftData(view);
    }

    @Override
    public void getrightData() {
        model.loadrightData(view);
    }
}
