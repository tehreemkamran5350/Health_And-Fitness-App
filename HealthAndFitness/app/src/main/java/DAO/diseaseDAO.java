package DAO;

/**
 * Created by Jawad Khan on 6/3/2018.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import DTO.diseaseEntity;

import java.util.List;

/**
 * Created by Jawad Khan on 6/3/2018.
 */
@Dao
public interface diseaseDAO {

    @Query("Select * from diseases")
    List<diseaseEntity> getAll();

    @Query("Select * from diseases where name = :name")
    diseaseEntity getDisease(String name);

    @Insert
    void insertAll(diseaseEntity... diseaseEntities);
}
