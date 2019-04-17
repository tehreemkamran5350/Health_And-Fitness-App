package DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import DTO.LossWeightDay;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Dao
public interface DayDAO {
    @Insert
    void insertAll(LossWeightDay... Days);
}