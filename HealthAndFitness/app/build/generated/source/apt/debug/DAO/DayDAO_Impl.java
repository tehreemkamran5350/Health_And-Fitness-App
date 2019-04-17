package DAO;

import DTO.LossWeightDay;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import java.lang.Override;
import java.lang.String;

public class DayDAO_Impl implements DayDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLossWeightDay;

  public DayDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLossWeightDay = new EntityInsertionAdapter<LossWeightDay>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `LossWeightDay`(`dayID`,`dayName`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LossWeightDay value) {
        stmt.bindLong(1, value.getDayID());
        if (value.getDayName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDayName());
        }
      }
    };
  }

  @Override
  public void insertAll(LossWeightDay... Days) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLossWeightDay.insert(Days);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
