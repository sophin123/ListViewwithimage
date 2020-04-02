package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);


        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Lamborgini");
        arrayList.add("Ford");
        arrayList.add("Mustang");
        arrayList.add("Bugatti");
        arrayList.add("Ferrari");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Item Clicked", arrayList.get(position));

                    Intent intent = new Intent(MainActivity.this, Image_Activity.class);
                    intent.putExtra("IMAGE_POSITION", position);
                    startActivity(intent);

            }
        });





    }
}
