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


        dataModels.add(new DataModel(" الحركات - الفتحة","https://www.youtube.com/watch?v=7jhtYv5YLhE&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=2"));
        dataModels.add(new DataModel("الفتحة في الكلمات","https://www.youtube.com/watch?v=Cn29cyoZLx0&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=3"));
        dataModels.add(new DataModel("الحركات - الكسرة","https://www.youtube.com/watch?v=UjG5vq9oOcM&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=4"));
        dataModels.add(new DataModel("الكسرة في الكلمات","https://www.youtube.com/watch?v=SuJcy9SqxWs&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=5"));
        dataModels.add(new DataModel("الحركات - الضمة","https://www.youtube.com/watch?v=KdJ0bexxzuU&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=6"));
        dataModels.add(new DataModel("الضمة في الكلمات","https://www.youtube.com/watch?v=oQlhCam7MeA&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=7"));
        dataModels.add(new DataModel("الحركات في الحروف","https://www.youtube.com/watch?v=cNqJ7haPtns&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=8"));
        dataModels.add(new DataModel("أمثلة على الحركات","https://www.youtube.com/watch?v=sUdRhNRHvbA&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=9"));
        dataModels.add(new DataModel("التنوين بالفتح","https://www.youtube.com/watch?v=S3dMA1y4Qms&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=10"));
        dataModels.add(new DataModel(" أمثلة على تنوين الفتح","https://www.youtube.com/watch?v=QB3zUr8weRQ&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=11"));
        dataModels.add(new DataModel("التوين بالكسر","https://www.youtube.com/watch?v=_2nkbPEgkFA&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=12"));
        dataModels.add(new DataModel("أمثلة على تنوين الكسر","https://www.youtube.com/watch?v=-awozkvGqvc&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=13"));
        dataModels.add(new DataModel("التنوين بالضم","https://www.youtube.com/watch?v=46T0702Iihc&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=14"));
        dataModels.add(new DataModel("أمثلة على تنوين الضم","https://www.youtube.com/watch?v=3jwN3uWTaUc&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=15"));
        dataModels.add(new DataModel("التنوين في الحروف","https://www.youtube.com/watch?v=pdH8nDxzDjo&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=16"));
        dataModels.add(new DataModel("أمثلة على الكلمات بالحركات والتنوين","https://www.youtube.com/watch?v=v1uk5JGanZs&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=17"));
        dataModels.add(new DataModel("السكون","https://www.youtube.com/watch?v=6cmqguyAp3s&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=18"));
        dataModels.add(new DataModel("أمثلة على السكون في الكلمات","https://www.youtube.com/watch?v=jkwqnRHbk3k&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=19"));
        dataModels.add(new DataModel("القلقلة","https://www.youtube.com/watch?v=CB5-HprJfNM&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=20"));
        dataModels.add(new DataModel("أمثلة على القلقلة","https://www.youtube.com/watch?v=IfVXEOhames&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=21"));
        dataModels.add(new DataModel("الشدة","https://www.youtube.com/watch?v=9dSR-qJTw_s&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=22"));
        dataModels.add(new DataModel("أمثلة على الشدة","https://www.youtube.com/watch?v=RJNKDX_dZPc&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=23"));
        dataModels.add(new DataModel("الغنة","https://www.youtube.com/watch?v=0SQV-YCq5NI&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=24"));
        dataModels.add(new DataModel("أمثلة على الغنة","https://www.youtube.com/watch?v=flpUpxEkV2s&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=25"));
        dataModels.add(new DataModel("الهمزة","https://www.youtube.com/watch?v=bQTCuBq1jSg&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=26"));
        dataModels.add(new DataModel("همزة الوصل في الكلمات","https://www.youtube.com/watch?v=5YeSJFePlpE&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=27"));
        dataModels.add(new DataModel("حروف العلة","https://www.youtube.com/watch?v=NWRha1hH73Y&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=28"));
        dataModels.add(new DataModel("أمثلة على حروف العلة في الكلمات","https://www.youtube.com/watch?v=aUg8mjhBo3M&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=29"));
        dataModels.add(new DataModel("الصفر المستدير","https://www.youtube.com/watch?v=qVfDr4Kc7Fk&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=30"));
        dataModels.add(new DataModel("الألف القصيرة فوق الواو والياء","https://www.youtube.com/watch?v=9Dt0q6cfJ9I&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=31"));
        dataModels.add(new DataModel("الحروف الصغيرة","https://www.youtube.com/watch?v=IAP6qIJHbTM&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=32"));
        dataModels.add(new DataModel("الألف المقصورة على صورة الياء","https://www.youtube.com/watch?v=w3NEDNxF2gU&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=33"));
        dataModels.add(new DataModel("الـمــد","hhttps://www.youtube.com/watch?v=go8aCvV-sME&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=53"));
        dataModels.add(new DataModel("حروف أوائل السور","https://www.youtube.com/watch?v=CCko1rOSF0E&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=34"));
        dataModels.add(new DataModel("إظهار النون والميم الساكنتين","https://www.youtube.com/watch?v=b-RMNXsprOk&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=35"));
        dataModels.add(new DataModel("إظهار التنوين","https://www.youtube.com/watch?v=_7ts-yAEifs&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=36"));
        dataModels.add(new DataModel("إدغام النون الساكنة","https://www.youtube.com/watch?v=-eN2GalL-Sc&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=37"));
        dataModels.add(new DataModel("إدغام التنوين","https://www.youtube.com/watch?v=yItmo_bGyj8&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=38"));
        dataModels.add(new DataModel("إدغام النون الساكنة مع ل ر","https://www.youtube.com/watch?v=T1wMXt5Bfrg&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=39"));
        dataModels.add(new DataModel("إدغام التنوين مع ل ر","https://www.youtube.com/watch?v=rCnIpQbOUkg&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=40"));
        dataModels.add(new DataModel("إخفاء النون الساكنة","youtube.com/watch?v=Jj1eO29Mk84&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=41"));
        dataModels.add(new DataModel("إخفاء التنوين","https://www.youtube.com/watch?v=qFxrWRcgJOE&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=42"));
        dataModels.add(new DataModel("إخفاء الميم الساكنة","https://www.youtube.com/watch?v=KT6Ahbx7FkE&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=43"));
        dataModels.add(new DataModel("إقلاب النون الساكنة","https://www.youtube.com/watch?v=CeEx5OOgAd8&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=44"));
        dataModels.add(new DataModel("إقلاب التنوين","https://www.youtube.com/watch?v=5N2nwf-Kokg&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=45"));
        dataModels.add(new DataModel("التقاء التنوين مع السكون","https://www.youtube.com/watch?v=J4mDR0e5amY&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=46"));
        dataModels.add(new DataModel("التمارين","https://www.youtube.com/watch?v=jJi4noCnsGU&list=PLyWewL9irDRnDDrphNTJGV2TGAgdffeky&index=47"));





        adapter = new MenuAdapter(dataModels,getApplicationContext());
        list_item.setAdapter(adapter);


    }
}