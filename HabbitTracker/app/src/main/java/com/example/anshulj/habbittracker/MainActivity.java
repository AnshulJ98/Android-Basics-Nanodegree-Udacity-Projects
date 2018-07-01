package com.example.anshulj.habbittracker;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.anshulj.habbittracker.data.HabitDbHelper;
import com.example.anshulj.habbittracker.data.Contract.HabitEntry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView displayView = (TextView) findViewById(R.id.txtView1);
        HabitDbHelper habitDbHelper = new HabitDbHelper(this);
        habitDbHelper.insertHabit(HabitEntry.HABIT_WORK,
                "2 hours");
        habitDbHelper.insertHabit(HabitEntry.HABIT_SLEEPING,
                "8 hours");
        habitDbHelper.insertHabit(HabitEntry.HABIT_WORKOUT,
                "1 hour");
        Cursor cursor = habitDbHelper.readHabits();
        displayView.setText("The habit table contains " + cursor.getCount() + " habits.\n\n");
        displayView.append(HabitEntry._ID + " - " +
                HabitEntry.COLUMN_HABIT + "-" +
                HabitEntry.COLUMN_DURATION + "\n");
        int idColumnIndex = cursor.getColumnIndex(HabitEntry._ID);
        int habitColumnIndex = cursor.getColumnIndex(HabitEntry.COLUMN_HABIT);
        int durationColumnIndex = cursor.getColumnIndex(HabitEntry.COLUMN_DURATION);
        while (cursor.moveToNext()) {
            int currentID = cursor.getInt(idColumnIndex);
            String currentHabit = cursor.getString(habitColumnIndex);
            String currentDuration = cursor.getString(durationColumnIndex);
            displayView.append(("\n" + currentID + " - " +
                    currentHabit + " - " +
                    currentDuration));
        }
        cursor.close();
    }
}
