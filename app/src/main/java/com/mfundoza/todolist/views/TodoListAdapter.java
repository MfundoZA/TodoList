package com.mfundoza.todolist.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.mfundoza.todolist.R;
import com.mfundoza.todolist.models.Todo;
import com.mfundoza.todolist.viewmodels.MainViewModel;

import java.util.ArrayList;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {
    private ArrayList<Todo> todos = MainViewModel.getTodos();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtTaskName;
        private final TextView txtTaskTime;
        private final TextView txtTaskPriority;

        public ViewHolder(View view) {
            super(view);

            // Event handlers can be declared here or under onBindViewHolder(), but it's better to do so in a ViewModel

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

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtTask().setText(todos.get(holder.getAdapterPosition()).getTask());
        holder.getTxtTaskTime().setText(todos.get(holder.getAdapterPosition()).getTime().toString());
        holder.getTxtTaskPriority().setText(todos.get(holder.getAdapterPosition()).getPriority().toString());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedTodo = holder.getAdapterPosition();
                MainFragmentDirections.ActionMainFragmentToDetailFragment action
                        = MainFragmentDirections.actionMainFragmentToDetailFragment(holder.getAdapterPosition());

                Navigation.findNavController(view).navigate(action);
            }
        });
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }
}
