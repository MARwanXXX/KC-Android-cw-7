package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter {

    List<Items> itemList;

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

        Items currentItem = itemList.get(position);

        TextView itemNameTxt = view.findViewById(R.id.itemNameTxt);
        TextView itemPriceTxt = view.findViewById(R.id.itemPriceTxt);
        ImageView itemImage = view.findViewById(R.id.itemImage);

        itemNameTxt.setText(currentItem.getItemName());
        itemPriceTxt.setText(String.valueOf(currentItem.getItemPrice()));
        itemImage.setImageResource(currentItem.getItemImg());

        return view;
    }
}
