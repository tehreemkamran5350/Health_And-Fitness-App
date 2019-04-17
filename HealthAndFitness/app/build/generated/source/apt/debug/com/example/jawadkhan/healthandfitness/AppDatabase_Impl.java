package com.example.jawadkhan.healthandfitness;

import DAO.DayDAO;
import DAO.DayDAO_Impl;
import DAO.Day_WorkoutDAO;
import DAO.Day_WorkoutDAO_Impl;
import DAO.DaysDAO;
import DAO.DaysDAO_Impl;
import DAO.WorkoutDAO;
import DAO.WorkoutDAO_Impl;
import DAO.diseaseDAO;
import DAO.diseaseDAO_Impl;
import DAO.jointDAO;
import DAO.jointDAO_Impl;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AppDatabase_Impl extends AppDatabase {
  private volatile diseaseDAO _diseaseDAO;

  private volatile DaysDAO _daysDAO;

  private volatile WorkoutDAO _workoutDAO;

  private volatile DayDAO _dayDAO;

  private volatile Day_WorkoutDAO _dayWorkoutDAO;

  private volatile jointDAO _jointDAO;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(13) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `diseases` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Name` TEXT, `Description` TEXT, `Causes` TEXT, `Symptoms` TEXT, `Diet` TEXT, `Prevention` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Days` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `DayNo` INTEGER NOT NULL, `breakfast` TEXT, `lunch` TEXT, `dinner` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Workout` (`id` INTEGER NOT NULL, `workout_name` TEXT, `workout_image` TEXT, `workout_description` TEXT, `workout_time` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LossWeightDay` (`dayID` INTEGER NOT NULL, `dayName` TEXT, PRIMARY KEY(`dayID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Day_Workout` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dayID` INTEGER NOT NULL, `workoutID` INTEGER NOT NULL, FOREIGN KEY(`workoutID`) REFERENCES `Workout`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`dayID`) REFERENCES `LossWeightDay`(`dayID`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `joint` (`exId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `jointName` TEXT, `ExName` TEXT, `ExImg` TEXT, `ExTitle` TEXT, `ExDesc` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"168da94d0265232d91c3aa26291702ed\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `diseases`");
        _db.execSQL("DROP TABLE IF EXISTS `Days`");
        _db.execSQL("DROP TABLE IF EXISTS `Workout`");
        _db.execSQL("DROP TABLE IF EXISTS `LossWeightDay`");
        _db.execSQL("DROP TABLE IF EXISTS `Day_Workout`");
        _db.execSQL("DROP TABLE IF EXISTS `joint`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDiseases = new HashMap<String, TableInfo.Column>(7);
        _columnsDiseases.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsDiseases.put("Name", new TableInfo.Column("Name", "TEXT", false, 0));
        _columnsDiseases.put("Description", new TableInfo.Column("Description", "TEXT", false, 0));
        _columnsDiseases.put("Causes", new TableInfo.Column("Causes", "TEXT", false, 0));
        _columnsDiseases.put("Symptoms", new TableInfo.Column("Symptoms", "TEXT", false, 0));
        _columnsDiseases.put("Diet", new TableInfo.Column("Diet", "TEXT", false, 0));
        _columnsDiseases.put("Prevention", new TableInfo.Column("Prevention", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDiseases = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDiseases = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDiseases = new TableInfo("diseases", _columnsDiseases, _foreignKeysDiseases, _indicesDiseases);
        final TableInfo _existingDiseases = TableInfo.read(_db, "diseases");
        if (! _infoDiseases.equals(_existingDiseases)) {
          throw new IllegalStateException("Migration didn't properly handle diseases(DTO.diseaseEntity).\n"
                  + " Expected:\n" + _infoDiseases + "\n"
                  + " Found:\n" + _existingDiseases);
        }
        final HashMap<String, TableInfo.Column> _columnsDays = new HashMap<String, TableInfo.Column>(5);
        _columnsDays.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsDays.put("DayNo", new TableInfo.Column("DayNo", "INTEGER", true, 0));
        _columnsDays.put("breakfast", new TableInfo.Column("breakfast", "TEXT", false, 0));
        _columnsDays.put("lunch", new TableInfo.Column("lunch", "TEXT", false, 0));
        _columnsDays.put("dinner", new TableInfo.Column("dinner", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDays = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDays = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDays = new TableInfo("Days", _columnsDays, _foreignKeysDays, _indicesDays);
        final TableInfo _existingDays = TableInfo.read(_db, "Days");
        if (! _infoDays.equals(_existingDays)) {
          throw new IllegalStateException("Migration didn't properly handle Days(DTO.Days).\n"
                  + " Expected:\n" + _infoDays + "\n"
                  + " Found:\n" + _existingDays);
        }
        final HashMap<String, TableInfo.Column> _columnsWorkout = new HashMap<String, TableInfo.Column>(5);
        _columnsWorkout.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsWorkout.put("workout_name", new TableInfo.Column("workout_name", "TEXT", false, 0));
        _columnsWorkout.put("workout_image", new TableInfo.Column("workout_image", "TEXT", false, 0));
        _columnsWorkout.put("workout_description", new TableInfo.Column("workout_description", "TEXT", false, 0));
        _columnsWorkout.put("workout_time", new TableInfo.Column("workout_time", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWorkout = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWorkout = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWorkout = new TableInfo("Workout", _columnsWorkout, _foreignKeysWorkout, _indicesWorkout);
        final TableInfo _existingWorkout = TableInfo.read(_db, "Workout");
        if (! _infoWorkout.equals(_existingWorkout)) {
          throw new IllegalStateException("Migration didn't properly handle Workout(DTO.Workout).\n"
                  + " Expected:\n" + _infoWorkout + "\n"
                  + " Found:\n" + _existingWorkout);
        }
        final HashMap<String, TableInfo.Column> _columnsLossWeightDay = new HashMap<String, TableInfo.Column>(2);
        _columnsLossWeightDay.put("dayID", new TableInfo.Column("dayID", "INTEGER", true, 1));
        _columnsLossWeightDay.put("dayName", new TableInfo.Column("dayName", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLossWeightDay = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLossWeightDay = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLossWeightDay = new TableInfo("LossWeightDay", _columnsLossWeightDay, _foreignKeysLossWeightDay, _indicesLossWeightDay);
        final TableInfo _existingLossWeightDay = TableInfo.read(_db, "LossWeightDay");
        if (! _infoLossWeightDay.equals(_existingLossWeightDay)) {
          throw new IllegalStateException("Migration didn't properly handle LossWeightDay(DTO.LossWeightDay).\n"
                  + " Expected:\n" + _infoLossWeightDay + "\n"
                  + " Found:\n" + _existingLossWeightDay);
        }
        final HashMap<String, TableInfo.Column> _columnsDayWorkout = new HashMap<String, TableInfo.Column>(3);
        _columnsDayWorkout.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsDayWorkout.put("dayID", new TableInfo.Column("dayID", "INTEGER", true, 0));
        _columnsDayWorkout.put("workoutID", new TableInfo.Column("workoutID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDayWorkout = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysDayWorkout.add(new TableInfo.ForeignKey("Workout", "CASCADE", "NO ACTION",Arrays.asList("workoutID"), Arrays.asList("id")));
        _foreignKeysDayWorkout.add(new TableInfo.ForeignKey("LossWeightDay", "CASCADE", "NO ACTION",Arrays.asList("dayID"), Arrays.asList("dayID")));
        final HashSet<TableInfo.Index> _indicesDayWorkout = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDayWorkout = new TableInfo("Day_Workout", _columnsDayWorkout, _foreignKeysDayWorkout, _indicesDayWorkout);
        final TableInfo _existingDayWorkout = TableInfo.read(_db, "Day_Workout");
        if (! _infoDayWorkout.equals(_existingDayWorkout)) {
          throw new IllegalStateException("Migration didn't properly handle Day_Workout(DTO.Day_Workout).\n"
                  + " Expected:\n" + _infoDayWorkout + "\n"
                  + " Found:\n" + _existingDayWorkout);
        }
        final HashMap<String, TableInfo.Column> _columnsJoint = new HashMap<String, TableInfo.Column>(6);
        _columnsJoint.put("exId", new TableInfo.Column("exId", "INTEGER", true, 1));
        _columnsJoint.put("jointName", new TableInfo.Column("jointName", "TEXT", false, 0));
        _columnsJoint.put("ExName", new TableInfo.Column("ExName", "TEXT", false, 0));
        _columnsJoint.put("ExImg", new TableInfo.Column("ExImg", "TEXT", false, 0));
        _columnsJoint.put("ExTitle", new TableInfo.Column("ExTitle", "TEXT", false, 0));
        _columnsJoint.put("ExDesc", new TableInfo.Column("ExDesc", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysJoint = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesJoint = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoJoint = new TableInfo("joint", _columnsJoint, _foreignKeysJoint, _indicesJoint);
        final TableInfo _existingJoint = TableInfo.read(_db, "joint");
        if (! _infoJoint.equals(_existingJoint)) {
          throw new IllegalStateException("Migration didn't properly handle joint(DTO.jointEntity).\n"
                  + " Expected:\n" + _infoJoint + "\n"
                  + " Found:\n" + _existingJoint);
        }
      }
    }, "168da94d0265232d91c3aa26291702ed");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "diseases","Days","Workout","LossWeightDay","Day_Workout","joint");
  }

  @Override
  public diseaseDAO diseaseDAO() {
    if (_diseaseDAO != null) {
      return _diseaseDAO;
    } else {
      synchronized(this) {
        if(_diseaseDAO == null) {
          _diseaseDAO = new diseaseDAO_Impl(this);
        }
        return _diseaseDAO;
      }
    }
  }

  @Override
  public DaysDAO dataDao() {
    if (_daysDAO != null) {
      return _daysDAO;
    } else {
      synchronized(this) {
        if(_daysDAO == null) {
          _daysDAO = new DaysDAO_Impl(this);
        }
        return _daysDAO;
      }
    }
  }

  @Override
  public WorkoutDAO Workout_DAO() {
    if (_workoutDAO != null) {
      return _workoutDAO;
    } else {
      synchronized(this) {
        if(_workoutDAO == null) {
          _workoutDAO = new WorkoutDAO_Impl(this);
        }
        return _workoutDAO;
      }
    }
  }

  @Override
  public DayDAO Day_DAO() {
    if (_dayDAO != null) {
      return _dayDAO;
    } else {
      synchronized(this) {
        if(_dayDAO == null) {
          _dayDAO = new DayDAO_Impl(this);
        }
        return _dayDAO;
      }
    }
  }

  @Override
  public Day_WorkoutDAO day_workoutDAO() {
    if (_dayWorkoutDAO != null) {
      return _dayWorkoutDAO;
    } else {
      synchronized(this) {
        if(_dayWorkoutDAO == null) {
          _dayWorkoutDAO = new Day_WorkoutDAO_Impl(this);
        }
        return _dayWorkoutDAO;
      }
    }
  }

  @Override
  public jointDAO jointDAO() {
    if (_jointDAO != null) {
      return _jointDAO;
    } else {
      synchronized(this) {
        if(_jointDAO == null) {
          _jointDAO = new jointDAO_Impl(this);
        }
        return _jointDAO;
      }
    }
  }
}
