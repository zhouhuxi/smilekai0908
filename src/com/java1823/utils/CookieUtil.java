package com.java1823.utils;

import javax.servlet.http.Cookie;

public class CookieUtil {


    // 从Cookie数组中得到指定名称的Cookie
    public static Cookie getCookieByName(Cookie[] cookies, String name) {
        if (cookies == null) {
            return null;
        }
        for (Cookie c : cookies) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }


}
