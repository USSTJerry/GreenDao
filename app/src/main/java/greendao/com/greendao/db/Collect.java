package greendao.com.greendao.db;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;




/**
 * Created by  on 2018/7/13.
 * description:
 */
@Entity
public class Collect {

    @Id
    private Long newsId;//ID
    @Property(nameInDb = "URL")
    private String url;//稿件URL
    @Property(nameInDb = "VIDEOURL")
    private String videourl;//视频URL
//    @Property(nameInDb = "IMGURLS")
//    private List<String> imgUrls;//图片URL
    @Generated(hash = 2076253060)
    public Collect(Long newsId, String url, String videourl) {
        this.newsId = newsId;
        this.url = url;
        this.videourl = videourl;
    }
    @Generated(hash = 1726975718)
    public Collect() {
    }
    public Long getNewsId() {
        return this.newsId;
    }
    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getVideourl() {
        return this.videourl;
    }
    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

   // @Convert(/**指定转换器 **/converter = MyObjectConverent.class,/**指定数据库中的列字段**/columnType =String.class )
   // private List<String> imgUrls;


  

}
