package DAO;

import DTO.jointEntity;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class jointDAO_Impl implements jointDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfjointEntity;

  public jointDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfjointEntity = new EntityInsertionAdapter<jointEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `joint`(`exId`,`jointName`,`ExName`,`ExImg`,`ExTitle`,`ExDesc`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, jointEntity value) {
        stmt.bindLong(1, value.getExId());
        if (value.jointName == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.jointName);
        }
        if (value.getExName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExName());
        }
        if (value.getExImg() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getExImg());
        }
        if (value.getExTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getExTitle());
        }
        if (value.getExDesc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExDesc());
        }
      }
    };
  }

  @Override
  public void insertAll(jointEntity... jointEntities) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfjointEntity.insert(jointEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<jointEntity> getAll() {
    final String _sql = "Select * from joint";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfExId = _cursor.getColumnIndexOrThrow("exId");
      final int _cursorIndexOfJointName = _cursor.getColumnIndexOrThrow("jointName");
      final int _cursorIndexOfExName = _cursor.getColumnIndexOrThrow("ExName");
      final int _cursorIndexOfExImg = _cursor.getColumnIndexOrThrow("ExImg");
      final int _cursorIndexOfExTitle = _cursor.getColumnIndexOrThrow("ExTitle");
      final int _cursorIndexOfExDesc = _cursor.getColumnIndexOrThrow("ExDesc");
      final List<jointEntity> _result = new ArrayList<jointEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final jointEntity _item;
        final String _tmpJointName;
        _tmpJointName = _cursor.getString(_cursorIndexOfJointName);
        final String _tmpExName;
        _tmpExName = _cursor.getString(_cursorIndexOfExName);
        final String _tmpExImg;
        _tmpExImg = _cursor.getString(_cursorIndexOfExImg);
        final String _tmpExTitle;
        _tmpExTitle = _cursor.getString(_cursorIndexOfExTitle);
        final String _tmpExDesc;
        _tmpExDesc = _cursor.getString(_cursorIndexOfExDesc);
        _item = new jointEntity(_tmpJointName,_tmpExName,_tmpExImg,_tmpExTitle,_tmpExDesc);
        final int _tmpExId;
        _tmpExId = _cursor.getInt(_cursorIndexOfExId);
        _item.setExId(_tmpExId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public jointEntity findByName(String ex, String joi) {
    final String _sql = "SELECT * FROM joint where ExName LIKE  ? AND jointName LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (ex == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, ex);
    }
    _argIndex = 2;
    if (joi == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, joi);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfExId = _cursor.getColumnIndexOrThrow("exId");
      final int _cursorIndexOfJointName = _cursor.getColumnIndexOrThrow("jointName");
      final int _cursorIndexOfExName = _cursor.getColumnIndexOrThrow("ExName");
      final int _cursorIndexOfExImg = _cursor.getColumnIndexOrThrow("ExImg");
      final int _cursorIndexOfExTitle = _cursor.getColumnIndexOrThrow("ExTitle");
      final int _cursorIndexOfExDesc = _cursor.getColumnIndexOrThrow("ExDesc");
      final jointEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpJointName;
        _tmpJointName = _cursor.getString(_cursorIndexOfJointName);
        final String _tmpExName;
        _tmpExName = _cursor.getString(_cursorIndexOfExName);
        final String _tmpExImg;
        _tmpExImg = _cursor.getString(_cursorIndexOfExImg);
        final String _tmpExTitle;
        _tmpExTitle = _cursor.getString(_cursorIndexOfExTitle);
        final String _tmpExDesc;
        _tmpExDesc = _cursor.getString(_cursorIndexOfExDesc);
        _result = new jointEntity(_tmpJointName,_tmpExName,_tmpExImg,_tmpExTitle,_tmpExDesc);
        final int _tmpExId;
        _tmpExId = _cursor.getInt(_cursorIndexOfExId);
        _result.setExId(_tmpExId);
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
