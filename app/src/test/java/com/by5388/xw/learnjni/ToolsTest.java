package com.by5388.xw.learnjni;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author by5388  on 2018/11/1.
 */
public class ToolsTest {

    private final static String OLD_STRING = "qwertyuiop";
    private final static String NEW_STRING = "q%w%e%r%t%y%u%i%o%p%";

    @Test
    public void pyQuery() {
        System.out.println(Tools.pyQuery(OLD_STRING));
    }

    @Test
    public void pyQueryStringBuilder() {
        assertEquals(NEW_STRING, Tools.pyQueryStringBuilder(OLD_STRING));
    }

    @Test
    public void pyQueryReplace() {
        assertEquals(NEW_STRING, Tools.pyQueryReplace(OLD_STRING));
    }
}