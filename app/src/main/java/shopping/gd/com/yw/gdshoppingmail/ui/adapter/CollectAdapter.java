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
import shopping.gd.com.yw.domain.model.Collect;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/19.
 */

public class CollectAdapter extends RecyclerView.Adapter<CollectAdapter.MyViewHolder> {
    private Context mContext;
    private List<Collect> list;

    public CollectAdapter(Context mContext, List<Collect> list) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_collect_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Collect collect = list.get(position);
        holder.collect_detial.setText(collect.shopping.details);
        holder.collect_time.setText(collect.time);
        holder.collect_discount.setText(collect.shopping.discount);
        holder.collect_name.setText(collect.shopping.name);
        holder.collect_price.setText(collect.shopping.price);
        ImageUtils.image(mContext, BaseApiService.BASE_URL + "/background/img/logo.png", holder.collect_img);
        holder.collect_addshoppcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.activity_collect_item_addshoppcar)
        TextView collect_addshoppcar;

        @BindView(R.id.activity_collect_item_detial)
        TextView collect_detial;

        @BindView(R.id.activity_collect_item_discount)
        TextView collect_discount;

        @BindView(R.id.activity_collect_item_img)
        ImageView collect_img;

        @BindView(R.id.activity_collect_item_name)
        TextView collect_name;

        @BindView(R.id.activity_collect_item_price)
        TextView collect_price;

        @BindView(R.id.activity_collect_item_time)
        TextView collect_time;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }

}
