package shopping.gd.com.yw.gdshoppingmail.ui.activity.wares;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseAppActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.HomeFragmentPageAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.Wares.WaresFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.detial.DetialsFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.evlaute.EvlauteFragment;
import shopping.gd.com.yw.gdshoppingmail.view.ScrollviewPager;

/**
 * Created by yw on 2018/1/16.
 */

public class WaresDetialActivity extends BaseAppActivity{

    @BindView(R.id.activity_waresdetial_content_vg)
    ScrollviewPager waresdetial_vg;

    @BindView(R.id.activity_waresdetial_content_tab)
    RadioGroup waresdetial_tab;

    @BindView(R.id.activity_waresdetial_shared)
    ImageView waresdetial_shared;

    @BindView(R.id.activity_waresdetial_collect)
    ImageView waresdetial_collect;

    @BindView(R.id.activity_waresdetial_back)
    ImageView waresdetial_back;

    @BindView(R.id.activity_waresdetial_title_tv)
    TextView waresdetial_title;

    private ArrayList<String> mTitleList = new ArrayList<>(3);
    private ArrayList<Fragment> mFragments = new ArrayList<>(3);

    private HomeFragmentPageAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waresdetials);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
        initView();
    }

    private void initView() {
        initFragmentList();
        waresdetial_tab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.fm_waresdetial_shopping:
                        waresdetial_vg.setCurrentItem(0);
                        break;
                    case R.id.fm_waresdetial_detial:
                        waresdetial_vg.setCurrentItem(1);
                        break;
                    case R.id.fm_waresdetial_evaluate:
                        waresdetial_vg.setCurrentItem(2);
                        break;

                }
            }
        });
        adapter = new HomeFragmentPageAdapter(getSupportFragmentManager(), mFragments, mTitleList);
        waresdetial_vg.setAdapter(adapter);
        waresdetial_vg.setCurrentItem(0);
        waresdetial_vg.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        waresdetial_tab.check(R.id.fm_waresdetial_shopping);
                        break;
                    case 1:
                        waresdetial_tab.check(R.id.fm_waresdetial_detial);
                        break;
                    case 2:
                        waresdetial_tab.check(R.id.fm_waresdetial_evaluate);
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
        mTitleList.add("商品");
        mTitleList.add("详情");
        mTitleList.add("评价");
        mFragments.add(new WaresFragment());
        mFragments.add(new DetialsFragment());
        mFragments.add(new EvlauteFragment());
    }
}
