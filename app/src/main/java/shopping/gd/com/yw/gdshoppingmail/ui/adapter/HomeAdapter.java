package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.domain.model.ShoppingRecomm;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.view.MyGridView;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    private Context mContext;
    private ImageAdapter imageAdapter;
    private List<ShoppingRecomm> list;
    private ShoppingClickListener mListener;

    public HomeAdapter(Context mContext, List<ShoppingRecomm> list) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_home_shopping_item, parent, false);//解决宽度
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final ShoppingRecomm shoppingRecomm = list.get(position);
        if (shoppingRecomm.type == 1) {
            holder.linearLayout.setVisibility(View.VISIBLE);
            holder.fm_home_adapter_bottom.setVisibility(View.GONE);
            holder.refer_tv.setText(shoppingRecomm.laber);
            imageAdapter = new ImageAdapter(mContext, shoppingRecomm.shoppings, true);
            holder.myGridView.setAdapter(imageAdapter);
        } else {
            holder.linearLayout.setVisibility(View.GONE);
            holder.fm_home_adapter_bottom.setVisibility(View.VISIBLE);
            holder.laber_tv.setText(shoppingRecomm.laber);
            imageAdapter = new ImageAdapter(mContext, shoppingRecomm.shoppings, false);
            holder.mrecyview.setAdapter(imageAdapter);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_laber_tv)
        TextView laber_tv;

        @BindView(R.id.adapter_tv_refer)
        TextView refer_tv;

        @BindView(R.id.adapter_li_refer)
        LinearLayout linearLayout;

        @BindView(R.id.rv_img_list)
        MyGridView mrecyview;

        @BindView(R.id.fm_home_adapter_bottom)
        LinearLayout fm_home_adapter_bottom;

        @BindView(R.id.fm_home_item_sales_gv)
        MyGridView myGridView;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }

    public void setmListener(ShoppingClickListener mListener) {
        this.mListener = mListener;
    }


    public interface ShoppingClickListener {
        void onItemClick(View view, ShoppingRecomm shopping, int position);
    }
}
