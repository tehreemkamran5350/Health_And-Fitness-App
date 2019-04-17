package DAO;

import DTO.diseaseEntity;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class diseaseDAO_Impl implements diseaseDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfdiseaseEntity;

  public diseaseDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdiseaseEntity = new EntityInsertionAdapter<diseaseEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `diseases`(`id`,`Name`,`Description`,`Causes`,`Symptoms`,`Diet`,`Prevention`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, diseaseEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getCauses() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCauses());
        }
        if (value.getSymptoms() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSymptoms());
        }
        if (value.getDiet() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDiet());
        }
        if (value.getPrevention() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPrevention());
        }
      }
    };
  }

  @Override
  public void insertAll(diseaseEntity... diseaseEntities) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfdiseaseEntity.insert(diseaseEntities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<diseaseEntity> getAll() {
    final String _sql = "Select * from diseases";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("Description");
      final int _cursorIndexOfCauses = _cursor.getColumnIndexOrThrow("Causes");
      final int _cursorIndexOfSymptoms = _cursor.getColumnIndexOrThrow("Symptoms");
      final int _cursorIndexOfDiet = _cursor.getColumnIndexOrThrow("Diet");
      final int _cursorIndexOfPrevention = _cursor.getColumnIndexOrThrow("Prevention");
      final List<diseaseEntity> _result = new ArrayList<diseaseEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final diseaseEntity _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpCauses;
        _tmpCauses = _cursor.getString(_cursorIndexOfCauses);
        final String _tmpSymptoms;
        _tmpSymptoms = _cursor.getString(_cursorIndexOfSymptoms);
        final String _tmpDiet;
        _tmpDiet = _cursor.getString(_cursorIndexOfDiet);
        final String _tmpPrevention;
        _tmpPrevention = _cursor.getString(_cursorIndexOfPrevention);
        _item = new diseaseEntity(_tmpName,_tmpDescription,_tmpCauses,_tmpSymptoms,_tmpDiet,_tmpPrevention);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public diseaseEntity getDisease(String name) {
    final String _sql = "Select * from diseases where name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("Description");
      final int _cursorIndexOfCauses = _cursor.getColumnIndexOrThrow("Causes");
      final int _cursorIndexOfSymptoms = _cursor.getColumnIndexOrThrow("Symptoms");
      final int _cursorIndexOfDiet = _cursor.getColumnIndexOrThrow("Diet");
      final int _cursorIndexOfPrevention = _cursor.getColumnIndexOrThrow("Prevention");
      final diseaseEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpCauses;
        _tmpCauses = _cursor.getString(_cursorIndexOfCauses);
        final String _tmpSymptoms;
        _tmpSymptoms = _cursor.getString(_cursorIndexOfSymptoms);
        final String _tmpDiet;
        _tmpDiet = _cursor.getString(_cursorIndexOfDiet);
        final String _tmpPrevention;
        _tmpPrevention = _cursor.getString(_cursorIndexOfPrevention);
        _result = new diseaseEntity(_tmpName,_tmpDescription,_tmpCauses,_tmpSymptoms,_tmpDiet,_tmpPrevention);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
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
