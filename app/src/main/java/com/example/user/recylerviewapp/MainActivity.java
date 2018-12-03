package com.example.user.recylerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        String[] sellingitems = {"Programming"};
        programmingList.setAdapter(new RecyclerAdapter(sellingitems));
    }
}
//, "Website","SMS", "Voice Sms", "Mobile Data","Hosting",
//                "Hosting", "Programming", "Website","SMS", "Voice Sms", "Mobile Data"