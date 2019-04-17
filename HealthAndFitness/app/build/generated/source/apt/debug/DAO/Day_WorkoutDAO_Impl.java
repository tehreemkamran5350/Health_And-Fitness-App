package DAO;

import DTO.Day_Workout;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import java.lang.Override;
import java.lang.String;

public class Day_WorkoutDAO_Impl implements Day_WorkoutDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDay_Workout;

  public Day_WorkoutDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDay_Workout = new EntityInsertionAdapter<Day_Workout>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Day_Workout`(`id`,`dayID`,`workoutID`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Day_Workout value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getDayID());
        stmt.bindLong(3, value.getWorkoutID());
      }
    };
  }

  @Override
  public void insertAll(Day_Workout... day_workouts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDay_Workout.insert(day_workouts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
