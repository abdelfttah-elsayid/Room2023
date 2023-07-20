package com.example.room2023.dataBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.room2023.R;
import com.example.room2023.databinding.ActivityTestBinding;
import com.example.room2023.models.Company;
import com.example.room2023.models.Contact;

public class TestActivity extends AppCompatActivity {
    ActivityTestBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_test);
    binding = DataBindingUtil.setContentView(this , R.layout.activity_test);
    Company company  =new Company("Google" , "015");

        Contact contact = new Contact("abdu"  , "01015198224" ,company );

            binding.setContact(contact);
    }
}