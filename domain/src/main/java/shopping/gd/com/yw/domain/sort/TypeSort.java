package shopping.gd.com.yw.domain.sort;


import java.util.Comparator;

import shopping.gd.com.yw.domain.model.ShoppingRecomm;

public class TypeSort implements Comparator<ShoppingRecomm> {


    @Override
    public int compare(ShoppingRecomm o1, ShoppingRecomm o2) {

        return o1.type - o2.type;
    }
}
