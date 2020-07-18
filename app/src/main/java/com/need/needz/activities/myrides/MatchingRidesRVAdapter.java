package com.need.needz.activities.myrides;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.need.needz.R;
import java.util.List;

/**
 * Created by sivasankar on
 * Wed/07/2020 15:36
 */

public class MatchingRidesRVAdapter extends RecyclerView.Adapter<MatchingRidesRVAdapter.MyViewHolder> {
    private List<RideList> productList;
    private Context context;

    public MatchingRidesRVAdapter(List<RideList> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public MatchingRidesRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.manage_ride_list_custom_adapter, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(productList.get(position).getName());
        holder.address.setText(productList.get(position).getAddress());

        holder.request_ride.setOnClickListener(v -> {

        });
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title, address, request_ride;

        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            address = view.findViewById(R.id.address_detail);
            request_ride = view.findViewById(R.id.request_ride);
        }
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
