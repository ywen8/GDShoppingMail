package shopping.gd.com.yw.gdshoppingmail.ui.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.HomeFragmentPageAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.classify.ClassifyFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.home.HomeFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.my.MyFragment;
import shopping.gd.com.yw.gdshoppingmail.ui.fragment.shopping.ShoppingCarFragment;
import shopping.gd.com.yw.gdshoppingmail.view.ScrollviewPager;


public class MainActivity extends BaseAppActivity {

    @BindView(R.id.dl_layout)
    DrawerLayout dlLayout;

    @BindView(R.id.rg_home_viewpager_contorl)
    RadioGroup rgHomeViewpagerContorl;

    @BindView(R.id.vp_content)
    ScrollviewPager vpContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
        initData();


    }


    private void initData() {
        rgHomeViewpagerContorl.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i) {
                    case R.id.activity_home:
                        vpContent.setCurrentItem(0);// 设置当前页面
                        break;
                    case R.id.activity_shoppingcar:
                        vpContent.setCurrentItem(1);
                        break;
                    case R.id.activity_classify:
                        vpContent.setCurrentItem(2);
                        break;
                    case R.id.activity_my:
                        vpContent.setCurrentItem(3);
                        break;
                }
            }
        });
        List<Fragment> mFragmentList = new ArrayList<>();
        mFragmentList.add(HomeFragment.newInstance());
        mFragmentList.add(ShoppingCarFragment.newInstance());
        mFragmentList.add(ClassifyFragment.newInstance());
        mFragmentList.add(MyFragment.newInstance());
        vpContent.setAdapter(new HomeFragmentPageAdapter(getSupportFragmentManager(), mFragmentList));
        vpContent.setCurrentItem(0);
        vpContent.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        rgHomeViewpagerContorl.check(R.id.activity_home);
                        break;
                    case 1:
                        rgHomeViewpagerContorl.check(R.id.activity_shoppingcar);
                        break;
                    case 2:
                        rgHomeViewpagerContorl.check(R.id.activity_classify);
                        break;
                    case 3:
                        rgHomeViewpagerContorl.check(R.id.activity_my);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
