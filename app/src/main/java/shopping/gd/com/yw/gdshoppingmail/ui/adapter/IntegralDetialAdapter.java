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
import shopping.gd.com.yw.domain.model.Integral;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/18.
 */

public class IntegralDetialAdapter extends RecyclerView.Adapter<IntegralDetialAdapter.MyViewHolder> {
    private Context mContext;
    private List<Integral> list;

    public IntegralDetialAdapter(Context mContext, List<Integral> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_integral_detial_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Integral integral = list.get(position);
        holder.integral_detial.setText(integral.record);
        holder.integral_time.setText(integral.time);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.integral_detial)
        TextView integral_detial;

        @BindView(R.id.integral_time)
        TextView integral_time;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
