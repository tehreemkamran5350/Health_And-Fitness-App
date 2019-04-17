package DAO;

import DTO.Workout;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDAO_Impl implements WorkoutDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfWorkout;

  public WorkoutDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWorkout = new EntityInsertionAdapter<Workout>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Workout`(`id`,`workout_name`,`workout_image`,`workout_description`,`workout_time`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Workout value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTime());
        }
      }
    };
  }

  @Override
  public void insertAll(Workout... workouts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfWorkout.insert(workouts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Workout> getWorkouts(int dayID) {
    final String _sql = "Select * from Workout where id IN (Select workoutID from Day_Workout where dayID=?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dayID);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("workout_name");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("workout_image");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("workout_description");
      final int _cursorIndexOfTime = _cursor.getColumnIndexOrThrow("workout_time");
      final List<Workout> _result = new ArrayList<Workout>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Workout _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpTime;
        _tmpTime = _cursor.getString(_cursorIndexOfTime);
        _item = new Workout(_tmpId,_tmpName,_tmpImage,_tmpDescription,_tmpTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
