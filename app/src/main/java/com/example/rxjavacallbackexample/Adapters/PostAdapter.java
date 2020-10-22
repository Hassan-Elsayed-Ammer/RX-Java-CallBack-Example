package com.example.rxjavacallbackexample.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rxjavacallbackexample.R;
import com.example.rxjavacallbackexample.model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    Context context ;
    List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_item,parent,false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        holder.tx_author.setText(String.valueOf(postList.get(position).userId));
        holder.tx_title.setText(String.valueOf(postList.get(position).title));
        holder.tx_content.setText(new StringBuilder(postList.get(position)
        .body.substring(0,20))
                .append("....").toString());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
