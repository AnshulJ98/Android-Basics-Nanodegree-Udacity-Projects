package com.example.anshulj.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class barsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loaction_list);

        ArrayList<item> location = new ArrayList<item>();
        location.add(new item(getString(R.string.b1), R.drawable.b1dr));
        location.add(new item(getString(R.string.b2), R.drawable.b2cc));
        location.add(new item(getString(R.string.b3), R.drawable.b3dc));
        location.add(new item(getString(R.string.b4), R.drawable.b4pg));
        location.add(new item(getString(R.string.b5), R.drawable.b5pdt));
        location.add(new item(getString(R.string.b6), R.drawable.b6mp));
        location.add(new item(getString(R.string.b7), R.drawable.b7t));
        location.add(new item(getString(R.string.b8), R.drawable.b8a));
        location.add(new item(getString(R.string.b9), R.drawable.b9pr));
        location.add(new item(getString(R.string.b10), R.drawable.b10nm));

        ItemAdapter adapter = new ItemAdapter(this, location);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
