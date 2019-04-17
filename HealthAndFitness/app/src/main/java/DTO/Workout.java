package DTO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

@Entity (tableName = "Workout")
public class Workout implements Serializable{
    @PrimaryKey
    private int id;

    @ColumnInfo(name = "workout_name")
    private String name ;

    @ColumnInfo(name = "workout_image")
    private String image;

    @ColumnInfo(name = "workout_description")
    private String description;

    @ColumnInfo(name = "workout_time")
    private String time;


    public Workout(int id, String name, String image, String description, String time) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.time = time;

    }

    public String getName() {  return name; }

    public void setName(String name) { this.name = name; }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static Workout[] populateData(){
        return new Workout[]{
                new Workout(1, "Wall Push-Ups", "wallpushups","Stand in front of a wall one big step away from it. Then put your hands out straight towards the wall and lean against it. Slowly bend your elbow and press your upper body towards the wall. Push back and repeat the exercise. Remember to keep your body straight.", "x20" ),
                new Workout(2, "Squats","squats","Stand with your feet shoulder with apart and your arms stretched forward, then lower your body until your thighs are parallel with the floor.", "x20" ),
                new Workout(3, "Bicycle Crunches", "bicyclecrunches","Lie on the floor with your hands behind your ears. Raise your knees and close your right elbow towards your left knee, then close your left elbow towards your right knee. Repeat the exercise.", "x20" ),
                new Workout(4, "Butt Bridge", "buttbridge","Lie on your back with knee bent and fet flat in the floor. Put your arms flat at your sides. Then lift your butt up and down.", "x20" ),
                new Workout(5, "Claps Over Head", "clapsoverhead","Stand with your feet shoulder width apart. Raise your arms and clap over your head.", "x20" ),
                new Workout(6, "Donkey Kicks Left", "donkeykicksleft","Start on all fours with your knees under your butt and your hands under your shoulders. Then lift your left leg and squeeze your butt as much as you can. Go back to the start position and repeat the exercise. ", "x20" ),
                new Workout(7, "Donkey Kicks Right", "donkeykicksright","Start on all fours with your knees under your butt and your hands under your shoulders. Then lift your right leg and squeeze your butt as much as you can. Go back to the start position and repeat the exercise. ", "x20" ),
                new Workout(8, "Fire Hydrant Left", "firehydrantleft","Start on all fours with your knees under your butt and your hands under your shoulders. Then lift your left leg to the side at a 90 degree angle.", "x20" ),
                new Workout(9, "Fire Hydrant right", "firehydrantright","Start on all fours with your knees under your butt and your hands under your shoulders. Then lift your right leg to the side at a 90 degree angle.", "x20" ),
                new Workout(10, "Flutter Kicks", "flutterkicks","Lie on your back with your arms at your sides. Lift your legs and keep them as straught as you can. Then quickly raise your right leg up, and simultaneously lower your left leg. Switch legs and repeat.", "x20" ),
                new Workout(11,"Heel Touch", "heeltouch","Lie on the ground with your legs bent and your arms by your sides. Slightly lift your upper body off the floor and make your hands alternately reach your heels.", "x20" ),
                new Workout(12, "Lunge", "lunges","Stand with your feet shoulder width apart and your hands on your hips. Take a step forward with your right leg and lower your body until your right thigh is parallel with the floor.", "x20" ),
                new Workout(13, "Plank", "plank","Lie on the floor with your toes and forearms on the ground. Keep your body straight and hold this position as long as you can.", "x20" ),
                new Workout(14, "Plie Squats","pliesquats","Stand with your hands on your hips and feet little wider than shoulder width apart. Then lower your body until your thighs are parallel to the floor. Your knees should be extended in the same direction as your tiptoes", "x20" ),
                new Workout(15, "Side Lunges", "sidelunges","Stand straight with your feet together. Move your right leg to the side, then lower your body while keeping your left lelg straight. Go back to the start postion and switch to the other side.", "x20" ),
                new Workout(16, "Side-lying Leg Lift Right", "sidelyingright","Lie down on your side with your head rested on your left arm. Lift your upper leg up and returned to the start position.", "x20" ),
                new Workout(17, "Side-lying Leg Lift Left", "sidelyingleft","Lie down on your side with your head rested on your right arm. Lift your upper leg up and returned to the start position.", "x20" ),
                new Workout(18, "Swimmer and Superman", "swimmer","Lie on your stomach with your arms extended straight overhead. Alternately lift your opposite arm and leg.", "x20" ),
                new Workout(19, "Standing Bicycle Crunches", "standingbicycle","Stand with your feet shoulder width apart. Bring your knee to your opposite elbow. Return to start position and repeat with the other side.", "x20" ),
                new Workout(20, "Twist Crunches", "twistcrunches","Lie on the floor on your back, with knees bent and hands behind head. Feet should be flat on the floor. Keep a space between your chin and chest. Lift up, rotate upper body towards on side then rotate back. Repeat this for alternate sides.", "x20" )
        };
    }
}


