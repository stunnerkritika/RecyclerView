package com.example.recyclerviewinabdroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutmanger;
    List<Modelclass>userList;
    Adapter  adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        initRecyclerview();
    }

    private void initData() {
        userList =new ArrayList<>();
        userList.add(new Modelclass(R.drawable.pic1,"Anjali","10:45am","how are you","_________________________________________"));
        userList.add(new Modelclass(R.drawable.pic4,"Arudhii","10:85am","how are you","_________________________________________"));
        userList.add(new Modelclass(R.drawable.pic1,"A","10:45am","how are you","_________________________________________"));
        userList.add(new Modelclass(R.drawable.pic4,"AB","10:45am","how are you","_________________________________________"));
        userList.add(new Modelclass(R.drawable.pic1,"c","10:45am","how are you","_________________________________________"));
        userList.add(new Modelclass(R.drawable.pic4,"q","10:45am","how are you","_________________________________________"));
    }

    private void initRecyclerview() {
        recyclerView=findViewById(R.id.recyclerview);
        layoutmanger =new LinearLayoutManager(this);
        layoutmanger.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutmanger);
        adapter =new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}