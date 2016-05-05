package ly.guanke.com.gonghuoshang.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ly.guanke.com.gonghuoshang.LocalImageHolderView;
import ly.guanke.com.gonghuoshang.R;
import ly.guanke.com.gonghuoshang.activity.ChanpinguanliActivity;
import ly.guanke.com.gonghuoshang.activity.GongsiziliaoActivity;
import ly.guanke.com.gonghuoshang.activity.OneActivity;
import ly.guanke.com.gonghuoshang.activity.SonghuojiahuaActivity;
import ly.guanke.com.gonghuoshang.activity.WodedingdanActivity;
import ly.guanke.com.gonghuoshang.activity.WodekehuActivity;
import ly.guanke.com.gonghuoshang.activity.ZhangmuheduiActivity;
import ly.guanke.com.gonghuoshang.base.BaseFragment;

/**
 * Created by wang on 2016/5/5.
 */
public class Homefragment extends BaseFragment {

    private ConvenientBanner cb;
    private GridView gv;

    private int[] icon = {R.drawable.gongsiziliao, R.drawable.chanpinguanli
            , R.drawable.wodedingdan, R.drawable.songhuojihua
            , R.drawable.songhuojihua, R.drawable.zhangmuhedui

    };
    private String[] iconName = {"公司资料", "产品管理", "我的订单", "送货计划"
            , "账目核对", "我的客户"};
    private List<Map<String, Object>> datas;
    private List<String> imgurllist;

    @Override
    protected int getContentResid() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init(View view) {
        cb = (ConvenientBanner) view.findViewById(R.id.convenientBanner);
        gv = (GridView) view.findViewById(R.id.gridview);

        String path1 = "http://banbao.chazidian.com/uploadfile/2016-01-25/s145368924044608.jpg";
        String path2 = "http://pic32.nipic.com/20130829/12906030_124355855000_2.png";
        String path3 = "http://pic32.nipic.com/20130829/12906030_124355855000_2.png";

        imgurllist = new ArrayList<>();
        imgurllist.add(path1);
        imgurllist.add(path2);
        imgurllist.add(path3);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(getActivity(), GongsiziliaoActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ChanpinguanliActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), WodedingdanActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), SonghuojiahuaActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), ZhangmuheduiActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), WodekehuActivity.class);
                        startActivity(intent5);
                        break;

                }

            }
        });

    }

    @Override
    protected void loadDatas() {

        datas = new ArrayList<>();
        getdata();
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), datas, R.layout.home_item, from, to);
        gv.setAdapter(adapter);


        //viewpager的设置
        cb.setPages(
                new CBViewHolderCreator<LocalImageHolderView>() {
                    @Override
                    public LocalImageHolderView createHolder() {
                        return new LocalImageHolderView();
                    }
                }, imgurllist)

                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
                .setPageIndicator(new int[]{R.drawable.xiaobaidian_checked, R.drawable.xiaobaidian_unchecked})
                //设置指示器的方向
                .startTurning(4000)//设置自动滑动4s
                .setOnItemClickListener(new OnItemClickListener() {
                    //viewpager的点击事件
                    @Override
                    public void onItemClick(int position) {
                        Intent intent = new Intent(getActivity(), OneActivity.class);
                        Bundle bundle = new Bundle();
//                        bundle.putSerializable("datas", datas.get(position));
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                })

                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT);
        //设置翻页的效果，不需要翻页效果可用不设
        //.setPageTransformer(Transformer.DefaultTransformer);    集成特效之后会有白屏现象，新版已经分离，如果要集成特效的例子可以看Demo的点击响应。
//        convenientBanner.setManualPageable(false);//设置不能手动影响

    }


    private List<Map<String, Object>> getdata() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            datas.add(map);
        }

        return datas;
    }


}
