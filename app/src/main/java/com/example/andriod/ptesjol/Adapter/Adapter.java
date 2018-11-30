package com.example.andriod.ptesjol.Adapter;


import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.andriod.ptesjol.Model.House;
import com.example.andriod.ptesjol.R;
import com.facebook.drawee.view.SimpleDraweeView;

public class Adapter extends RecyclerView.Adapter<DataViewHolder> {

    private House[] houses;
    public Adapter(){
        houses = new House[0];
    }

    public void setEvents(House[] events) {
        this.houses = events;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_houses, parent, false);
        DataViewHolder dataViewHolder = new DataViewHolder(view);
        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int position) {
        House house = houses[position];
        double rentPrice = house.getRentPrice();
        String rentPriceAsString = Double.toString(rentPrice);
        dataViewHolder.getTxtHouseTitle().setText(house.getHouseName());
        dataViewHolder.getTxtHousePrice().setText(rentPriceAsString);
        Uri imageUri = Uri.parse(house.getImgUrl());
        dataViewHolder.getImgHouse().setImageURI(imageUri);
    }

    @Override
    public int getItemCount() {
        return houses.length;
    }
}
class DataViewHolder extends RecyclerView.ViewHolder {
    private SimpleDraweeView imgHouse;
    private TextView txtHouseTitle;
    private TextView txtHousePrice;

    public SimpleDraweeView getImgHouse() {
        return imgHouse;
    }

    public TextView getTxtHouseTitle() {
        return txtHouseTitle;
    }

    public TextView getTxtHousePrice() {
        return txtHousePrice;
    }

    public DataViewHolder(View itemView) {
        super(itemView);

        imgHouse = itemView.findViewById(R.id.img_house);
        txtHouseTitle = itemView.findViewById(R.id.txt_houseName);
        txtHousePrice = itemView.findViewById(R.id.txt_housePrice);

    }
}
