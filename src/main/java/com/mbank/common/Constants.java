package com.mbank.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 18/10/2016.
 */
public class Constants {
   /* get root in project*/
    public static final String ROOT_CONFIG_WEBDRIVER = System.getProperty("user.dir").concat("/src/main/resources/chromedriver");

    public static  WebDriver WEB_DRIVER = null;

    /*link for each test case*/

    public static final String GOTO_HOME_MBANK = "http://localhost:8080/mbank/userMainservlet?PROGRAM_ID=LOGIN&mode=GLOBAL_NAVI&kojin_id=123456";
    public static final String GOTO_HOME_MBANK_NOT_BRANCH = "http://localhost:8080/mbank/userMainservlet?PROGRAM_ID=LOGIN&mode=GLOBAL_NAVI&kojin_id=501006";


    /*expect test case for each screen*/
    public static final String EXP_TITLE_HOME = "満足BANK";
    public static final String EXP_LOGIN_SUCCESS = "テスト太郎";
    public static final String EXP_LOGIN_NULL_FAIL = "個人番号を入力してください。";
    public static final String EXP_LOGIN_INVALID_FAIL = "入力した個人番号は個人メニューの利用対象外です。";

}
