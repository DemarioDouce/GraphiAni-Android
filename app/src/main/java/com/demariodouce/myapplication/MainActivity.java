package com.demariodouce.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with for titleList
        ArrayList<String> exercisesTitle = new ArrayList<>();
        exercisesTitle.add("Exercise 1");
        exercisesTitle.add("Exercise 2");
        exercisesTitle.add("Exercise 3");

        // data to populate the RecyclerView with for descriptionList
        ArrayList<String> exercisesDescription = new ArrayList<>();
        exercisesDescription.add("Draw continuous horizontal or vertical lines.");
        exercisesDescription.add("Frame-by-frame animation for a series of pictures.");
        exercisesDescription.add("Tweened animation that simulate an earth view.");
        exercisesDescription.add("Sheep");
        exercisesDescription.add("Goat");


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.exerciseRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, exercisesTitle, exercisesDescription);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}