package com.demolibrary.logutillibrary;

import android.util.Log;

public class LogClass {

    private static final String TAG = "AWESOME APP";

    public static void debug(String msg) {

        Log.d(TAG, "debug msg: " + msg);
    }

    public static void error(String msg) {

        Log.d(TAG, "error msg: " + msg);
    }

    public static void verbose(String msg) {

        Log.v(TAG, "verbose msg: " + msg);
    }

    public static void info(String msg) {

        Log.i(TAG, "info msg: " + msg);
    }

    public static void warn(String msg) {

        Log.w(TAG, "warn msg: " + msg);
    }
}
