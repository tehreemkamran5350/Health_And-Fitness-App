package DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import DTO.Days;

import java.util.List;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Dao
public interface DaysDAO {
    @Query("SELECT * FROM Days order by id")
    List<Days> getAll();

    @Query("Delete from Days")
    public void deleteAll();

    @Query("SELECT * FROM Days where id = :ID")
    Days getData(int ID);

    @Insert
    void insertAll(Days... daysEntities);
}
