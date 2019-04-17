package DTO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jawad Khan on 6/23/2018.
 */

@Entity(tableName = "LossWeightDay")
public class LossWeightDay {
    @PrimaryKey
    private int dayID;

    @ColumnInfo(name ="dayName")
    private String dayName;

    public LossWeightDay(int dayID, String dayName) {
        this.dayID = dayID;
        this.dayName = dayName;
    }

    public int getDayID() {
        return dayID;
    }

    public void setDayID(int dayID) {
        this.dayID = dayID;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public static LossWeightDay[] populateData(){
        return new LossWeightDay[]{
                new LossWeightDay(1, "day_one"),
                new LossWeightDay( 2,"day_two"),
                new LossWeightDay( 3,"day_three"),
                new LossWeightDay( 4,"day_four"),
                new LossWeightDay( 5,"day_five"),
                new LossWeightDay( 6,"day_six"),
                new LossWeightDay( 7,"day_seven"),
                new LossWeightDay( 8,"day_eight"),
                new LossWeightDay( 9,"day_nine"),
                new LossWeightDay( 10,"day_ten"),
                new LossWeightDay( 11,"day_eleven"),
                new LossWeightDay( 12,"day_twelve"),
                new LossWeightDay( 13,"day_thirteen"),
                new LossWeightDay( 14,"day_fourteen"),
                new LossWeightDay( 15,"day_fifteen"),
                new LossWeightDay( 16,"day_sixteen"),
                new LossWeightDay( 17,"day_seventeen"),
                new LossWeightDay( 18,"day_eighteen"),
                new LossWeightDay( 19,"day_nineteen"),
                new LossWeightDay( 20,"day_twenty"),
                new LossWeightDay( 21,"day_twentyone"),
                new LossWeightDay( 22,"day_twentytow"),
                new LossWeightDay( 23,"day_twentythree"),
                new LossWeightDay( 24,"day_twentyfour"),
                new LossWeightDay( 25,"day_twentyfive"),
                new LossWeightDay( 26,"day_twentysix"),
                new LossWeightDay( 27,"day_twentyseven"),
                new LossWeightDay( 28,"day_twentyeight"),
                new LossWeightDay( 29,"day_twentynine"),
                new LossWeightDay( 30,"day_thirty")
        };
    }
}
