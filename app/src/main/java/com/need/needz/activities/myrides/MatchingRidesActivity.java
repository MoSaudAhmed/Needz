package com.need.needz.activities.myrides;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.need.needz.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sivasankar on
 * Wed/07/2020 15:31
 */

public class MatchingRidesActivity extends AppCompatActivity {

    private List<RideList> rideList;
    private Context context = MatchingRidesActivity.this;
    private MatchingRidesRVAdapter matchingRidesRVAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_rides);
        setRecyclerView();
        product_list();
    }

    private void setRecyclerView() {
        rideList = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.rv_address);
        matchingRidesRVAdapter = new MatchingRidesRVAdapter(rideList, context);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(matchingRidesRVAdapter);

        product_list();
    }

    private void product_list() {
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
        rideList.add(new RideList("1", "Siva Sankar\nMaram", "D.no:9-66 Siva Sankar\n Vijayawada 521180", "7095138221", "7013880280", ""));
    }
}
