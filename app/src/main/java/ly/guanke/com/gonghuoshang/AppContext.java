package ly.guanke.com.gonghuoshang;

import android.app.Application;
import android.graphics.Bitmap;

import com.squareup.picasso.LruCache;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import ly.guanke.com.gonghuoshang.util.ShareUtil;
import ly.guanke.com.gonghuoshang.util.VolleyUtil;

/**
 * Created by Ken on 2016/3/18.
 */
public class AppContext extends Application {

    private static final String TAG = "print";

    @Override
    public void onCreate() {
        super.onCreate();

        VolleyUtil.initVolley(this);
        /***
         * 初始化
         */
        ShareUtil.initShared(this);

        //配置毕加索
        Picasso picasso = new Picasso.Builder(this)
                //配置内存缓存
                .memoryCache(new LruCache(10 * 1024 * 1024))
                .defaultBitmapConfig(Bitmap.Config.ARGB_8888)
                //设置下载器
                .downloader(new OkHttpDownloader(getCacheDir(), 20 * 1024 * 1024))
                .build();
        Picasso.setSingletonInstance(picasso);
    }
}
