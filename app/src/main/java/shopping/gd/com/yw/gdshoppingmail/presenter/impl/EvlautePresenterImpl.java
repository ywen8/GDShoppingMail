package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.EvaluateContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.EvlauteModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.evlaute.EvlauteFragment;

/**
 * Created by yw on 2018/1/17.
 */

public class EvlautePresenterImpl extends BasePresenter<EvlauteModelImpl, EvlauteFragment> implements EvaluateContract.EvlautePresenter {
    @Override
    public void getEvlautes() {
        model.loadEvlaute(view);
    }
}
