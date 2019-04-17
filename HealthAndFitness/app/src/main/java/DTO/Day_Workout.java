package DTO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Entity(tableName = "Day_Workout", foreignKeys = {@ForeignKey(entity = Workout.class,parentColumns = "id",childColumns = "workoutID",onDelete = CASCADE),
        @ForeignKey(entity = LossWeightDay.class,parentColumns = "dayID",childColumns = "dayID",onDelete = CASCADE)})
public class Day_Workout {
    @PrimaryKey (autoGenerate = true)
    private int id;

    @ColumnInfo(name="dayID")
    private int dayID;

    @ColumnInfo(name="workoutID")
    private int workoutID;

    public Day_Workout( int dayID, int workoutID) {
        this.id = id;
        this.dayID = dayID;
        this.workoutID = workoutID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDayID() {
        return dayID;
    }

    public void setDayID(int dayID) {
        this.dayID = dayID;
    }

    public int getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public static Day_Workout[] populateData(){
        return new Day_Workout[] {
                new Day_Workout(1,4),
                new Day_Workout(1,5),
                new Day_Workout(1,13),
                new Day_Workout(1,16),
                new Day_Workout(1,17),
                new Day_Workout(1,1),
                new Day_Workout(1,2),


                new Day_Workout(2,5),
                new Day_Workout(2,20),
                new Day_Workout(2,8),
                new Day_Workout(2,9),
                new Day_Workout(2,13),
                new Day_Workout(2,19),
                new Day_Workout(2,1),


                new Day_Workout(3,3),
                new Day_Workout(3,20),
                new Day_Workout(3,6),
                new Day_Workout(3,7),
                new Day_Workout(3,10),
                new Day_Workout(3,11),
                new Day_Workout(3,13),


                new Day_Workout(5,4),
                new Day_Workout(5,5),
                new Day_Workout(5,11),
                new Day_Workout(5,13),
                new Day_Workout(5,1),

                new Day_Workout(6,10),
                new Day_Workout(6,13),
                new Day_Workout(6,16),
                new Day_Workout(6,17),
                new Day_Workout(6,19),
                new Day_Workout(6,18),


                new Day_Workout(7,3),
                new Day_Workout(7,20),
                new Day_Workout(7,10),
                new Day_Workout(7,13),
                new Day_Workout(7,18),
                new Day_Workout(7,15),


                new Day_Workout(9,4),
                new Day_Workout(9,6),
                new Day_Workout(9,7),
                new Day_Workout(9,11),
                new Day_Workout(9,12),
                new Day_Workout(9,13),
                new Day_Workout(9,1),


                new Day_Workout(10,3),
                new Day_Workout(10,5),
                new Day_Workout(10,20),
                new Day_Workout(10,8),
                new Day_Workout(10,9),
                new Day_Workout(10,13),


                new Day_Workout(11,4),
                new Day_Workout(11,11),
                new Day_Workout(11,12),
                new Day_Workout(11,13),
                new Day_Workout(11,16),
                new Day_Workout(11,17),
                new Day_Workout(11,1),



                new Day_Workout(13,5),
                new Day_Workout(13,20),
                new Day_Workout(13,8),
                new Day_Workout(13,9),
                new Day_Workout(13,19),
                new Day_Workout(13,13),



                new Day_Workout(14,20),
                new Day_Workout(14,6),
                new Day_Workout(14,7),
                new Day_Workout(14,10),
                new Day_Workout(14,13),
                new Day_Workout(14,14),
                new Day_Workout(14,18),


                new Day_Workout(15,5),
                new Day_Workout(15,11),
                new Day_Workout(15,13),
                new Day_Workout(15,18),
                new Day_Workout(15,1),


                new Day_Workout(17,3),
                new Day_Workout(17,5),
                new Day_Workout(17,12),
                new Day_Workout(17,13),
                new Day_Workout(17,16),
                new Day_Workout(17,17),
                new Day_Workout(17,18),


                new Day_Workout(18,3),
                new Day_Workout(18,4),
                new Day_Workout(18,11),
                new Day_Workout(18,13),
                new Day_Workout(18,2),
                new Day_Workout(18,14),
                new Day_Workout(18,1),

                new Day_Workout(19,3),
                new Day_Workout(19,4),
                new Day_Workout(19,5),
                new Day_Workout(19,6),
                new Day_Workout(19,7),
                new Day_Workout(19,13),
                new Day_Workout(19,19),


                new Day_Workout(21,20),
                new Day_Workout(21,6),
                new Day_Workout(21,7),
                new Day_Workout(21,8),
                new Day_Workout(21,9),
                new Day_Workout(21,11),
                new Day_Workout(21,13),
                new Day_Workout(21,1),


                new Day_Workout(22,3),
                new Day_Workout(22,4),
                new Day_Workout(22,10),
                new Day_Workout(22,11),
                new Day_Workout(22,13),
                new Day_Workout(22,2),
                new Day_Workout(22,1),


                new Day_Workout(23,3),
                new Day_Workout(23,4),
                new Day_Workout(23,5),
                new Day_Workout(23,13),
                new Day_Workout(23,15),
                new Day_Workout(23,16),
                new Day_Workout(23,17),
                new Day_Workout(23,18),
                new Day_Workout(23,19),


                new Day_Workout(25,4),
                new Day_Workout(25,20),
                new Day_Workout(25,6),
                new Day_Workout(25,7),
                new Day_Workout(25,10),
                new Day_Workout(25,13),
                new Day_Workout(25,19),



                new Day_Workout(26,20),
                new Day_Workout(26,8),
                new Day_Workout(26,9),
                new Day_Workout(26,13),
                new Day_Workout(26,15),
                new Day_Workout(26,1),


                new Day_Workout(27,3),
                new Day_Workout(27,5),
                new Day_Workout(27,11),
                new Day_Workout(27,13),
                new Day_Workout(27,16),
                new Day_Workout(27,17),
                new Day_Workout(27,2),


                new Day_Workout(29,20),
                new Day_Workout(29,6),
                new Day_Workout(29,7),
                new Day_Workout(29,10),
                new Day_Workout(29,13),
                new Day_Workout(29,14),
                new Day_Workout(29,2),


                new Day_Workout(30,4),
                new Day_Workout(30,3),
                new Day_Workout(30,11),
                new Day_Workout(30,12),
                new Day_Workout(30,13),
                new Day_Workout(30,18),
                new Day_Workout(30,1)
        };

    }
}

