package com.need.needz.activities.myrides;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.need.needz.R;

/**
 * Created by sivasankar on
 * Wed/07/2020 10:35
 */

public class MyRidesActivity extends AppCompatActivity {

    LinearLayout personalinfo, review;
    TextView personalinfobtn, reviewbtn;
    private Button findRideBtn,offerRideBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_rides_activity_layout);
        initWidget();

        personalinfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.VISIBLE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.black));
                reviewbtn.setTextColor(getResources().getColor(R.color.gray));

            }
        });

        reviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                review.setVisibility(View.VISIBLE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.gray));
                reviewbtn.setTextColor(getResources().getColor(R.color.black));

            }
        });

        findRideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent matchingRidesIntent = new Intent(MyRidesActivity.this,MatchingRidesActivity.class);
                startActivity(matchingRidesIntent);
            }
        });

        offerRideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent matchingRidesIntent = new Intent(MyRidesActivity.this,MatchingRidesActivity.class);
                startActivity(matchingRidesIntent);
            }
        });
    }

    private void initWidget() {
        findRideBtn=(Button)findViewById(R.id.find_ride_search_btn);
        offerRideBtn=(Button)findViewById(R.id.offer_ride_search_btn);
        personalinfo = findViewById(R.id.personalinfo);
        review = findViewById(R.id.review);
        personalinfobtn = findViewById(R.id.personalinfobtn);
        reviewbtn = findViewById(R.id.reviewbtn);
        /*making personal info visible*/
        personalinfo.setVisibility(View.VISIBLE);
        review.setVisibility(View.GONE);

    }
}
