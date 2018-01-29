package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.commonlib.utils.ImageUtils;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantDetialsAdapter extends RecyclerView.Adapter<MerChantDetialsAdapter.MyViewHolder> {

    private Context mContext;

    private List<Shopping> shoppings;

    private ShoppingOnclickListener shoppingOnclickListener;

    public void setShoppingOnclickListener(ShoppingOnclickListener shoppingOnclickListener) {
        this.shoppingOnclickListener = shoppingOnclickListener;
    }

    public MerChantDetialsAdapter(Context context, List<Shopping> list) {
        this.mContext = context;
        this.shoppings = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_merchantdetial_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Shopping shopping = shoppings.get(position);
        holder.merchantdetial_detials.setText(shopping.details);
        holder.merchantdetial_discount.setText(shopping.discount);
        holder.merchantdetial_name.setText(shopping.name);
        holder.merchantdetial_price.setText(shopping.price);
        ImageUtils.image(mContext, BaseApiService.BASE_URL + "/background/img/logo.png", holder.merchantdetial_img);
        holder.merchantdetial_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoppingOnclickListener.shoppingClick(v, shopping, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return shoppings.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.activity_merchantdetial_discount)
        TextView merchantdetial_discount;

        @BindView(R.id.activity_merchantdetial_price)
        TextView merchantdetial_price;

        @BindView(R.id.activity_merchantdetial_detials)
        TextView merchantdetial_detials;

        @BindView(R.id.activity_merchantdetial_img)
        ImageView merchantdetial_img;

        @BindView(R.id.activity_merchantdetial_name)
        TextView merchantdetial_name;

        @BindView(R.id.activity_merchantdetial_item_ll)
        LinearLayout merchantdetial_ll;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface ShoppingOnclickListener {
        void shoppingClick(View v, Shopping shopping, int position);
    }

}
