package com.mfundoza.todolist.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.mfundoza.todolist.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreateTodoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateTodoFragment extends Fragment {


    public CreateTodoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment CreateTodoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CreateTodoFragment newInstance(String param1, String param2) {
        CreateTodoFragment fragment = new CreateTodoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_todo, container, false);
    }
}