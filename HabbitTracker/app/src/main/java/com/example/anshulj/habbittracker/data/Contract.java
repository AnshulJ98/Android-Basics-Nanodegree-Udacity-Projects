package com.example.anshulj.habbittracker.data;

import android.provider.BaseColumns;

public class Contract {
    private Contract() {
    }

    public class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "Habits";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_HABIT = "habit";
        public final static String COLUMN_DURATION = "duration";

        public final static int HABIT_SLEEPING = 0;
        public final static int HABIT_WORK = 1;
        public final static int HABIT_WORKOUT = 2;
    }
}
