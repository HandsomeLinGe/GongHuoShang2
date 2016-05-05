package ly.guanke.com.gonghuoshang.util;

/**
 * Created by Ken on 2016/3/7.
 * 常量接口类
 */
public interface Constant {

    interface CODE {
        int REUQEST_CODE = 0x001;
        int RESULT_CODE = 0x002;
    }

    interface URL {
        String SEARCHING_BAR = "http://nssug.baidu.com/su?wd=%s&prod=news&ie=utf-8#";
        String WEIJU_URL = "http://vcsp.ifeng.com/vcsp/appData/recommendGroupByTeamid.do?pageSize=20&showType=picture&adapterNo=6.13.1&isNotModified=0&useType=androidPhone&channelId=134915-0&positionId=0";
        String TABNAME_URL = "http://app.jiupaicn.com/indexapp.php?m=content&c=wap&a=keepcates&json[secCode]=&json[usrId]=-1";
        String NEWS_URL = "http://app.jiupaicn.com/indexapp.php?m=content&c=wap&a=lists&json[secCode]=&json[reqType]=%s&json[channelId]=%s&json[columnId]=&json[refreshId]=109986%s&json[refreshDrec]=refresh&json[startRowNum]=%d&json[pageRowLength]=20&json[orderBy]=pubDate&json[orderAsc]=desc&rdnum=0.899313519243151";
        String NEWS_URL2 = "http://app.jiupaicn.com/indexapp.php?m=content&c=wap&a=lists&json[secCode]=&json[reqType]=col&json[channelId]=&json[columnId]=129&json[refreshId]=115535%2C110035&json[refreshDrec]=refresh&json[startRowNum]=1&json[pageRowLength]=20&json[orderBy]=pubDate&json[orderAsc]=desc&rdnum=0.22455699043348432";
        String NEWS_URL3 = "http://app.jiupaicn.com/indexapp.php?m=content&c=wap&a=lists&json[secCode]=&json[reqType]=col&json[channelId]=&json[columnId]=144&json[refreshId]=115535%2C110035&json[refreshDrec]=refresh&json[startRowNum]=1&json[pageRowLength]=20&json[orderBy]=pubDate&json[orderAsc]=desc&rdnum=0.22455699043348432";
        String DETAIL_URL = "http://app.jiupaicn.com/indexapp.php?m=content&c=wap&a=contents&json[secCode]=&json[channelId]=%s&json[columnId]=%s&json[infoId]=%s&json[userId]=";
        String BAIDU_LIST = "http://api.baiyue.baidu.com/sn/api/searchnews?word=%s&pn=0&rn=20&cuid=253C69CC4CEA03776810644C6FF6DC56|808076040482253";
        String SEARCH_DETAIL="http://api.baiyue.baidu.com/sn/api/instantfulltext?url=%s&title=%s&site=%s&time=%s&cuid=253C69CC4CEA03776810644C6FF6DC56|808076040482253";
//        String NEWS_URL = "http://app.jiupaicn.com/indexapp.php?m=content&c=wap&a=lists&json[secCode]=&json[reqType]=%s&json[channelId]=&json[columnId]=%d&json[refreshId]=113782%s&json[refreshDrec]=refresh&json[startRowNum]=%d&json[pageRowLength]=20&json[orderBy]=pubDate&json[orderAsc]=desc&rdnum=0.7177913133054972";

        String VIDEO_LOL_URL = "http://www.demaxiya.com/app/index.php?m=index&showcount=0&__ii=352284040670808&__aa=35cf6b9d76e8db7d&_width=900&height=1440&version=13";
    }

    interface KEYS {

    }
}
