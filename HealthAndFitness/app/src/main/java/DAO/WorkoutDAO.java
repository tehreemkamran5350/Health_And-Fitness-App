package DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import DTO.Workout;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Dao
public interface WorkoutDAO {

    @Query("Select * from Workout where id IN (Select workoutID from Day_Workout where dayID=:dayID)")
    public List<Workout> getWorkouts(int dayID);

    @Insert
    void insertAll(Workout... workouts);
}


