package com.example.jawadkhan.healthandfitness;

/**
 * Created by Jawad Khan on 6/3/2018.
 */

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import DAO.DayDAO;
import DAO.Day_WorkoutDAO;
import DAO.DaysDAO;
import DAO.WorkoutDAO;
import DAO.diseaseDAO;
import DAO.jointDAO;
import DTO.Day_Workout;
import DTO.Days;
import DTO.LossWeightDay;
import DTO.Workout;
import DTO.diseaseEntity;
import DTO.jointEntity;

/**
 * Created by Jawad Khan on 6/3/2018.
 */

@Database(entities = {diseaseEntity.class, Days.class, Workout.class, LossWeightDay.class, Day_Workout.class, jointEntity.class}, version = 13)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract diseaseDAO diseaseDAO();
    public abstract DaysDAO dataDao();
    public abstract WorkoutDAO Workout_DAO();
    public abstract DayDAO Day_DAO();
    public abstract Day_WorkoutDAO day_workoutDAO();
    public abstract jointDAO jointDAO();

    public synchronized static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    private static AppDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "healthAndFitness-database")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }


}