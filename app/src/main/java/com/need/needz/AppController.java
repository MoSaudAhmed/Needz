package com.need.needz;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.need.needz.services.RestClient;
import com.need.needz.utils.Prefs;


public class AppController extends Application {

    private static RestClient restClient;

    @Override
    public void onCreate() {
        super.onCreate();

        Prefs.getInstance(this);
    }

    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    public static RestClient getRestClient() {
        if (restClient == null) {
            return restClient = new RestClient();
        }
        return restClient;
    }
}
