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
import shopping.gd.com.yw.domain.model.Order;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/18.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder> {
    private Context mContext;

    private List<Order> list;

    public OrderAdapter(Context mContext, List<Order> list) {
        this.list = list;
        this.mContext = mContext;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_ownorder_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Order order = list.get(position);
        holder.ownorder_detials.setText(order.shopping.details);
        holder.ownorder_name.setText(order.shopping.name);
        holder.ownorder_price.setText(order.shopping.price);
        ImageUtils.image(mContext, BaseApiService.BASE_URL + "/background/img/logo.png", holder.ownorder_item_img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.fm_ownorder_item_img)
        ImageView ownorder_item_img;

        @BindView(R.id.fm_ownorder_item_tv_detials)
        TextView ownorder_detials;

        @BindView(R.id.fm_ownorder_item_tv_name)
        TextView ownorder_name;
        @BindView(R.id.fm_ownorder_item_tv_price)
        TextView ownorder_price;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
