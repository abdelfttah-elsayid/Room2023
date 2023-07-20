package com.example.room2023.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.room2023.database.AppDatabase;
import com.example.room2023.databinding.ActivityMainBinding;
import com.example.room2023.models.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AppDatabase.init(getApplicationContext());



        binding.btnAddContact.setOnClickListener(v -> startActivity(new Intent(MainActivity.this ,
                AddContactActivity.class)));
    }

    @Override
    protected void onResume() {
        super.onResume();
        getContacts();

    }

    private void  getContacts(){
        List<Contact> contacts =  AppDatabase.database.contactDao().getAll();
        System.out.println("contacts"+contacts.size());

        ContactAdapter contactAdapter = new ContactAdapter(contacts);
        binding.rvContacts.setAdapter(contactAdapter);

    }
}