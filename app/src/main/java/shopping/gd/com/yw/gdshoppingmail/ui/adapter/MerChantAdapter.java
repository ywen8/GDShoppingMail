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
import butterknife.OnClick;
import shopping.gd.com.yw.commonlib.utils.ImageUtils;
import shopping.gd.com.yw.domain.model.MerChant;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/16.
 */

public class MerChantAdapter extends RecyclerView.Adapter<MerChantAdapter.MyViewHolder> {
    private Context mContext;
    private List<MerChant> list;
    private MerChantItemClickListener itemClickListener;


    public MerChantAdapter(Context mContext, List<MerChant> list) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_merchant_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final MerChant merChant = list.get(position);
        holder.merchant_detials.setText(merChant.detials);
        holder.merchant_title.setText(merChant.name);
        ImageUtils.image(mContext, BaseApiService.BASE_URL + "/background/img/logo.png", holder.merchant_img);
        holder.merchant_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(v, merChant, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.activity_merchant_item_name_tv)
        TextView merchant_title;

        @BindView(R.id.activity_merchant_detial_item_tv)
        TextView merchant_detials;

        @BindView(R.id.activity_merchant_item_img)
        ImageView merchant_img;

        @BindView(R.id.activity_merchant_item_li)
        LinearLayout merchant_li;


        @OnClick(R.id.activiti_merchant_g_item_bt)
        void toguang() {
            Log.i("-------", "-------");
        }

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void setItemClisklistener(MerChantItemClickListener itemClisklistener) {
        this.itemClickListener = itemClisklistener;
    }

    public interface MerChantItemClickListener {
        void onItemClick(View view, MerChant merChant, int position);
    }
}
