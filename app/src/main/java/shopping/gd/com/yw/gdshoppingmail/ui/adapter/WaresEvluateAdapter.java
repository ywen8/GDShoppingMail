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
import shopping.gd.com.yw.domain.model.Evlaute;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/17.
 */

public class WaresEvluateAdapter extends RecyclerView.Adapter<WaresEvluateAdapter.MyViewHolder> {
    private Context mContext;
    private List<Evlaute> list;

    public WaresEvluateAdapter(Context mContext, List<Evlaute> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_wares_evlaute_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Evlaute evlaute = list.get(position);
        holder.wares_evlaute_message.setText(evlaute.message);
        holder.wares_evlaute_name.setText(evlaute.name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.fm_wares_evlaute_message)
        TextView wares_evlaute_message;

        @BindView(R.id.fm_wares_evlaute_img)
        ImageView wares_evlaute_img;

        @BindView(R.id.fm_wares_evlaute_name)
        TextView wares_evlaute_name;

        public MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
