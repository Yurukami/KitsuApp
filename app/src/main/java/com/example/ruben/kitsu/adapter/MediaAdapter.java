package com.example.ruben.kitsu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTV;

        public ViewHolder(View view) {
            super(view);
        }
    }
}
