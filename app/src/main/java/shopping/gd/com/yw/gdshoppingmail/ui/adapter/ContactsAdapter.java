package shopping.gd.com.yw.gdshoppingmail.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderAdapter;
import shopping.gd.com.yw.domain.model.BrandClassify;
import shopping.gd.com.yw.gdshoppingmail.R;
import shopping.gd.com.yw.gdshoppingmail.view.MyGridView;

/**
 * Created by fan on 2016/8/9.
 */
public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> implements
        StickyHeaderAdapter<ContactsAdapter.HeaderHolder> {

    private BrandItemOnclickListener brandItemOnclickListener;
    private LayoutInflater mInflater;
    private List<BrandClassify> namelist;
    private Context mContext;
    private char lastChar = '\u0000';
    private int DisplayIndex = 0;
    private BrandImgAdapter imageAdapter;

    public ContactsAdapter(Context context, List<BrandClassify> namelist) {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        this.namelist = namelist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View view = mInflater.inflate(R.layout.item_contacts_item, viewGroup, false);

        return new ViewHolder(view);
    }

    //条目文本填充
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final BrandClassify bean = namelist.get(i);
        imageAdapter = new BrandImgAdapter(mContext, bean.brands);
        viewHolder.view.setAdapter(imageAdapter);
        viewHolder.view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                brandItemOnclickListener.brandItemClickListener(view, bean, position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namelist.size();
    }

    public long getHeaderId(int position) {

        //这里面的是如果当前position与之前position重复（内部判断）  则不显示悬浮标题栏  如果不一样则显示标题栏
        char ch = namelist.get(position).pinyin.charAt(0);

        if (lastChar == '\u0000') {

            lastChar = ch;

            return DisplayIndex;
        } else {

            if (lastChar == ch) {

                return DisplayIndex;

            } else {

                lastChar = ch;
                DisplayIndex++;
                return DisplayIndex;
            }

        }
    }

    public HeaderHolder onCreateHeaderViewHolder(ViewGroup parent) {
        final View view = mInflater.inflate(R.layout.item_contacts_head, parent, false);
        return new HeaderHolder(view);
    }

    //悬浮标题栏填充文本
    public void onBindHeaderViewHolder(HeaderHolder viewholder, int position) {
        viewholder.header.setText(namelist.get(position).pinyin.charAt(0) + "");
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        public MyGridView view;

        public TextView brand_tv_refre;

        public LinearLayout brand_li;

        public TextView brand_collent;

        public ViewHolder(View itemView) {
            super(itemView);

            view = itemView.findViewById(R.id.activity_brand_left_item_gv);
            brand_tv_refre = itemView.findViewById(R.id.activity_brand_tv_refre);
            brand_li = itemView.findViewById(R.id.activity_brand_item_li);
            brand_collent = itemView.findViewById(R.id.activity_brand_tv_collent);
        }
    }

    static class HeaderHolder extends RecyclerView.ViewHolder {
        public TextView header;

        public HeaderHolder(View itemView) {
            super(itemView);

            header = (TextView) itemView;
            TextPaint paint = header.getPaint();
            paint.setFakeBoldText(true);
        }
    }

    public void setBrandItemOnclickListener(BrandItemOnclickListener itemOnclickListener) {
        this.brandItemOnclickListener = itemOnclickListener;
    }

    /**
     * 获得指定首字母的位置
     *
     * @param ch
     * @return
     */
    public int getPositionForSection(char ch) {

        for (int i = 0; i < getItemCount(); i++) {
            char firstChar = namelist.get(i).pinyin.charAt(0);
            if (firstChar == ch) {
                return i;
            }
        }
        return -1;

    }

    public interface BrandItemOnclickListener {
        void brandItemClickListener(View v, BrandClassify brand, int position);
    }

}
