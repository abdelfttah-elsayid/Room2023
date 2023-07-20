package com.example.room2023.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.room2023.models.Contact;

@Database(entities = {Contact.class} , version = 1 ,  exportSchema = false)

@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract ContactDao contactDao ();
    public static AppDatabase database;

    public static  void init(Context context){
        if (database == null){
         database = Room.databaseBuilder(context,
                AppDatabase.class, "contactsDatabase")
                 .allowMainThreadQueries().build();
    }
    }



}
