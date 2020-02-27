package greendao.com.greendao;

import android.app.Application;
import greendao.com.greendao.db.DBHelper;
import greendao.com.greendao.db.DaoMaster;
import greendao.com.greendao.db.DaoSession;

public class MyApplication extends Application {

    private static DaoSession daoSession;

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        initGreenDAO();
    }

    /**
     * 初始化数据库
     */
    private void initGreenDAO() {
        // 通过 DaoMaster 的内部类 DevOpenHelper，你可以得到一个便利的 SQLiteOpenHelper 对象。
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为 greenDAO 已经帮你做了。
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。

//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "user.db", null);
//        mDb = helper.getEncryptedWritableDb("123");
//        DaoMaster daoMaster = new DaoMaster(mDb);
//        mDaoSession = daoMaster.newSession();
        DBHelper devOpenHelper = new DBHelper(this);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        daoSession = daoMaster.newSession();
    }




}
