package com.mfundoza.todolist.viewmodels;

import android.view.View;

import androidx.lifecycle.ViewModel;

import com.google.android.material.snackbar.Snackbar;
import com.mfundoza.todolist.R;
import com.mfundoza.todolist.models.Todo;

import java.util.ArrayList;
import java.util.Arrays;

public class MainViewModel extends ViewModel {
    private ArrayList<Todo> todos = new ArrayList<Todo>(Arrays.asList(new Todo("Get up!"), new Todo("Finish Assignment"), new Todo("Sleep")));

    public void btnCreateTodoOnClick (View view) {
        Snackbar.make(view.findViewById(R.id.constraintLayout), "Button clicked!", Snackbar.LENGTH_SHORT).show();
    }
}
