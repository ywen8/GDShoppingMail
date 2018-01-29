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
import shopping.gd.com.yw.domain.model.Classify;
import shopping.gd.com.yw.gdshoppingmail.R;

public class ClassifyLeftAdapter extends RecyclerView.Adapter<ClassifyLeftAdapter.MyViewHolder> {
    private Context mContext;
    private List<Classify> list;
    public ClassifyLeftAdapter(Context context,List<Classify> list){
        this.mContext=context;
        this.list=list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fm_classify_item_left, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ClassifyLeftAdapter.MyViewHolder holder, int position) {
        Classify classify = list.get(position);
        holder.item_left_tv.setText(classify.name);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.fm_classify_item_left_tv)
        TextView item_left_tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
