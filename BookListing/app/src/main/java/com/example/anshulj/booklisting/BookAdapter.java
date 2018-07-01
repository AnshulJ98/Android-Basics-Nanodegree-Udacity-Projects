package com.example.anshulj.booklisting;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, ArrayList<Book> Book) {
        super(context, 0, Book);
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
        Book local_book = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.book_name);
        titleTextView.setText(local_book.getTitle());
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_name);
        authorTextView.setText(local_book.getAuthor());


        return listItemView;
    }
}
