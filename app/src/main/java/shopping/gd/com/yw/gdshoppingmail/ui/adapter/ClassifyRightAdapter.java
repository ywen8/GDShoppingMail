package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.ImageUtils;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/15.
 */

public class ClassifyRightAdapter extends RecyclerView.Adapter<ClassifyRightAdapter.MyViewHodel> {
    private List<Shopping> shoppings;
    private Context mContext;

    public ClassifyRightAdapter(Context mContext, List<Shopping> shoppings) {
        this.shoppings = shoppings;
        this.mContext = mContext;
    }

    @Override
    public MyViewHodel onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_classify__item_right, parent, false);
        MyViewHodel myViewHodel = new MyViewHodel(view);
        return myViewHodel;
    }

    @Override
    public void onBindViewHolder(MyViewHodel holder, int position) {
        Shopping shopping = shoppings.get(position);
        holder.classify_tv_name.setText(shopping.name);
        holder.classify_detials.setText(shopping.details);
        holder.classify_tv_price.setText(shopping.price);
        holder.classify_tv_discount.setText(shopping.discount);
        ImageUtils.image(mContext, BaseApiService.BASE_URL + shopping.imageUrl, holder.classify_img);

    }

    @Override
    public int getItemCount() {
        return shoppings.size();
    }

    public class MyViewHodel extends RecyclerView.ViewHolder {
        @BindView(R.id.fm_classify_item_img)
        ImageView classify_img;

        @BindView(R.id.fm_classify_item_tv_discount)
        TextView classify_tv_discount;

        @BindView(R.id.fm_classify_item_right_img)
        ImageView classify_right_img;

        @BindView(R.id.fm_classify_item_tv_price)
        TextView classify_tv_price;

        @BindView(R.id.fm_classify_item_tv_name)
        TextView classify_tv_name;

        @BindView(R.id.fm_classify_item_tv_detials)
        TextView classify_detials;

        public MyViewHodel(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
