package com.example.room2023.database;

import androidx.room.TypeConverter;

import com.example.room2023.models.Company;
import com.google.gson.Gson;

public class Converters {
    @TypeConverter

    public static String companyToGson(Company company){
        Gson gson = new Gson();
        return gson.toJson(company);
        // or
        // return  new Gson().toJson(company);

    }
    @TypeConverter
    public static Company companyFromJson (String companyJson){
        return new Gson().fromJson(companyJson , Company.class);
    }



    }
