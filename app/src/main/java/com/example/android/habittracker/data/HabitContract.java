package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by Ankur Gupta on 11/8/17.
 * guptaankur.gupta0@gmail.com
 */

public class HabitContract {
    public static abstract class HabitEntry implements BaseColumns {
        //Name of the table
        public static final String TABLE_NAME = "habit";

        //ID of habit
        public static final String _ID = BaseColumns._ID;

        //Short name of habit
        public static final String COLUMN_HABIT_NAME = "name";

        //Detailed habit description to show in notification
        public static final String COLUMN_HABIT_COMMENT = "comment";

        //For how long the habit should be practiced
        public static final String COLUMN_HABIT_DURATION = "duration";

        //Number of times habit to be repeated in a week
        public static final String COLUMN_HABIT_REPEAT = "repeat";

        //At what time reminder should come
        public static final String COLUMN_HABIT_TIME = "time";
    }
}
