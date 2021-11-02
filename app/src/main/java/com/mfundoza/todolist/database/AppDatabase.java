/* package com.mfundoza.todolist.database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.Database;

import com.mfundoza.todolist.models.Todo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Todo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();

    private static volatile AppDatabase INSTANCE;
    //private static final int NUMBER_OF_THREADS = 4;
    //static final ExecutorService databaseWriteExecutor =
            //Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            //synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "word_database")
                            .allowMainThreadQueries()
                            .build();
                }
            //}
        }
        return INSTANCE;
    }
}
*/