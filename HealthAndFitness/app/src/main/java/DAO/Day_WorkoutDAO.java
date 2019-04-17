package DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import DTO.Day_Workout;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Dao
public interface Day_WorkoutDAO {

    @Insert
    void insertAll(Day_Workout... day_workouts);
}