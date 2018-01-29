package shopping.gd.com.yw.gdshoppingmail.ui.fragment.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnItemClick;
import shopping.gd.com.yw.commonlib.utils.ImageUtils;
import shopping.gd.com.yw.domain.model.BannerItem;
import shopping.gd.com.yw.domain.model.ShoppingRecomm;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.entity.ButtonModel;
import shopping.gd.com.yw.gdshoppingmail.presenter.HomeContract;
import shopping.gd.com.yw.gdshoppingmail.presenter.impl.HomePresenterImpl;
import shopping.gd.com.yw.gdshoppingmail.presenter.model.HomeModelImpl;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.brand.BrandActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.classify.ClassifyActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.login.LoginActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.merchant.MerChantActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.activity.register.RegisterActivity;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.HomeAdapter;
import shopping.gd.com.yw.gdshoppingmail.ui.adapter.SortButtonAdapter;
import shopping.gd.com.yw.gdshoppingmail.base.BaseAppFragment;
import shopping.gd.com.yw.gdshoppingmail.view.BannerView;
import shopping.gd.com.yw.gdshoppingmail.view.MyGridView;
import shopping.gd.com.yw.gdshoppingmail.view.TextSwitchView;

public class HomeFragment extends BaseAppFragment<HomePresenterImpl> implements HomeContract.HomeView {

    List<HomeModelImpl.BannerItems> list = new ArrayList<>();

    @BindView(R.id.banner)
    BannerView banner;

    @BindView(R.id.gv_data)
    MyGridView speedy_gv;

    SortButtonAdapter adapter;

    @BindView(R.id.rv_list)
    RecyclerView rv_list;


    @BindView(R.id.fm_home_search)
    Button home_search;


    @BindView(R.id.fm_home_register_tv)
    TextView register_tv;

    @BindView(R.id.fm_home_login_tv)
    TextView login_tv;

    @BindView(R.id.fm_home_inform_tv)
    TextSwitchView switchView;

    HomeAdapter shoppingAdapter;


    @Override
    public int getLayoutResId() {
        return R.layout.fm_home;
    }

    @Override
    protected void initView(View parentView) {
    }


    @Override
    protected HomePresenterImpl initPresenter() {
        return new HomePresenterImpl();
    }


    @Override
    protected BaseModule initModule() {
        return new HomeModelImpl(getActivity());
    }

    @Override
    public void finishCreateView(Bundle bundle) {
        isPrepared = true;
        lazyLoad();
    }

    @OnClick(R.id.fm_home_register_tv)
    void registerClick() {
        startActiviys(RegisterActivity.class);
    }

    @OnClick(R.id.fm_home_login_tv)
    void loginClick() {
        startActiviys(LoginActivity.class);
    }

    String[] res = {
            "静夜思" + "\n" + "\n" + "床前明月光", "疑是地上霜" + "\n" +"\n"+
            "举头望明月",
            "低头思故乡"
    };

    @Override
    public void onResume() {
        super.onResume();
        presenter.getbanners();
        presenter.getShoppings();
        presenter.getSpeedy();
        switchView.setResources(res);
        switchView.setTextStillTime(10000);
    }

    @OnItemClick(R.id.gv_data)
    void speedyItem(int position) {

        switch (position) {
            case 0:
                startActiviys(ClassifyActivity.class);
                break;
            case 1:
                startActiviys(BrandActivity.class);
                break;
            case 2:
                startActiviys(MerChantActivity.class);
                break;
            case 3:
                break;

        }

    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showProgress() {
        loading.showLoading();
    }

    @Override
    public void hideProgress() {
        loading.dismissLoading();
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void bannersShow(List<BannerItem> bannerItems) {
        list.clear();
        for (int i = 0; i < bannerItems.size(); i++) {
            HomeModelImpl.BannerItems item = new HomeModelImpl.BannerItems();
            item.setId(bannerItems.get(i).getId());
            item.setImage(bannerItems.get(i).getNewsimg());
            list.add(item);
        }
        banner.setViewFactory(new BannerViewFactory());
        banner.setDataList(list);
        banner.start();

    }

    @Override
    public void shoppingShow(List<ShoppingRecomm> shoppings) {
        rv_list.setNestedScrollingEnabled(false);
        rv_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        shoppingAdapter = new HomeAdapter(getActivity(), shoppings);
        rv_list.setAdapter(shoppingAdapter);
    }

    @Override
    public void speedyShow(List<ButtonModel> buttonModels) {
        adapter = new SortButtonAdapter(getActivity(), buttonModels);
        speedy_gv.setAdapter(adapter);
    }

    public class BannerViewFactory implements BannerView.ViewFactory<HomeModelImpl.BannerItems> {

        @Override
        public View create(final HomeModelImpl.BannerItems bannerItem, int position, ViewGroup container) {
            ImageView iv = new ImageView(container.getContext());
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            ImageUtils.image(getActivity(), BaseApiService.BASE_URL + bannerItem.image, iv);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            return iv;
        }
    }


}
