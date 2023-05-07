package com.guy.class23b_andb_4;

//public class Adapter_Property {


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class Adapter_Property extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Property> properties;

    public Adapter_Property(Context context, ArrayList<Property> properties) {
        this.context = context;
        this.properties = properties;
    }

    @Override
    public int getItemCount() {
        return properties == null ? 0 : properties.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_second, parent, false);
            SecondViewHolder mySecondViewHolder = new SecondViewHolder(view);
            return mySecondViewHolder;
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_fresh, parent, false);
            FreshViewHolder freshViewHolder = new FreshViewHolder(view);
            return freshViewHolder;
        }
    }

    @Override
    public int getItemViewType(int position) {
        Property property = properties.get(position);
        if (property instanceof Second) {
            return 0;
        }
        return 1;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder _holder, final int position) {
        Log.d("pttt", "Pos= " + position);
        //Property property = properties.get(position);


        if (getItemViewType(position) == 0) {
            SecondViewHolder holder = (SecondViewHolder) _holder;
            Second second = (Second) properties.get(position);
            holder.property_LBL_status.setText(second.getStatus());
            holder.property_LBL_desc.setText(second.getDesc());
            holder.property_LBL_price.setText(second.getPrice() + " ₪");

            MyImageUtils.getInstance().load(second.getImage(), holder.property_IMG_1);
            MyImageUtils.getInstance().load(second.getImage(), holder.property_IMG_2);
            MyImageUtils.getInstance().load(second.getImage(), holder.property_IMG_3);
        } else {
            Fresh fresh = (Fresh) properties.get(position);
            FreshViewHolder holder = (FreshViewHolder) _holder;

            holder.property_LBL_contractor.setText(fresh.getContractor());
            holder.property_LBL_extra.setText(fresh.getExtra());
            holder.property_LBL_desc.setText(fresh.getDesc());
            holder.property_LBL_price.setText(fresh.getPrice() + " ₪");

            MyImageUtils.getInstance().load(fresh.getImage(), holder.property_IMG_1);
            MyImageUtils.getInstance().load(fresh.getLogo(), holder.property_IMG_logo);
        }





    }

    class SecondViewHolder extends RecyclerView.ViewHolder {

        private AppCompatImageView property_IMG_1;
        private AppCompatImageView property_IMG_2;
        private AppCompatImageView property_IMG_3;
        private MaterialTextView property_LBL_desc;
        private MaterialTextView property_LBL_location;
        private MaterialTextView property_LBL_status;
        private MaterialTextView property_LBL_year;
        private MaterialTextView property_LBL_price;

        public SecondViewHolder(View itemView) {
            super(itemView);
            property_IMG_1 = itemView.findViewById(R.id.property_IMG_1);
            property_IMG_2 = itemView.findViewById(R.id.property_IMG_2);
            property_IMG_3 = itemView.findViewById(R.id.property_IMG_3);
            property_LBL_desc = itemView.findViewById(R.id.property_LBL_desc);
            property_LBL_location = itemView.findViewById(R.id.property_LBL_location);
            property_LBL_status = itemView.findViewById(R.id.property_LBL_status);
            property_LBL_year = itemView.findViewById(R.id.property_LBL_year);
            property_LBL_price = itemView.findViewById(R.id.property_LBL_price);
        }
    }

    class FreshViewHolder extends RecyclerView.ViewHolder {

        private AppCompatImageView property_IMG_1;
        private AppCompatImageView property_IMG_logo;
        private MaterialTextView property_LBL_contractor;
        private MaterialTextView property_LBL_desc;
        private MaterialTextView property_LBL_location;
        private MaterialTextView property_LBL_extra;
        private MaterialTextView property_LBL_price;

        public FreshViewHolder(View itemView) {
            super(itemView);
            property_IMG_1 = itemView.findViewById(R.id.property_IMG_1);
            property_IMG_logo = itemView.findViewById(R.id.property_IMG_logo);
            property_LBL_desc = itemView.findViewById(R.id.property_LBL_desc);
            property_LBL_location = itemView.findViewById(R.id.property_LBL_location);
            property_LBL_contractor = itemView.findViewById(R.id.property_LBL_contractor);
            property_LBL_extra = itemView.findViewById(R.id.property_LBL_extra);
            property_LBL_price = itemView.findViewById(R.id.property_LBL_price);
        }
    }
}
