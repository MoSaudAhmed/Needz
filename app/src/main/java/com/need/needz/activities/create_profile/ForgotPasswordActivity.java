package com.need.needz.activities.create_profile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.need.needz.R;
import com.need.needz.utils.Utils;

/**
 * Created by sivasankar on
 * Thu/07/2020 23:50
 */

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_for_password);

    }
}
