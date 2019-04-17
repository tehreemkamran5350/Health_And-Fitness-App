package DAO;

import DTO.Days;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DaysDAO_Impl implements DaysDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDays;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public DaysDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDays = new EntityInsertionAdapter<Days>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Days`(`id`,`DayNo`,`breakfast`,`lunch`,`dinner`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Days value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getDayNo());
        if (value.getBreakfast() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBreakfast());
        }
        if (value.getLunch() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLunch());
        }
        if (value.getDinner() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDinner());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from Days";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(Days... daysEntities) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDays.insert(daysEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<Days> getAll() {
    final String _sql = "SELECT * FROM Days order by id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDayNo = _cursor.getColumnIndexOrThrow("DayNo");
      final int _cursorIndexOfBreakfast = _cursor.getColumnIndexOrThrow("breakfast");
      final int _cursorIndexOfLunch = _cursor.getColumnIndexOrThrow("lunch");
      final int _cursorIndexOfDinner = _cursor.getColumnIndexOrThrow("dinner");
      final List<Days> _result = new ArrayList<Days>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Days _item;
        _item = new Days();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final int _tmpDayNo;
        _tmpDayNo = _cursor.getInt(_cursorIndexOfDayNo);
        _item.setDayNo(_tmpDayNo);
        final String _tmpBreakfast;
        _tmpBreakfast = _cursor.getString(_cursorIndexOfBreakfast);
        _item.setBreakfast(_tmpBreakfast);
        final String _tmpLunch;
        _tmpLunch = _cursor.getString(_cursorIndexOfLunch);
        _item.setLunch(_tmpLunch);
        final String _tmpDinner;
        _tmpDinner = _cursor.getString(_cursorIndexOfDinner);
        _item.setDinner(_tmpDinner);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Days getData(int ID) {
    final String _sql = "SELECT * FROM Days where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, ID);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDayNo = _cursor.getColumnIndexOrThrow("DayNo");
      final int _cursorIndexOfBreakfast = _cursor.getColumnIndexOrThrow("breakfast");
      final int _cursorIndexOfLunch = _cursor.getColumnIndexOrThrow("lunch");
      final int _cursorIndexOfDinner = _cursor.getColumnIndexOrThrow("dinner");
      final Days _result;
      if(_cursor.moveToFirst()) {
        _result = new Days();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final int _tmpDayNo;
        _tmpDayNo = _cursor.getInt(_cursorIndexOfDayNo);
        _result.setDayNo(_tmpDayNo);
        final String _tmpBreakfast;
        _tmpBreakfast = _cursor.getString(_cursorIndexOfBreakfast);
        _result.setBreakfast(_tmpBreakfast);
        final String _tmpLunch;
        _tmpLunch = _cursor.getString(_cursorIndexOfLunch);
        _result.setLunch(_tmpLunch);
        final String _tmpDinner;
        _tmpDinner = _cursor.getString(_cursorIndexOfDinner);
        _result.setDinner(_tmpDinner);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
