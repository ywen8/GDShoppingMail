package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import shopping.gd.com.yw.domain.http.BaseSubscriber;
import shopping.gd.com.yw.domain.http.ExceptionHandle;
import shopping.gd.com.yw.domain.http.RetrofitClient;
import shopping.gd.com.yw.domain.model.BannerItem;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.model.ShoppingRecomm;
import shopping.gd.com.yw.domain.sort.TypeSort;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.entity.ButtonModel;
import shopping.gd.com.yw.gdshoppingmail.presenter.HomeContract;

public class HomeModelImpl extends BaseModule implements HomeContract.HomeModel {
    private Context mContext;

    public HomeModelImpl(Context mContext) {
        this.mContext = mContext;
    }

    private List<ButtonModel> setData() {
        List<ButtonModel> data = new ArrayList<>();
        ButtonModel buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.mipmap.fl_top);
        buttonModel.setName("分类");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.mipmap.pp_top);
        buttonModel.setName("品牌街");
        data.add(buttonModel);
        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.mipmap.gwc_top);
        buttonModel.setName("甄选商家");
        data.add(buttonModel);
        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.mipmap.gr_top);
        buttonModel.setName("用户中心");
        data.add(buttonModel);
        return data;
    }

    private List<ShoppingRecomm> setShoppData() {
        List<Shopping> urls = new ArrayList<Shopping>();
        List<Shopping> shops = new ArrayList<Shopping>();
        for (int i = 0; i < 4; i++) {
            Shopping shopp = new Shopping();
            shopp.imageUrl = "/background/img/logo.png";
            shopp.name = "新会陈皮普洱熟茶叶";
            shopp.price = "¥168.0";
            urls.add(shopp);
            if (i < 3) {
                shops.add(shopp);
            }
        }

        List<ShoppingRecomm> list = new ArrayList<ShoppingRecomm>();
        ShoppingRecomm shopping = new ShoppingRecomm();
        shopping.laber = "最新";
        shopping.shoppings = urls;
        shopping.type = 2;

        ShoppingRecomm shopping1 = new ShoppingRecomm();
        shopping1.laber = "促锁";
        shopping1.shoppings = urls;
        shopping1.type = 2;

        ShoppingRecomm shopping2 = new ShoppingRecomm();
        shopping2.laber = "特惠";
        shopping2.shoppings = urls;
        shopping2.type = 2;


        ShoppingRecomm shopping4 = new ShoppingRecomm();
        shopping4.type = 2;
        shopping4.laber = "猜你喜欢";
        shopping4.shoppings = urls;

        list.add(shopping);
        list.add(shopping1);
        list.add(shopping2);
        list.add(shopping4);
        ShoppingRecomm shopping3 = new ShoppingRecomm();
        shopping3.type = 1;
        shopping3.laber = "今日推荐";
        shopping3.shoppings = shops;
        list.add(shopping3);
        Collections.sort(list, new TypeSort());
        return list;
    }

    @Override
    public void loadbanner(final HomeContract.HomeView presenter) {
        RetrofitClient.getInstance(mContext).createBaseApi().banner(new BaseSubscriber<List<BannerItem>>(mContext) {
            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {

            }


            @Override
            public void onNext(List<BannerItem> bannerItems) {
                super.onNext(bannerItems);
                presenter.bannersShow(bannerItems);
            }
        });
    }

    @Override
    public void loadShopping(HomeContract.HomeView presenter) {
        presenter.shoppingShow(setShoppData());
    }

    @Override
    public void loadSpeedy(HomeContract.HomeView presenter) {
        presenter.speedyShow(setData());
    }

    public static class BannerItems implements Serializable {
        public String id;
        public String image;
        public String title;

        public void setId(String id) {
            this.id = id;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

}
