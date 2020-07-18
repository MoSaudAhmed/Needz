package com.need.needz.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.need.needz.R;
import com.need.needz.adapter.PaymentsAdapter;
import com.need.needz.model.Payments;

import java.util.ArrayList;
import java.util.List;

public class PaymentsFragment extends Fragment {
    private static String TAG = PaymentsFragment.class.getSimpleName();
    private Context context;
    private List<Payments> paymentsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_payments, container, false);
        context = getActivity();
        setRecyclerViewCategory(view);
        return view;
    }

    private void setRecyclerViewCategory(View view) {
        paymentsList = new ArrayList<>();
        RecyclerView recyclerView = view.findViewById(R.id.rv_nearby);
        PaymentsAdapter paymentsAdapter = new PaymentsAdapter(context, paymentsList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(context,2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(paymentsAdapter);
    }
}
