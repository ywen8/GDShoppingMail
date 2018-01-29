package shopping.gd.com.yw.gdshoppingmail.presenter.impl;

import shopping.gd.com.yw.gdshoppingmail.base.BasePresenter;
import shopping.gd.com.yw.gdshoppingmail.presenter.RuleContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.RuleModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.rule.IntegralRuleActivity;

/**
 * Created by yw on 2018/1/18.
 */

public class RulePresenterImpl extends BasePresenter<RuleModelImpl,IntegralRuleActivity> implements RuleContract.RulePresenter {
    @Override
    public void getRule() {
        model.loadRule(view);
    }
}
