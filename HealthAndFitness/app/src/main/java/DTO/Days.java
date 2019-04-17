package DTO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Entity(tableName = "Days")

public class Days {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "DayNo")
    private int DayNo;

    @ColumnInfo(name = "breakfast")
    private String breakfast;

    @ColumnInfo(name = "lunch")
    private String lunch;

    @ColumnInfo(name = "dinner")
    private String dinner;

    public Days()
    {
        this.DayNo = 0;
        this.breakfast = "";
        this.lunch = "";
        this.dinner = "";
    }

    public Days(int dayNo, String breakfast, String lunch, String dinner) {
        this.DayNo = dayNo;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDayNo(int dayNo) {
        DayNo = dayNo;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public int getId() {
        return id;
    }

    public int getDayNo() {
        return DayNo;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public String getDinner() {
        return dinner;
    }
    public static Days[] populateData() {
        return new Days[]{
                new Days(1, "* A cup of Tea or black coffee without sugar and milk \n\n* Oatmeal porridge ",
                        "* 2 pieces of whole-grain toast with vegetable (onions,tomato etc)\n\n* Any grilled or bolied lean meats (beef,chicken breast lamb etc)",
                        "* Chicken Salad (chicken breast,grilled or boiled,with some fruits or vegetables"),
                new Days(2, "* A cup of Tea or black coffee without sugar and milk \n\n* Oats with fat-free milk(cracked wheat) ",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Yougurt (low-fat or low-sugar is better)",
                        "* Any vegetable soup with no salt added\n\n* Any grilled boild fish or seafood(Squids,crabs,shrimp)"),
                new Days(3, "* A cup of Tea or black coffee without sugar and milk \n\n* Oatmeal porridge\n\n* 2 scrambled eggs (no butter or oil)"
                        , "* Brown Rice or boiled noodles\n\n* Cooked or boiled vegetable(brocolli,cauliflower,zucchini,spinach or peas)",
                        "* 3 Baked or boild potatoes\n\n* Any grilled or boiled lean meats(beef,chicken breast lamb etc) "),
                new Days(4, "* A cup of Tea or black coffee without sugar and milk\n\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc)",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n\n* Any grilled or boiled fish or seafood (squid,crabs,shrimp)",
                        "* Some cooked or boiled com\n\n* Chicken Salad (chicken breast,grilled or boiled,with some fruits or vegetables"),
                new Days(5,"* 1 cup of tea or hot cocoa without sugar and milk\n\n* 2 scrambled eggs (no butter or oil)\n* 1 piece of whole grain bread or toast ",
                        "* 1 grape fruit or orange\n\n* Cooked or baked beans (soybean ,lentils black beans)",
                        "* Smoothie or low fat yogurt\n\n* Fat fre yogurt or milk with some berries\n\n* Any grilled or boiled lean meats"),
                new Days(6,"* A cup of Tea or black coffee without sugar and milk\n\n* Oats with fat free milk (oatmeal,cracked,wheat or barley)",
                        "* 2 Pieces if whole grain toast with vegetable (onions,tomato etc)\n\n* Cooked or boiled vegetable (brocolli,cauliflower,zucchini,spinach or peas)",
                        "* Fruit salad (apple,pear,orange,grapeful,pineapple etc)\n\n* Any grilled or boiled fish or seafood (squid,crabs,shrimp)"),
                new Days(7,"* A cup of Tea or black coffee without sugar and milk\n\n* Cooked or boiled corn with any vegetable you like",
                        "* Omelet out of three eggs and some vegetable\n\n*  Yougurt (low-fat or low-sugar is better)",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Any grilled or bolied lean meats (beef,chicken breast lamb etc)"),
                new Days(8,"* A cup of Tea or black coffee without sugar and milk\n\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc)",
                        "* Brown rice or boiled noodles\n\n* 3 Baked or boiled potatoes",
                        "* Any vegetable soup with no salt added\n\n* Cooked or baked beans (soybean,lentils,black beans,kdney beans etc)"),
                new Days(9,"* A cup of Tea or black coffee without sugar and milk\n\n* Oatmeal porridge",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Any grilled or bolied lean meats (beef,chicken breast lamb etc) ",
                        "* Chicken Salad (chicken breast,grilled or boiled,with some fruits or vegetables"),
                new Days(10,"* A cup of Tea or hot cocoa without sugar and milk\n\n* Cooked or boiled corn with any vegetable you like",
                        "* Smoothie or low-fat yogurt\n\n* Cooked or baked beans (soybean,lentils,black beans,kdney beans etc)",
                        "* 1 serving of fruit (apple,pear,bnana,orange,grapefruit,pineapple, etc\n\n* Any grilled or boiled fish or swafood(squids,crabs,strimp)"),
                new Days(11,"* A cup of Tea or black coffee without sugar and milk\n\n* 2 scrambled eggs(no butter or oil)\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc) ",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n\n",
                        "* 1 cookie (low sugar or sugar free is better)\n\n* Any grilled or boiled lean meats"),
                new Days(12,"* A cup of Tea or black coffee without sugar and milk\n\n* 2 scrambled eggs(no butter or oil)",
                        "* Brown rice or boiled noodles\n* Any vegetable soup with no salt added",
                        "* 1 grapefruit or orange\n\n* Chicken salad (chickne breast,grilled or boiled with some fruits or vegetable"),
                new Days(13,"* A cup of Tea or black coffee without sugar and milk\n\n* Cooked or boiled corn with any vegetable you like",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Yougurt (low-fat or low-sugar is better)",
                        "* Smoothie or low fat yogurt\n\n * Fat fre yogurt or milk with some berries\n\n"),
                new Days(14,"* Oats with fat free milk (oatmeal,cracked,wheat or barley)",
                        "* 2 Pieces if whole grain toast with vegetable (onions,tomato etc)\n\n* Cooked or boiled vegetable (brocolli,cauliflower,zucchini,spinach or peas)",
                        "* Fruit salad (apple,pear,orange,grapeful,pineapple etc)\n\n* Any grilled or boiled fish or seafood (squid,crabs,shrimp)"),
                new Days(15,"* A cup of Tea or black coffee without sugar and milk\n\n* Oatmeal porridge",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Any grilled or bolied lean meats (beef,chicken breast lamb etc) ",
                        "* Chicken Salad (chicken breast,grilled or boiled,with some fruits or vegetables"),
                new Days(16,"* A cup of Tea or black coffee without sugar and milk\n\n* 2 scrambled eggs(no butter or oil)\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc) ",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n\n",
                        "* 1 cookie (low sugar or sugar free is better)\n\n* Any grilled or boiled lean meats"),
                new Days(17, "* A cup of Tea or black coffee without sugar and milk \n\n* Oatmeal porridge\n\n* 2 scrambled eggs (no butter or oil)"
                        , "* Brown Rice or boiled noodles\n\n* Cooked or boiled vegetable(brocolli,cauliflower,zucchini,spinach or peas)",
                        "* Any grilled or boiled lean meats(beef,chicken breast lamb etc) "),
                new Days(18, "* A cup of Tea or black coffee without sugar and milk\n\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc)",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n\n* Any grilled or boiled fish or seafood (squid,crabs,shrimp)",
                        "* Fruit salad (apple,pear,orange,grapeful,pineapple etc)\n\n* Any grilled or boiled fish or seafood (squid,crabs,shrimp)"),
                new Days(19,"* 1 cup of tea or hot cocoa without sugar and milk\n* 2 scrambled eggs (no butter or oil)\n* 1 piece of whole grain bread or toast ",
                        "* 1 grape fruit or orange\n\n* Cooked or baked beans (soybean ,lentils black beans)",
                        "* Smoothie or low fat yogurt\n\n* Fat fre yogurt or milk with some berries\n\n* Any grilled or boiled lean meats"),
                new Days(20,"* A cup of Tea or black coffee without sugar and milk\n\n* 2 scrambled eggs(no butter or oil)\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc) ",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n\n",
                        "* 1 cookie (low sugar or sugar free is better)\n\n* Any grilled or boiled lean meats"),
                new Days(21,"* A cup of Tea or black coffee without sugar and milk\n* 2 scrambled eggs(no butter or oil)",
                        "* Brown rice or boiled noodles\n\n* Any vegetable soup with no salt added",
                        "* 1 grapefruit or orange\n\n* Chicken salad (chickne breast,grilled or boiled with some fruits or vegetable"),
                new Days(22,"* A cup of Tea or black coffee without sugar and milk\n\n* Cooked or boiled corn with any vegetable you like",
                        "* Omelet out of three eggs and some vegetable\n*  Yougurt (low-fat or low-sugar is better)",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Any grilled or bolied lean meats (beef,chicken breast lamb etc)"),
                new Days(23, "* A cup of Tea or black coffee without sugar and milk \n\n* Oatmeal porridge\n\n* 2 scrambled eggs (no butter or oil)"
                        , "* Brown Rice or boiled noodles",
                        "* 3 Baked or boild potatoes\n\n* Any grilled or boiled lean meats(beef,chicken breast lamb etc) "),
                new Days(24,"* A cup of Tea or black coffee without sugar and milk\n\n* Oatmeal porridge",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Any grilled or bolied lean meats (beef,chicken breast lamb etc) ",
                        "* Chicken Salad (chicken breast,grilled or boiled,with some fruits or vegetables\n\n* * 1 grapefruit or orange"),
                new Days(25, "* A cup of Tea or black coffee without sugar and milk \n\n* Oatmeal porridge\n\n* 2 scrambled eggs (no butter or oil)"
                        , "* Cooked or boiled vegetable(brocolli,cauliflower,zucchini,spinach or peas)",
                        "* Any grilled or boiled lean meats(beef,chicken breast lamb etc) "),
                new Days(26,"* 2 pieces of whole-grain toast with vegetable (onions,tomato etc)",
                        "* Brown rice or boiled noodles\n\n* 3 Baked or boiled potatoes",
                        "* Cooked or baked beans (soybean,lentils,black beans,kdney beans etc)"),
                new Days(27,"* A cup of Tea or black coffee without sugar and milk\n\n* Cooked or boiled corn with any vegetable you like",
                        "* Vegeatable Salad(carrots,tomatos,sweet peppers cucumbers etc)\n\n* Yougurt (low-fat or low-sugar is better)",
                        "* Fat fre yogurt or milk with some berries\n\n"),
                new Days(28, "* A cup of Tea or black coffee without sugar and milk\n\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc)",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n\n* Any grilled or boiled fish or seafood (squid,crabs,shrimp)",
                        "* Some cooked or boiled com"),
                new Days(29,"* A cup of Tea or black coffee without sugar and milk\n* 2 pieces of whole-grain toast with vegetable (onions,tomato etc) ",
                        "* Some blueberrries,Strawberries,raspberries or blaclberries\n",
                        "* 1 cookie (low sugar or sugar free is better)\n\n* Any grilled or boiled lean meats\n\n* * 3 Baked or boild potatoes\n"),
                new Days(30,"* A cup of Tea or black coffee without sugar and milk\n\n* 2 scrambled eggs(no butter or oil)",
                        "* Brown rice or boiled noodles\n\n* Any vegetable soup with no salt added",
                        "* 1 grapefruit or orange\n\n* Chicken salad (chickne breast,grilled or boiled with some fruits or vegetable"),

        };
    }
}

