package com.mfundoza.todolist.viewmodels;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import com.mfundoza.todolist.models.Todo;
import com.mfundoza.todolist.views.MainFragmentDirections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MainViewModel extends ViewModel {
    private static MutableLiveData<LocalDate> currentDate = new MutableLiveData<>(LocalDate.now());
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

    public void imbPreviousWeek(View view) {
        Calendar cal = Calendar.getInstance();

        currentDate = cal.get(Calendar.Day) - 7;
    }

    public void imbPreviousDay(View view) {
        Calendar cal = Calendar.getInstance();

        currentDate = cal.get(Calendar.Day) - 1;
    }

    public void imbNextDay(View view) {
        Calendar cal = Calendar.getInstance();

        currentDate = cal.get(Calendar.Day) + 1;
    }

    public void imbNextWeek(View view) {
        Calendar cal = Calendar.getInstance();

        currentDate = cal.get(Calendar.Day) + 7;
    }
}
