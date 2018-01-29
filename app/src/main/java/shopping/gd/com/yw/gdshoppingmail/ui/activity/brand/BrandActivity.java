package shopping.gd.com.yw.gdshoppingmail.ui.activity.brand;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ca.barrenechea.widget.recyclerview.decoration.DividerDecoration;
import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderDecoration;
import shopping.gd.com.yw.commonlib.utils.AppManager;
import shopping.gd.com.yw.domain.model.BrandClassify;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.BrandContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.BrandPresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.BrandModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.BaseActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.wares.WaresActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.ContactsAdapter;
import shopping.gd.com.yw.gdshoppingmail.view.QuickIndexBar;

/**
 * Created by yw on 2018/1/15.
 */

public class BrandActivity extends BaseActivity<BrandPresenterImpl> implements BrandContract.BrandView, ContactsAdapter.BrandItemOnclickListener {

    @BindView(R.id.activity_brand_right)
    QuickIndexBar brand_right;

    @BindView(R.id.activity_brand_rv)
    RecyclerView brand_rv;

//    @BindView(R.id.activity_brand_tv_collent)
//    TextView barnd_collent;
//
//    @BindView(R.id.activity_brand_tv_refre)
//    TextView brand_refre;
//
//    @BindView(R.id.activity_brand_top_gv)
//    MyGridView brand_top_gv;

    private LinearLayoutManager manager;

    @Override
    public void barndsShow(final List<BrandClassify> list) {
        DividerDecoration divider = new DividerDecoration.Builder(this).setColor(Color.WHITE)
                .build();

        manager = new LinearLayoutManager(this);
        brand_rv.setNestedScrollingEnabled(false);
        brand_rv.setHasFixedSize(true);
        brand_rv.setLayoutManager(manager);
        brand_rv.addItemDecoration(divider);
        final ContactsAdapter adapter = new ContactsAdapter(this, list);

        //设置悬浮索引
        StickyHeaderDecoration decor = new StickyHeaderDecoration(adapter);
        brand_rv.setAdapter(adapter);
        brand_rv.addItemDecoration(decor, 1);
        //侧拉索引改变监听
        brand_right.setOnLetterChangeListener(new QuickIndexBar.OnLetterChangeListener() {
            @Override
            public void onLetterChange(String letter) {

                for (int i = 0; i < list.size(); i++) {

                    if (letter.equals(list.get(i).pinyin.charAt(0) + "")) {

                        int position = adapter.getPositionForSection(list.get(i).pinyin.charAt(0));
                        if (position != -1) {
                            //滑动到指定位置
                            manager.scrollToPositionWithOffset(position, 0);
                        }
                        break;
                    }
                }
            }

            @Override
            public void onReset() {

            }
        });
        adapter.setBrandItemOnclickListener(this);
//        BrandImgAdapter brandImgAdapter = new BrandImgAdapter(this, list.get(0).brands);
//        brand_top_gv.setAdapter(brandImgAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        present.getBrands();
    }

    @Override
    protected BrandPresenterImpl initPresent() {
        return new BrandPresenterImpl();
    }

    @Override
    protected BaseModule initModel() {
        return new BrandModelImpl(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);
        ButterKnife.bind(this);
        AppManager.getAppManager().addActivity(this);
        init();
    }

    private void init() {
//        brand_refre.getPaint().setFakeBoldText(true);
//        barnd_collent.getPaint().setFakeBoldText(true);
    }

    @Override
    public void brandItemClickListener(View v, BrandClassify brand, int position) {
        startActiviys(WaresActivity.class);
    }
}
