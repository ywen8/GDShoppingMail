package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import shopping.gd.com.yw.domain.model.WaresType;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/17.
 */

public class WaresTypeAdapter extends RecyclerView.Adapter<WaresTypeAdapter.MyViewHolder> {
    private Context mContext;
    private List<WaresType> list;

    public WaresTypeAdapter(Context mContext, List<WaresType> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_wares_type_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(list.get(position).name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.fm_waresdetial_type_item_tv)
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
