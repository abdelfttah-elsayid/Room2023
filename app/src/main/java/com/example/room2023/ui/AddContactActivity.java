 package com.example.room2023.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.ColumnInfo;

import android.os.Bundle;
import android.widget.Toast;

import com.example.room2023.R;
import com.example.room2023.database.AppDatabase;
import com.example.room2023.databinding.ActivityAddContactBinding;
import com.example.room2023.models.Company;
import com.example.room2023.models.Contact;

 public class AddContactActivity extends AppCompatActivity {
        ActivityAddContactBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddContactBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        binding.btnAddContact.setOnClickListener(v -> getDataFromUi());
    }

     private void getDataFromUi() {
        String name = binding.etName.getText().toString();
        if (name.isEmpty()){
            binding.etName.setError(getString(R.string.name_required));
        return;
        }

         String phone = binding.etPhone.getText().toString();
         if (phone.isEmpty()){
             binding.etName.setError(getString(R.string.phone_required));
         return;
         }
         Company company = new Company("google" , "0111");
         Contact contact = new Contact(name , phone , company);
         AppDatabase.database.contactDao().insert(contact);
         Toast.makeText(this, R.string.contact_added, Toast.LENGTH_SHORT).show();
         finish();
     }
 }