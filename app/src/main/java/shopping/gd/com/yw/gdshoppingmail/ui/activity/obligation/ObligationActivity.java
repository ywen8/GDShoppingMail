package shopping.gd.com.yw.gdshoppingmail.ui.activity.obligation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseAppActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.HomeFragmentPageAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.ConsignmentFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.ObligationFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.OwnFinishFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.OwnOrderFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.ReceiveFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.order.RefundFragment;
import shopping.gd.com.yw.gdshoppingmail.view.ScrollviewPager;

/**
 * Created by yw on 2018/1/18.
 */

public class ObligationActivity extends BaseAppActivity {

    @BindView(R.id.activity_obliation_content_vg)
    ScrollviewPager obligation_vg;
    @BindView(R.id.activity_obliation_content_tab)
    RadioGroup obligation_tab;

    @BindView(R.id.activity_obliation_ownorder_v)
    View ownorder_v;
    @BindView(R.id.activity_obliation_obliga_v)
    View obliga_v;
    @BindView(R.id.activity_obliation_consignment_v)
    View consignment_v;
    @BindView(R.id.activity_obliation_receiving_v)
    View receiving_v;
    @BindView(R.id.activity_obliation_refund_v)
    View refund_v;
    @BindView(R.id.activity_obliation_finish_v)
    View finish_v;
    private ArrayList<String> mTitleList = new ArrayList<>(6);
    private ArrayList<Fragment> mFragments = new ArrayList<>(6);

    private HomeFragmentPageAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obligation);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
        init();
    }

    private void init() {
        initFragmentList();
        obligation_tab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.activity_obliation_ownorder:
                        obligation_vg.setCurrentItem(0);
                        break;
                    case R.id.activity_obliation_obliga:
                        obligation_vg.setCurrentItem(1);
                        break;
                    case R.id.activity_obliation_consignment:
                        obligation_vg.setCurrentItem(2);
                        break;
                    case R.id.activity_obliation_receiving:
                        obligation_vg.setCurrentItem(3);
                        break;
                    case R.id.activity_obliation_refund:
                        obligation_vg.setCurrentItem(4);
                        break;
                    case R.id.activity_obliation_finish_all:
                        obligation_vg.setCurrentItem(5);
                        break;

                }
            }
        });
        adapter = new HomeFragmentPageAdapter(getSupportFragmentManager(), mFragments, mTitleList);
        obligation_vg.setAdapter(adapter);
        obligation_vg.setCurrentItem(0);
        obligation_vg.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        obligation_tab.check(R.id.activity_obliation_ownorder);
                        ownorder_v.setBackgroundColor(getResources().getColor(R.color.white));
                        obliga_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        consignment_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        receiving_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        refund_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        finish_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        break;
                    case 1:
                        obligation_tab.check(R.id.activity_obliation_obliga);
                        ownorder_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        obliga_v.setBackgroundColor(getResources().getColor(R.color.white));
                        consignment_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        receiving_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        refund_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        finish_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        break;
                    case 2:
                        obligation_tab.check(R.id.activity_obliation_consignment);
                        ownorder_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        obliga_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        consignment_v.setBackgroundColor(getResources().getColor(R.color.white));
                        receiving_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        refund_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        finish_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        break;
                    case 3:
                        obligation_tab.check(R.id.activity_obliation_receiving);
                        ownorder_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        obliga_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        consignment_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        receiving_v.setBackgroundColor(getResources().getColor(R.color.white));
                        refund_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        finish_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        break;
                    case 4:
                        obligation_tab.check(R.id.activity_obliation_refund);
                        ownorder_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        obliga_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        consignment_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        receiving_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        refund_v.setBackgroundColor(getResources().getColor(R.color.white));
                        finish_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        break;
                    case 5:
                        obligation_tab.check(R.id.activity_obliation_finish_all);
                        ownorder_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        obliga_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        consignment_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        receiving_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        refund_v.setBackgroundColor(getResources().getColor(R.color.transparent));
                        finish_v.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void initFragmentList() {
        if (mTitleList.size() != 0) {
            return;
        }
        mTitleList.add("全部订单");
        mTitleList.add("待付款");
        mTitleList.add("待发货");
        mTitleList.add("待收货");
        mTitleList.add("退款/退货");
        mTitleList.add("已完成");

        mFragments.add(new OwnOrderFragment());
        mFragments.add(new ObligationFragment());
        mFragments.add(new ConsignmentFragment());
        mFragments.add(new ReceiveFragment());
        mFragments.add(new RefundFragment());
        mFragments.add(new OwnFinishFragment());
    }

}
