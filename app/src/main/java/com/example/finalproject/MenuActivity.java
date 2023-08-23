package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    ListView list_item;
    ArrayList arrayList = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        list_item =findViewById(R.id.list_item);

        arrayList.add("شكل الحروف حسب موقعها من الكلمة");
        arrayList.add("أمثلة على شكل الحروف داخل الكلمة");
        arrayList.add("الحركات ...... الفتحة");
        arrayList.add("الكسرة");
        arrayList.add("الضمة");
        arrayList.add("الحركات في الرحروف");
        arrayList.add("أمثلة على الحركات في الكلمات");

        // Create a List from String Array elements
        final ArrayList<String> fruits_list = new ArrayList<String>(arrayList);

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list);

        // DataBind ListView with items from ArrayAdapter
        list_item.setAdapter(arrayAdapter);


        list_item.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View row = super.getView(position, convertView, parent);

                if(position %2 != 1)
                {
                    // do something change color
                    row.setBackgroundColor(Color.parseColor("#f5d862")); // some color
                }
                else
                {
                    // default state
                    row.setBackgroundColor (Color.WHITE); // default coloe
                }
                return row;
            }
        });
    }
}