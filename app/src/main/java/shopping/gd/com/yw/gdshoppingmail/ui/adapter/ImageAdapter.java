package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import shopping.gd.com.yw.commonlib.utils.ImageUtils;
import shopping.gd.com.yw.domain.model.Shopping;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;


/**
 * author : Rain
 * time : 2017/10/20 0020
 * explain :
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private List<Shopping> images;
    private boolean isShow;


    public void setImages(List<Shopping> images) {
        this.images = images;
    }

    public ImageAdapter(Context context, List<Shopping> images, boolean isShow) {
        this.context = context;
        this.images = images;
        this.isShow = isShow;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int position) {
        return images.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.fm_home_item_button, null);
            viewHolder.iv_image = convertView.findViewById(R.id.iv_item_image);
            viewHolder.fm_home_item_sales_name = convertView.findViewById(R.id.fm_home_item_sales_name);
            viewHolder.fm_home_adapter_sales_li = convertView.findViewById(R.id.fm_home_item_sales_li);
            viewHolder.fm_home_item_sales_price = convertView.findViewById(R.id.fm_home_item_sales_price);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (isShow) {
            viewHolder.fm_home_adapter_sales_li.setVisibility(View.VISIBLE);
            viewHolder.fm_home_item_sales_name.setText(images.get(position).name);
            viewHolder.fm_home_item_sales_price.setText(images.get(position).price);
        } else {
            viewHolder.fm_home_adapter_sales_li.setVisibility(View.GONE);
        }
        ImageUtils.image(context, BaseApiService.BASE_URL + "/background/img/logo.png", viewHolder.iv_image);

        return convertView;
    }

    public final class ViewHolder {
        public ImageView iv_image;


        public LinearLayout fm_home_adapter_sales_li;


        public TextView fm_home_item_sales_name;


        public TextView fm_home_item_sales_price;

    }
}
