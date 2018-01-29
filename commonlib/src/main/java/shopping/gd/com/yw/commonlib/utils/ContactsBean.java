package shopping.gd.com.yw.commonlib.utils;

/**
 * Created by fan on 2016/8/9.
 */
public class ContactsBean implements Comparable<ContactsBean> {

    public String name;
    public String pinyin;
    public char tag;

    public ContactsBean(String name){
        this.name = name;
        this.pinyin = PinYinUtils.getPinYin(name);
        this.tag=this.pinyin.charAt(0);
    }

    @Override
    public int compareTo(ContactsBean another) {
        return this.pinyin.compareTo(another.pinyin);
    }
}
