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
import shopping.gd.com.yw.domain.model.Address;
import shopping.gd.com.yw.gdshoppingmail.R;

/**
 * Created by yw on 2018/1/19.
 */

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.MyViewHolder> {
    private Context mContext;

    private List<Address> list;

    public AddressAdapter(Context mContext, List<Address> list) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_address_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.activity_address_item_address)
        TextView address_item_address_stv;

        @BindView(R.id.activity_address_item_name)
        TextView address_item_name_tv;

        @BindView(R.id.activity_address_item_phone)
        TextView address_item_phone_tv;

        @BindView(R.id.activity_address_item_set_title)
        TextView address_item_title_tv;

        @BindView(R.id.activity_address_item_set_del)
        TextView address_item_del_tv;

        @BindView(R.id.activity_address_item_set_img)
        ImageView address_item_set_img;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
