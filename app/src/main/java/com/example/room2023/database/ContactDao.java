package com.example.room2023.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.room2023.models.Contact;

import java.util.List;

@Dao

public interface ContactDao {

    @Query("SELECT*FROM Contacts")

    List<Contact> getAll();

    @Insert
    void insert(Contact contact);

    @Delete
    void Delete(Contact contact);

    @Update
    void update(Contact contact);

}

