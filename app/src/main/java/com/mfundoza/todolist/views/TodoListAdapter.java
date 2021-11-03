package com.mfundoza.todolist.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mfundoza.todolist.R;
import com.mfundoza.todolist.models.Priority;
import com.mfundoza.todolist.models.Todo;

import java.util.ArrayList;
import java.util.Arrays;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {
    private ArrayList<Todo> todos = new ArrayList<Todo>(Arrays.asList(new Todo("Get up!"), new Todo("Finish Assignment"), new Todo("Sleep")));

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtTaskName;
        private final TextView txtTaskTime;
        private final TextView txtTaskPriority;

        public ViewHolder(View view) {
            super(view);

            // Event handlers can be declared here

            txtTaskName = view.findViewById(R.id.txtTaskName);
            txtTaskTime = view.findViewById(R.id.txtTaskTime);
            txtTaskPriority = view.findViewById(R.id.txtTaskPriority);
        }

        public TextView getTxtTask() {
            return txtTaskName;
        }

        public TextView getTxtTaskTime() {
            return txtTaskTime;
        }

        public TextView getTxtTaskPriority() {
            return txtTaskPriority;
        }
    }

    public TodoListAdapter() {
        todos.get(1).setPriority(Priority.Normal);
    }

    public TodoListAdapter(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtTask().setText(todos.get(position).getTask());
        holder.getTxtTaskTime().setText(todos.get(position).getTime().toString());
        holder.getTxtTaskPriority().setText(todos.get(position).getPriority().toString());
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }
}
