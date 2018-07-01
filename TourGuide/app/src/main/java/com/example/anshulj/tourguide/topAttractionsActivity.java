package com.example.anshulj.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class topAttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loaction_list);

        ArrayList<item> location = new ArrayList<item>();
        location.add(new item(getString(R.string.tp1), R.drawable.tp1esb));
        location.add(new item(getString(R.string.tp2), R.drawable.tp2bb));
        location.add(new item(getString(R.string.tp3), R.drawable.tp3cp));
        location.add(new item(getString(R.string.tp4), R.drawable.tp4sol));
        location.add(new item(getString(R.string.tp5), R.drawable.tp5owo));
        location.add(new item(getString(R.string.tp6), R.drawable.tp6mma));
        location.add(new item(getString(R.string.tp7), R.drawable.tp7cb));
        location.add(new item(getString(R.string.tp8), R.drawable.tp8hl));
        location.add(new item(getString(R.string.tp9), R.drawable.tp9gct));
        location.add(new item(getString(R.string.tp10), R.drawable.tp10911));

        ItemAdapter adapter = new ItemAdapter(this, location);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
