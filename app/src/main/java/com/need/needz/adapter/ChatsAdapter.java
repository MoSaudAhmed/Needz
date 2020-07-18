package com.need.needz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.need.needz.R;
import com.need.needz.model.Chat;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder> {
	
	private Context context;
	private ArrayList<Chat> chats;
	
	public ChatsAdapter(Context context, ArrayList<Chat> chats) {
		this.context = context;
		this.chats = chats;
	}
	
	@NonNull
	@Override
	public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
		return new ChatsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_row, viewGroup, false));
	}
	
	@Override
	public void onBindViewHolder(@NonNull ChatsViewHolder chatsViewHolder, int i) {

	}
	
	@Override
	public int getItemCount() {
		if (chats != null) {
			return 9;
		}
		return 0;
	}
	
	class ChatsViewHolder extends RecyclerView.ViewHolder {
		CircleImageView profilePic;
		TextView tvName;
		TextView tvMsg;
		TextView tvTime;
		RelativeLayout rl_root;
		
		ChatsViewHolder(@NonNull View itemView) {
			super(itemView);
			rl_root = itemView.findViewById(R.id.rl_root);
		}
	}
}
