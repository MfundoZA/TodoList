package com.mfundoza.todolist.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mfundoza.todolist.R;


// import com.mfundoza.todolist.database.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "roomDatabase").allowMainThreadQueries().build();
    }


}