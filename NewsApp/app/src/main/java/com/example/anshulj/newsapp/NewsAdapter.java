package com.example.anshulj.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.anshulj.newsapp.News;
import com.example.anshulj.newsapp.R;

import java.util.ArrayList;

/**
 * Created by Anshul on 13-04-2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> News) {
        super(context, 0, News);
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
        News local_news = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.article_title);
        titleTextView.setText(local_news.getTitle());
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_name);
        authorTextView.setText(local_news.getAuthor());
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionTextView.setText(local_news.getSection());
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_published);
        dateTextView.setText(local_news.getPDate());
        return listItemView;
    }
}

