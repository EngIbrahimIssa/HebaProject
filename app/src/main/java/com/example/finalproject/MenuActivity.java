package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    ListView list_item;
    ArrayList<DataModel> dataModels;
    MenuAdapter adapter;
    ImageView ic_home;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        list_item = findViewById(R.id.list_item);
        ic_home = findViewById(R.id.ic_home);
        dataModels= new ArrayList<>();

        ic_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        dataModels.add(new DataModel(" الحركات - الفتحة","7jhtYv5YLhE"));
        dataModels.add(new DataModel("الفتحة في الكلمات","Cn29cyoZLx0"));
        dataModels.add(new DataModel("الحركات - الكسرة","UjG5vq9oOcM"));
        dataModels.add(new DataModel("الكسرة في الكلمات","SuJcy9SqxWs"));
        dataModels.add(new DataModel("الحركات - الضمة","KdJ0bexxzuU"));
        dataModels.add(new DataModel("الضمة في الكلمات","oQlhCam7MeA"));
        dataModels.add(new DataModel("الحركات في الحروف","cNqJ7haPtns"));
        dataModels.add(new DataModel("أمثلة على الحركات","sUdRhNRHvbA"));
        dataModels.add(new DataModel("التنوين بالفتح","S3dMA1y4Qms"));
        dataModels.add(new DataModel(" أمثلة على تنوين الفتح","QB3zUr8weRQ"));
        dataModels.add(new DataModel("التوين بالكسر","_2nkbPEgkFA"));
        dataModels.add(new DataModel("أمثلة على تنوين الكسر","-awozkvGqvc"));
        dataModels.add(new DataModel("التنوين بالضم","46T0702Iihc"));
        dataModels.add(new DataModel("أمثلة على تنوين الضم","3jwN3uWTaUc"));
        dataModels.add(new DataModel("التنوين في الحروف","pdH8nDxzDjo"));
        dataModels.add(new DataModel("أمثلة على الكلمات بالحركات والتنوين","v1uk5JGanZs"));
        dataModels.add(new DataModel("السكون","6cmqguyAp3s"));
        dataModels.add(new DataModel("أمثلة على السكون في الكلمات","jkwqnRHbk3k"));
        dataModels.add(new DataModel("القلقلة","FYUd83a8GoA"));
        dataModels.add(new DataModel("أمثلة على القلقلة","7hM2Jmy3oOk"));
        dataModels.add(new DataModel("الشدة","9dSR-qJTw_s"));
        dataModels.add(new DataModel("أمثلة على الشدة","RJNKDX_dZPc"));
        dataModels.add(new DataModel("الغنة","0SQV-YCq5NI"));
        dataModels.add(new DataModel("أمثلة على الغنة","flpUpxEkV2s"));
        dataModels.add(new DataModel("الهمزة","bQTCuBq1jSg"));
        dataModels.add(new DataModel("همزة الوصل في الكلمات","5YeSJFePlpE"));
        dataModels.add(new DataModel("حروف العلة","NWRha1hH73Y"));
        dataModels.add(new DataModel("أمثلة على حروف العلة في الكلمات","aUg8mjhBo3M"));
        dataModels.add(new DataModel("الصفر المستدير","qVfDr4Kc7Fk"));
        dataModels.add(new DataModel("الألف القصيرة فوق الواو والياء","9Dt0q6cfJ9I"));
        dataModels.add(new DataModel("الحروف الصغيرة","IAP6qIJHbTM"));
        dataModels.add(new DataModel("الألف المقصورة على صورة الياء","w3NEDNxF2gU"));
        dataModels.add(new DataModel("الـمــد","hgo8aCvV-sME"));
        dataModels.add(new DataModel("حروف أوائل السور","CCko1rOSF0E"));
        dataModels.add(new DataModel("إظهار النون والميم الساكنتين","b-RMNXsprOk"));
        dataModels.add(new DataModel("إظهار التنوين","Ne0tNLu5Faw"));
        dataModels.add(new DataModel("إدغام النون الساكنة","-eN2GalL-Sc"));
        dataModels.add(new DataModel("إدغام التنوين","yItmo_bGyj8"));
        dataModels.add(new DataModel("إدغام النون الساكنة مع ل ر","T1wMXt5Bfrg"));
        dataModels.add(new DataModel("إدغام التنوين مع ل ر","rCnIpQbOUkg"));
        dataModels.add(new DataModel("إخفاء النون الساكنة","oY5fLhQNDdI"));
        dataModels.add(new DataModel("إخفاء التنوين","qFxrWRcgJOE"));
        dataModels.add(new DataModel("إخفاء الميم الساكنة","Drc9HtZzzHc"));
        dataModels.add(new DataModel("إقلاب النون الساكنة","CeEx5OOgAd8"));
        dataModels.add(new DataModel("إقلاب التنوين","5N2nwf-Kokg"));
        dataModels.add(new DataModel("التقاء التنوين مع السكون","J4mDR0e5amY"));
        dataModels.add(new DataModel("التمارين","jJi4noCnsGU"));
        dataModels.add(new DataModel("سورة الفاتحة","Gp-5docPZiE"));
        dataModels.add(new DataModel("سورة الأخلاص","NBzZYeJ-3JQ"));
        dataModels.add(new DataModel("سورة الفلق","kM08CjRru3k"));
        dataModels.add(new DataModel("سورة الناس","IluTO3BqZEg"));





        adapter = new MenuAdapter(dataModels,getApplicationContext());
        list_item.setAdapter(adapter);


    }
}