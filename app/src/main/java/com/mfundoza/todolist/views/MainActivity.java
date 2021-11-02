package com.mfundoza.todolist.views;

import androidx.appcompat.app.AppCompatActivity;
// import androidx.room.Room;

import android.os.Bundle;

import com.mfundoza.todolist.databinding.ActivityMainBinding;
// import com.mfundoza.todolist.database.*;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "roomDatabase").allowMainThreadQueries().build();
    }


}