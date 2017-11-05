package com.example.xyzreader;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by STEVEN on 05/11/2017.
 */

public class Tools {

    /**
     * Checks internet availability
     *
     * @param context The context of the Activity ( or attached Fragment) that requests
     *                the online state verification
     * @Retuns true if the device is online.
     */
    public static boolean isInternetAvailaible(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
