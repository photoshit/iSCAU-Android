package cn.scau.scautreasure;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.DefaultInt;
import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

import cn.scau.scautreasure.ui.ClassTable;

/**
 * 应用程序配置文件;
 * User:  Special Leung
 * Date:  13-7-26
 * Time:  下午10:07
 * Mail:  specialcyci@gmail.com
 */

@SharedPref( value = SharedPref.Scope.UNIQUE)
public interface AppConfig {

    @DefaultInt(0)
    int versionCode();           // 当前的versionCode

    @DefaultInt(4)
    int eduServer();             // 当前选择的教务系统服务器;

    @DefaultString("")
    String userName();           // 用户学号

    @DefaultString("")
    String eduSysPassword();     // 教务系统密码

    @DefaultString("")
    String libPassword();        // 图书馆密码

    @DefaultString("")
    String cardPassword();       // 校园卡密码

    @DefaultString("")
    String termStartDate();      // 学期开始时间

    @DefaultString("")
    String lastSeeNotificationDate();      // 上次显示通知的时间

    @DefaultInt(ClassTable.MODE_PARAMS)
    int    classTableShowMode(); // 课程表显示模式;

    @DefaultInt(0xffffffff)
    int widgetFontColor();

    @DefaultString("1.0")
    String widgetFontSize();

    @DefaultString("无")
    String widgetBackground();

    @DefaultBoolean(false)
    boolean classTableAsFirstScreen();

    long lastUpdated();
}
