package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    ListView list_item;
    ArrayList arrayList = new ArrayList<>();
    ArrayList<DataModel> dataModels;
    MenuAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        list_item = findViewById(R.id.list_item);
        dataModels= new ArrayList<>();

        dataModels.add(new DataModel("شكل الحروف حسب موقعها من الكلمة", ""));
        dataModels.add(new DataModel("أمثلة على شكل الحروف داخل الكلمة",""));
        dataModels.add(new DataModel("الحركات ...... الفتحة",""));
        dataModels.add(new DataModel("الكسرة",""));
        dataModels.add(new DataModel("الضمة",""));
        dataModels.add(new DataModel("الحركات في الرحروف",""));
        dataModels.add(new DataModel("أمثلة على الحركات في الكلمات",""));
        dataModels.add(new DataModel("التنوين ........ بالفتح",""));
        dataModels.add(new DataModel("بالكسر",""));
        dataModels.add(new DataModel("بالضم",""));
        dataModels.add(new DataModel("التنوين في الحروف",""));
        dataModels.add(new DataModel("اأمثلة على الكلمات بالحركات و التنوين",""));
        dataModels.add(new DataModel("االســكون",""));
        dataModels.add(new DataModel("القلقـــة",""));
        dataModels.add(new DataModel("الشــــدة",""));
        dataModels.add(new DataModel("الغنــــة",""));
        dataModels.add(new DataModel("الهــمـزة",""));


        adapter = new MenuAdapter(dataModels,getApplicationContext());
        list_item.setAdapter(adapter);


    }
}