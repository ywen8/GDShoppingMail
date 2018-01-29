package shopping.gd.com.yw.gdshoppingmail.presenter.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shopping.gd.com.yw.domain.model.Brand;
import shopping.gd.com.yw.domain.model.BrandClassify;
import shopping.gd.com.yw.gdshoppingmail.base.BaseModule;
import shopping.gd.com.yw.gdshoppingmail.presenter.BrandContract;

/**
 * Created by yw on 2018/1/15.
 */

public class BrandModelImpl extends BaseModule implements BrandContract.BrandModel {
    private Context mContext;

    public BrandModelImpl(Context mContext) {
        this.mContext = mContext;
    }

    public static final String[] NAMES = new String[]{"宋江", "卢俊义", "吴用",
            "公孙胜", "关胜", "林冲", "秦明", "呼延灼", "花荣", "柴进", "李应", "朱仝", "鲁智深",
            "武松", "董平", "张清", "杨志", "徐宁", "索超", "戴宗", "刘唐", "李逵", "史进", "穆弘",
            "雷横", "李俊", "阮小二", "张横", "阮小五", " 张顺", "阮小七", "杨雄", "石秀", "解珍",
            " 解宝", "燕青", "朱武", "黄信", "孙立", "宣赞", "郝思文", "韩滔", "彭玘", "单廷珪",
            "魏定国", "萧让", "裴宣", "欧鹏", "邓飞", " 燕顺", "杨林", "凌振", "蒋敬", "吕方",
            "郭 盛", "安道全", "皇甫端", "王英", "扈三娘", "鲍旭", "樊瑞", "孔明", "孔亮", "项充",
            "李衮", "金大坚", "马麟", "童威", "童猛", "孟康", "侯健", "陈达", "杨春", "郑天寿",
            "陶宗旺", "宋清", "乐和", "龚旺", "丁得孙", "穆春", "曹正", "宋万", "杜迁", "薛永", "施恩",
            "周通", "李忠", "杜兴", "汤隆", "邹渊", "邹润", "朱富", "朱贵", "蔡福", "蔡庆", "李立",
            "李云", "焦挺", "石勇", "孙新", "顾大嫂", "张青", "孙二娘", " 王定六", "郁保四", "白胜",
            "时迁", "段景柱"};

    private List<BrandClassify> brandClassifies = new ArrayList<>();
    private List<Brand> brands = new ArrayList<>();

    @Override
    public void loadBrands(BrandContract.BrandView view) {
        for (int i = 0; i < 6; i++) {
            Brand brand = new Brand();
            brands.add(brand);
        }
        for (int s = 1; s < 5; s++) {
            BrandClassify brandClassify = new BrandClassify();
          if (s == 1) {
                brandClassify.tag = "A";
                brandClassify.pinyin = "A";
                brandClassify.brands = brands;

            } else if (s == 2) {
                brandClassify.tag = "B";
                brandClassify.pinyin = "B";
                brandClassify.brands = brands;

            } else if (s == 3) {
                brandClassify.tag = "C";
                brandClassify.pinyin = "C";
                brandClassify.brands = brands;

            } else if (s == 4) {
                brandClassify.tag = "D";
                brandClassify.pinyin = "D";
                brandClassify.brands = brands;

            }
            brandClassifies.add(brandClassify);
        }
        //对集合进行排序
//        Collections.sort(namelist);
        view.barndsShow(brandClassifies);
    }
}
