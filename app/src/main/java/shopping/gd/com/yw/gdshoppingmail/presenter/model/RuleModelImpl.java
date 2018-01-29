package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import shopping.gd.com.yw.domain.model.Rule;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.RuleContract;

/**
 * Created by yw on 2018/1/18.
 */

public class RuleModelImpl extends BaseModule implements RuleContract.RuleModel {
    @Override
    public void loadRule(RuleContract.RuleView view) {

        Rule rule = new Rule();
        rule.detial = "如果你无法简洁的表达你的想法，那只能说明你还你够了解它。如果你无法简洁的表达你的想法，那只能说明你还你够了解它。如果你无法简洁的表达你的想法，那只能说明你还你够了解它。如果你无法简洁的表达你的想法，那只能说明你还你够了解它。如果你无法简洁的表达你的想法，那只能说明你还你够了解它。";
        rule.name = "广电甄选App开业了";
    }
}
