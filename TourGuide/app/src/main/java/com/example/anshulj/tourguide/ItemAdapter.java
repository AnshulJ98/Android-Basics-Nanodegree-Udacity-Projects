package com.example.anshulj.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemAdapter extends ArrayAdapter<item> {
    public ItemAdapter(Activity context, ArrayList<item> location) {
        super(context, 0, location);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );

        }
        item local_item = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.text_view);
        textView.setText(local_item.getItemName());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(local_item.getImageResourceId());


        return listItemView;
    }
}
