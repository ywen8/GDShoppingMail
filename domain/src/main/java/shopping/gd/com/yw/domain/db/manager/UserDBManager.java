package shopping.gd.com.yw.domain.db.manager;

import org.greenrobot.greendao.AbstractDao;

import shopping.gd.com.yw.domain.model.User;

/**
 * Created by yw on 2018/1/18.
 */

public class UserDBManager  extends BaseManager<User,Long>{
    @Override
    public AbstractDao<User, Long> getAbstractDao() {
        return daoSession.getUserDao();
    }
}
