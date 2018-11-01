package com.by5388.xw.learnjni;

/**
 * @author by5388  on 2018/11/1.
 */
public class Tools {
    protected static String pyQuery(String s) {
        String[] ss = s.split("");
        String news = ss[0] + "%";
        for (int i = 1; i < ss.length; i++)
            news += ss[i] + "%";
        return news;
    }

    protected static String pyQueryStringBuilder(String s) {
        String[] ss = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : ss) {
            stringBuilder.append(str).append("%");
        }
        return stringBuilder.toString();
    }

    protected static String pyQueryReplace(String s) {
        return s.replaceAll("", "%").substring(1);
    }
}
