package sg.edu.rp.c346.day2.ca3practical;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    private final static String dbName = "practical3.db";
    private final static int dbVersion = 1;


    public DBHelper(@Nullable Context context) {
        super(context, dbName, null, dbVersion);
    }


}
