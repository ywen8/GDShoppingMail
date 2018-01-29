package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

import shopping.gd.com.yw.commonlib.utils.ImageUtils;
import shopping.gd.com.yw.domain.model.Brand;
import shopping.gd.com.yw.domain.service.BaseApiService;
import shopping.gd.com.yw.gdshoppingmail.R;


/**
 * author : Rain
 * time : 2017/10/20 0020
 * explain :
 */

public class BrandImgAdapter extends BaseAdapter {
    private Context context;
    private List<Brand> images;


    public void setImages(List<Brand> images) {
        this.images = images;
    }

    public BrandImgAdapter(Context context, List<Brand> images) {
        this.context = context;
        this.images = images;
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
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        ImageUtils.image(context, BaseApiService.BASE_URL + "/background/img/logo.png", viewHolder.iv_image);

        return convertView;
    }

    public final class ViewHolder {
        public ImageView iv_image;


    }
}
