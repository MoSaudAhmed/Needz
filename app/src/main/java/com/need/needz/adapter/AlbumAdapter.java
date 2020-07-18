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

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder> {
    private static String TAG = AlbumAdapter.class.getSimpleName();
    private Context context;
    private List<Payments> nearByList;


    public AlbumAdapter(Context context, List<Payments> nearByList) {
        this.context = context;
        this.nearByList = nearByList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       /* holder.txt_category_name.setText(categoryList.get(position).getCategory_name());
        Glide.with(context).load(categoryList.get(position).getImage_url())
                .placeholder(R.mipmap.fire)
                .into(holder.category_icon);*/

       /*holder.rl_category.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              if (Prefs.getInstance(context).GetValue(Constants.isAdmin).equals("true")){
                  Intent intent = new Intent(context, AdminPost.class);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                  intent.putExtra("id",categoryList.get(position).getId());
                  intent.putExtra("name",categoryList.get(position).getCategory_name());
                  context.startActivity(intent);
              }else if (Prefs.getInstance(context).GetValue(Constants.isAdmin).equals("false")){
                  Intent intent = new Intent(context, AddPost.class);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                  intent.putExtra("id",categoryList.get(position).getId());
                  intent.putExtra("name",categoryList.get(position).getCategory_name());
                  context.startActivity(intent);
              }
           }
       });
*/

    }

    @Override
    public int getItemCount() {
        return 3;
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
