package com.need.needz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.need.needz.R;
import com.need.needz.model.Payments;

import java.util.List;

public class PaymentsAdapter extends RecyclerView.Adapter<PaymentsAdapter.MyViewHolder> {
    private static String TAG = PaymentsAdapter.class.getSimpleName();
    private Context context;
    private List<Payments> paymentList;


    public PaymentsAdapter(Context context, List<Payments> paymentsList) {
        this.context = context;
        this.paymentList = paymentsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recommanded_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 24;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_category_name;
        private ImageView category_icon;
        private RelativeLayout rl_category;

        MyViewHolder(View view) {
            super(view);

        }
    }
}
