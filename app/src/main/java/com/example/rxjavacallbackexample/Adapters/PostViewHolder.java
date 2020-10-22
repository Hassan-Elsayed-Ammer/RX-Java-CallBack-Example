package com.example.rxjavacallbackexample.Adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rxjavacallbackexample.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView tx_title , tx_content,tx_author ;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        tx_author = (TextView)itemView.findViewById(R.id.tx_author);
        tx_content = (TextView)itemView.findViewById(R.id.tx_content);
        tx_title = (TextView)itemView.findViewById(R.id.tx_title);
    }
}
