package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import shopping.gd.com.yw.domain.model.ShoppingCar;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;

public class ShoppingAdater extends RecyclerView.Adapter<ShoppingAdater.MyViewHolder> {

    private Context mContext;
    private List<Shopping> shoppings;
    private boolean isDel;

    public ShoppingAdater(Context context, ShoppingCar shoppingCar) {
        this.shoppings = shoppingCar.shoppings;
        this.isDel = shoppingCar.isDel;
        this.mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_shopping_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Shopping shopping = shoppings.get(position);
        if (isDel) {
            holder.linearLayout.setVisibility(View.VISIBLE);
        } else {
            holder.linearLayout.setVisibility(View.GONE);
        }
        holder.shopping_add.setOnClickListener(new SumOnclick());
        holder.shopping_minus.setOnClickListener(new SumOnclick());
        holder.shopping_detials.setText(shopping.details);
        holder.shopping_discount.setText(shopping.discount);
        holder.shopping_name.setText(shopping.name);
        holder.shopping_price.setText(shopping.price);
        holder.shopping_number.setText(shopping.number + "");
        ImageUtils.image(mContext, BaseApiService.BASE_URL + shopping.imageUrl, holder.shopping_img);
    }

    @Override
    public int getItemCount() {
        return shoppings.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.fm_shopping_item_img)
        ImageView shopping_img;

        @BindView(R.id.fm_shopping_item_tv_name)
        TextView shopping_name;

        @BindView(R.id.fm_shopping_item_tv_detials)
        TextView shopping_detials;

        @BindView(R.id.fm_shopping_item_tv_discount)
        TextView shopping_discount;

        @BindView(R.id.fm_shopping_item_tv_number)
        TextView shopping_number;

        @BindView(R.id.fm_shopping_item_tv_add)
        TextView shopping_add;

        @BindView(R.id.fm_shopping_item_tv_minus)
        TextView shopping_minus;

        @BindView(R.id.fm_shopping_item_tv_price)
        TextView shopping_price;

        @BindView(R.id.fm_shopping_item_del_li)
        LinearLayout linearLayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private class SumOnclick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fm_shopping_item_tv_minus:
                    Log.i("--------", "----minus----");
                    break;
                case R.id.fm_shopping_item_tv_add:
                    Log.i("--------", "----add----");
                    break;
            }
        }
    }
}
