package ly.guanke.com.gonghuoshang.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ken on 2016/3/8.
 * 共享参数的工具类
 */
public class ShareUtil {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    /**
     * 初始化共享参数
     *
     * @param context
     */
    public static void initShared(Context context) {
        sharedPreferences = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static void putString(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public static String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public static void putInt(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public static void putboolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static boolean getboolean(String key, boolean defalutvalue) {

        return sharedPreferences.getBoolean(key, defalutvalue);
    }

    public static int getInt(String key, int defalutvalue) {

        return sharedPreferences.getInt(key, defalutvalue);
    }
}
