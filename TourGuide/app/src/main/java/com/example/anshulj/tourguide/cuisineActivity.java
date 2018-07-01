package com.example.anshulj.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class cuisineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loaction_list);

        ArrayList<item> location = new ArrayList<item>();
        location.add(new item(getString(R.string.c1), R.drawable.c1nyp));
        location.add(new item(getString(R.string.c2), R.drawable.c2pb));
        location.add(new item(getString(R.string.c3), R.drawable.c3c));
        location.add(new item(getString(R.string.c4), R.drawable.c4bl));
        location.add(new item(getString(R.string.c5), R.drawable.c5c));
        location.add(new item(getString(R.string.c6), R.drawable.c6m));
        location.add(new item(getString(R.string.c7), R.drawable.c7c));
        location.add(new item(getString(R.string.c8), R.drawable.c8k));
        location.add(new item(getString(R.string.c9), R.drawable.c9cb));
        location.add(new item(getString(R.string.c10), R.drawable.c10cc));

        ItemAdapter adapter = new ItemAdapter(this, location);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
