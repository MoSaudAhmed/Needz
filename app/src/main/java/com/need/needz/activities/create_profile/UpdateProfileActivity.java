package com.need.needz.activities.create_profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.jaredrummler.materialspinner.MaterialSpinner;
import com.need.needz.R;
import com.need.needz.activities.MainActivity;
import com.need.needz.utils.Prefs;
import com.need.needz.utils.Utils;

import butterknife.ButterKnife;

public class UpdateProfileActivity extends AppCompatActivity {
    private static String TAG = UpdateProfileActivity.class.getSimpleName();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_update_profile);
        context= UpdateProfileActivity.this;
        ButterKnife.bind(this);

        setting_spinner();

        findViewById(R.id.txt_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
    private void setting_spinner() {
        MaterialSpinner employee_position = findViewById(R.id.spinner_position);
        MaterialSpinner Country = findViewById(R.id.spinner_country);
        String[] arr = {"Part Time", "Full Time"};
        String[] country = {"Work Permit", "Work Permit", "Work Permit", "Work Permit", "Work Permit", "Security Officer", "Security Officer"};
        Country.setItems(country);
        employee_position.setItems(arr);
        employee_position.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Prefs.getInstance(context).SetValue("selected",item);
                Snackbar.make(view, "Clicked " + Prefs.getInstance(context).GetValue("selected"), Snackbar.LENGTH_LONG).show();

            }
        });

        Country.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Prefs.getInstance(context).SetValue("selected",item);
                Snackbar.make(view, "Clicked " + Prefs.getInstance(context).GetValue("selected"), Snackbar.LENGTH_LONG).show();

            }
        });
        Country.getPopupWindow();
        employee_position.getPopupWindow();
    }
}
