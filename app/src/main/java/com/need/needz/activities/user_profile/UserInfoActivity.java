package com.need.needz.activities.user_profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.need.needz.R;
import com.need.needz.utils.Utils;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_user_info);
    }
}
