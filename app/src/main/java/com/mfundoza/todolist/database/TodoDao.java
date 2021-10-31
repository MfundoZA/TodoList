package com.mfundoza.todolist.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.mfundoza.todolist.models.Todo;

import java.util.List;

@Dao
public interface TodoDao {
    @Insert
    void insert(Todo todo);

    @Query("SELECT * FROM todo")
    List<Todo> getAll();

    @Query("DELETE FROM todo WHERE id IN (:todos)")
    void delete(List<Todo> todos);
}
