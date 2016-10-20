package com.mbank.common;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 20/10/2016.
 */
public class StringUtil {


    public static boolean isEmpty(String value){
        if(value == null || value.length() == 0) return  true;
        return false;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isBlank(String str) {
         int strLen;
        if (str == null || (strLen = str.length()) == 0) {
             return true;
         }
         for (int i = 0; i < strLen; i++) {
           if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
             }
         }
             return true;
      }

}
