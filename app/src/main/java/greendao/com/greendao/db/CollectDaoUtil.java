package greendao.com.greendao.db;



import java.util.List;


import greendao.com.greendao.MyApplication;


/**
 * Created by  on 2018/6/25.
 * description:
 */

public class CollectDaoUtil {
    /**
     * 添加数据，如果有重复则覆盖
     *
     * @param sub
     */
    public  static  void insertCollect(Collect sub){
        MyApplication.getDaoInstant().getCollectDao().insertOrReplace(sub);
    }
    /**
     * 删除数据
     *
     * @param id
     */
    public static void deleteCollect(long id) {
        MyApplication.getDaoInstant().getCollectDao().deleteByKey(id);
    }

    public static void deleteMulCollect(long id) {
        MyApplication.getDaoInstant().getCollectDao().deleteInTx();
    }
    public static void deleteAllCollect() {
        MyApplication.getDaoInstant().getCollectDao().deleteAll();
    }



    /**
     * 更新数据
     */
    public static void updateShop(Collect sub) {
        MyApplication.getDaoInstant().getCollectDao().update(sub);
    }
        /**
         * 查询条件为keyword的数据
         *
         * @return
         */
       /* public static List<Collect> queryCollect(String keyWord) {
            return MyApplication.getDaoInstant().getCollectDao().queryBuilder().where(CollectDao.Properties.Title.like("%"+keyWord+"%")).list();
        }*/


    /**
     * 查询所有数据
     *
     * @return
     */
    public static List<Collect> queryAll() {
        List<Collect> collects = MyApplication.getDaoInstant().getCollectDao().loadAll();
        //Collections.reverse(collects);

        return collects;//
    }

    public static int queryAllSize() {
        List<Collect> collects = MyApplication.getDaoInstant().getCollectDao().loadAll();
        //Collections.reverse(collects);

        return collects.size();//
    }

    /**
     * 查询前10条数据
     *
     * @return
     */
    public static List<Collect> queryTenItem() {
        return MyApplication.getDaoInstant().getCollectDao().queryBuilder().limit(3).list();
       // return App.getDaoInstant().getCollectDao().queryBuilder().limit(2).orderAsc().list();
    }


}
