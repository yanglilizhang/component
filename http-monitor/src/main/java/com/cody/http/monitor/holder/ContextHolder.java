package com.cody.http.monitor.holder;

import android.content.Context;

/**
 * Created by xu.yi. on 2019/4/5.
 * ContextHolder
 */
public class ContextHolder {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        ContextHolder.context = context;
    }

}
