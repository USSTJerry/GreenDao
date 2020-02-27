package greendao.com.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import greendao.com.greendao.db.Collect;
import greendao.com.greendao.db.CollectDaoUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Collect collect = new Collect();
        collect.setUrl("testUrl");
        collect.setVideourl("testVideoUrl");
        CollectDaoUtil.insertCollect(collect);
        Log.e("dbSizeBefore==",CollectDaoUtil.queryAllSize()+"=="+CollectDaoUtil.queryAll().get(0).getUrl());
        CollectDaoUtil.deleteAllCollect();
        Log.e("dbSizeAfter==",CollectDaoUtil.queryAllSize()+"==");

    }
}
