package com.example.omokproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.CustomViewHolder> {

    private ArrayList<RoomData> arrayList;

    public RoomAdapter(ArrayList<RoomData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RoomAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RoomAdapter.CustomViewHolder holder, int position) {
        holder.portnumber.setText(arrayList.get(position).getPortnumber());
        holder.portnumber.setText(arrayList.get(position).getIpnumber());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String curPort = holder.portnumber.getText().toString();
                Toast.makeText(view.getContext(), curPort, Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView portnumber;
        protected TextView ipnumber;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.portnumber = (TextView) itemView.findViewById(R.id.portnumber);
            this.ipnumber = (TextView) itemView.findViewById(R.id.ipnumber);
        }
    }
}
