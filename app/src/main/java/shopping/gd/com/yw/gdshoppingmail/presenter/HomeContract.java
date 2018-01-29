package shopping.gd.com.yw.gdshoppingmail.presenter;

import java.util.List;

import shopping.gd.com.yw.domain.model.BannerItem;
import shopping.gd.com.yw.domain.model.ShoppingRecomm;
import shopping.gd.com.yw.gdshoppingmail.base.BaseContract;
import shopping.gd.com.yw.gdshoppingmail.entity.ButtonModel;

import static shopping.gd.com.yw.gdshoppingmail.base.BaseContract.IBasePresenter;
import static shopping.gd.com.yw.gdshoppingmail.base.BaseContract.IBaseView;


public class HomeContract {

    public interface HomeView extends IBaseView {


        void bannersShow(List<BannerItem> bannerItems);

        void shoppingShow(List<ShoppingRecomm> shoppings);

        void speedyShow(List<ButtonModel> buttonModels);


    }

    public interface HomeBannerPresenter extends IBasePresenter {

        void getbanners();

    }

    public interface HomeShoppingPresenter extends IBasePresenter {

        void getShoppings();
    }

    public interface HomeSpeedyPresenter extends IBasePresenter {
        void getSpeedy();
    }

    public interface HomeModel extends BaseContract.IBaseModule {

        void loadbanner(HomeView presenter);

        void loadShopping(HomeView presenter);

        void loadSpeedy(HomeView presenter);


    }

}
