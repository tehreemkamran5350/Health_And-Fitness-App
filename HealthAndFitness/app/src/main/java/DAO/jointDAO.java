package DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import DTO.jointEntity;

/**
 * Created by Jawad Khan on 6/18/2018.
 */
@Dao
public interface jointDAO {
    @Query("Select * from joint")
    List<jointEntity> getAll();

    @Insert
    void insertAll(jointEntity... jointEntities);

    @Query("SELECT * FROM joint where ExName LIKE  :ex AND jointName LIKE :joi")
    jointEntity findByName(String ex, String joi);
}