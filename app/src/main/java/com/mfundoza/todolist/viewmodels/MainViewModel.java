package com.mfundoza.todolist.viewmodels;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.mfundoza.todolist.models.Todo;

import java.util.ArrayList;
import java.util.Arrays;

public class MainViewModel extends ViewModel {
    private static ArrayList<Todo> todos = new ArrayList<>(Arrays.asList(new Todo("Get up!"), new Todo("Finish Assignment"), new Todo("Sleep")));

    public static ArrayList<Todo> getTodos() {
        return todos;
    }

    public static void setTodos(ArrayList<Todo> todos) {
        MainViewModel.todos = todos;
    }

    public void btnCreateTodoOnClick(View view) {
        //Snackbar.make(view.getContext(), view.findViewById(R.id.constraintLayout), "Button clicked!", Snackbar.LENGTH_SHORT).show();
        Log.d("MainViewModel", "Button Clicked!");
    }
}
