package ly.guanke.com.gonghuoshang.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import ly.guanke.com.gonghuoshang.R;
import ly.guanke.com.gonghuoshang.base.BaseActivity;
import ly.guanke.com.gonghuoshang.fragment.Homefragment;
import ly.guanke.com.gonghuoshang.fragment.MimnFragment;

public class MainActivity extends BaseActivity {


    private RadioGroup rg;
    private TextView tvtitle;

    @Override
    public int getlayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        tvtitle = (TextView) findViewById(R.id.tv_title);
        rg = (RadioGroup) findViewById(R.id.rg_navigation);
        rg.getChildAt(0).performClick();
    }


    public void click(View view) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        Fragment home = supportFragmentManager.findFragmentByTag("home");
        Fragment mimn = supportFragmentManager.findFragmentByTag("mimn");
        if (home != null) {
            fragmentTransaction.hide(home);
        }
        if (mimn != null) {
            fragmentTransaction.hide(mimn);
        }

        switch (view.getId()) {

            case R.id.btn_home:
                tvtitle.setText("公司");
                Homefragment homefragment=new Homefragment();
                Bundle bundle1=new Bundle();
                homefragment.setArguments(bundle1);
                if (home != null) {
                    fragmentTransaction.show(home);

                } else {
                    fragmentTransaction.add(R.id.fl_container, homefragment, "home");
                }
                break;
            case R.id.btn_mimn:
                tvtitle.setText("我的");
                MimnFragment mimnFragment=new MimnFragment();
                Bundle bundle2=new Bundle();

                mimnFragment.setArguments(bundle2);
                if (mimn != null) {
                    fragmentTransaction.show(mimn);
                } else {
                    fragmentTransaction.add(R.id.fl_container, mimnFragment, "mimn");
                }
                break;

        }

        fragmentTransaction.commit();
    }
}
