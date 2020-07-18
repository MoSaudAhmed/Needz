package com.need.needz.utils;

import android.app.Activity;
import android.content.Intent;

import com.need.needz.R;


public class Utils
{
    private static int sTheme;
    public final static int THEME_GIRL = 0;
    public final static int THEME_MAN = 1;
    public final static int THEME_GAY = 2;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_GIRL:
                activity.setTheme(R.style.AppTheme_girl);
                break;
            case THEME_MAN:
                activity.setTheme(R.style.Theme_Man);
                break;
            case THEME_GAY:
                activity.setTheme(R.style.Theme_Gay);
                break;
        }
    }





}
