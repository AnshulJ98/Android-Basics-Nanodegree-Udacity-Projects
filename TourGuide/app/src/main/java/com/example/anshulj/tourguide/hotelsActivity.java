package com.example.anshulj.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class hotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loaction_list);

        ArrayList<item> location = new ArrayList<item>();
        location.add(new item(getString(R.string.h1), R.drawable.h1nm));
        location.add(new item(getString(R.string.h2), R.drawable.h2nye));
        location.add(new item(getString(R.string.h3), R.drawable.h3l));
        location.add(new item(getString(R.string.h4), R.drawable.h4s));
        location.add(new item(getString(R.string.h5), R.drawable.h5p));
        location.add(new item(getString(R.string.h6), R.drawable.h6pl));
        location.add(new item(getString(R.string.h7), R.drawable.h7gw));
        location.add(new item(getString(R.string.h8), R.drawable.h8w));
        location.add(new item(getString(R.string.h9), R.drawable.h9gp));
        location.add(new item(getString(R.string.h10), R.drawable.h10sh));

        ItemAdapter adapter = new ItemAdapter(this, location);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
