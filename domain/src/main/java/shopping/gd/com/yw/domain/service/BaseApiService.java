package shopping.gd.com.yw.domain.service;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;
import shopping.gd.com.yw.domain.http.BaseResponse;
import shopping.gd.com.yw.domain.model.BannerItem;

public interface BaseApiService {
    public static final String Base_URL = "http://117.36.77.242:8080";
    public static final String TYPE = "/yykjZhCommunity";
    public static final String BASE_URL = Base_URL + TYPE;

    public static final String BASE_HTTP = "http://gd.onego360.com";


    @POST(TYPE + "/app/news/selectHomeNews")
    Observable<BaseResponse<List<BannerItem>>> postBanner();

    @FormUrlEncoded
    @POST("/app_login_token.htm")
    Observable<ResponseBody> getLogin(@FieldMap Map<String, String> map);
}
