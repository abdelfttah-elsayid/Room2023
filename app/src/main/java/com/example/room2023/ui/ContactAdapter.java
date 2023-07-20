package com.example.room2023.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.room2023.databinding.ItemContactBinding;
import com.example.room2023.models.Contact;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Holder>{
    List <Contact> contacts ;

    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(ItemContactBinding.inflate(LayoutInflater.from(parent.getContext()), parent , false));

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Contact contact = contacts.get(position);
         holder.binding.tvName.setText(contact.getName());
         holder.binding.tvPhone.setText(contact.getPhone());



    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ItemContactBinding binding;
        public Holder(@NonNull ItemContactBinding binding) {
            super(binding.getRoot() );
            this.binding = binding;
        }
    }

}
