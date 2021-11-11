package com.mfundoza.todolist.viewmodels;

import android.view.View;

import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import com.mfundoza.todolist.models.Todo;
import com.mfundoza.todolist.views.MainFragmentDirections;

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
        Navigation.findNavController(view).navigate(MainFragmentDirections.actionMainFragmentToCreateTodoFragment());
    }
}
