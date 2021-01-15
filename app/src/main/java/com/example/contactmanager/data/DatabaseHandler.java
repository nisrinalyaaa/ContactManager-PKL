package com.example.contactmanager.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.contactmanager.R;
import com.example.contactmanager.model.Contact;
import com.example.contactmanager.util.Util;

public class DatabaseHandler extends SQLiteOpenHelper {


    public DatabaseHandler(Context context) {
        super(context, Util.DATABSE_NAME, null, Util.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //SQL -Structured Query Languange


      

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String DROP_TABLE = String.valueOf(R.string.db_drop);
        db.execSQL(DROP_TABLE, new String[]{Util.DATABSE_NAME});

        onCreate(db);

    }

    public void addContact(Contact contact){

        SQLiteDatabase db = this.getWritableDatabase();


        ContentValues values = new ContentValues();

    }
}
