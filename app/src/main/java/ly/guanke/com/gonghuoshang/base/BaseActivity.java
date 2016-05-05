package ly.guanke.com.gonghuoshang.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by wang on 2016/3/26.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutId());

        init();
        loadDatas();
    }

    public void loadDatas() {

    }

    public void init() {

    }

    public abstract int getlayoutId() ;
}
