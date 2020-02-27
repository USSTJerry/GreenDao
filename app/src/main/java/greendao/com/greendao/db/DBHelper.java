package greendao.com.greendao.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;

import org.greenrobot.greendao.database.Database;


/**
 * Created by  on 2018/7/12.
 * description:
 */



public class DBHelper extends DaoMaster.OpenHelper {
    public static final String DBNAME = "test.db";

    public DBHelper(Context context) {
        super(context, DBNAME, null);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        MigrationHelper.migrate(db, new MigrationHelper.ReCreateAllTableListener() {
            @Override
            public void onCreateAllTables(Database db, boolean ifNotExists) {
                DaoMaster.createAllTables(db, ifNotExists);
            }
            @Override
            public void onDropAllTables(Database db, boolean ifExists) {
                DaoMaster.dropAllTables(db, ifExists);
            }
        }, CollectDao.class/*, AdverDataDao.class,LoginedHistoryDao.class,LoginedCollectDao.class,ChannelDao.class,PlayHistoryDao.class*/);
    }
}

