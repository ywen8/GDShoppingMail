package shopping.gd.com.yw.gdshoppingmail.presenter;

import shopping.gd.com.yw.domain.model.Rule;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;

/**
 * Created by yw on 2018/1/18.
 */

public class RuleContract {

    public interface RuleView extends BaseContract.IBaseView {
        void ruleShow(Rule rule);
    }

    public interface RulePresenter extends BaseContract.IBasePresenter {
        void getRule();
    }

    public interface RuleModel extends BaseContract.IBaseModule {
        void loadRule(RuleView view);
    }
}
