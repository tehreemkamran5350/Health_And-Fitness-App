package DTO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jawad Khan on 6/18/2018.
 */

@Entity(tableName = "joint")
public class jointEntity {
    @PrimaryKey (autoGenerate = true)
    private int exId;

    @ColumnInfo(name = "jointName")
    public String jointName;

    @ColumnInfo(name = "ExName")
    private String ExName;

    @ColumnInfo(name = "ExImg")
    private String ExImg;

    @ColumnInfo(name = "ExTitle")
    private String ExTitle;

    @ColumnInfo(name = "ExDesc")
    private String ExDesc;


    public jointEntity(String jointName,String ExName,String ExImg,String ExTitle,String ExDesc)
    {
        this.jointName=jointName;
        this.ExName=ExName;
        this.ExImg=ExImg;
        this.ExTitle=ExTitle;
        this.ExDesc=ExDesc;
    }

    public void setExDesc(String exdesc) {
        ExDesc = exdesc;
    }
    public String getExDesc() {
        return ExDesc;
    }

    public void setExImg(String exImg) {
        ExImg = exImg;
    }
    public String getExImg() {
        return ExImg;
    }

    public void setjointName(String jointName) {
        this.jointName = jointName;
    }
    public String getjointName() {
        return jointName;
    }

    public void setExId(int exId){
        this.exId=exId;
    }
    public int getExId() {
        return exId;
    }

    public void setExName(String exName) {
        ExName = exName;
    }
    public String getExName() {
        return ExName;
    }


    public void setExTitle(String exTitle) {
        ExTitle = exTitle;
    }

    public String getExTitle() {
        return ExTitle;
    }

    public static jointEntity[] populateData() {
        return new jointEntity[] {
                //knee
                new jointEntity( "knee", "calf","calf","Standing Calf Stretch","When your calves are tight, it can lead to an inward movement of the knees, says Straub, which can cause pain. Stand on the edge of a curb or step and place your left foot on the ground, keeping the ball of your right foot on the step. Allow the right heel to drop below the step and hold here for 30 seconds, then switch sides. You can also place both feet on the curb, step, or a calf machine (pictures) and drop both heels at the same time. Just be sure to hold on to something in front of you if you choose this version."),
                new jointEntity("knee", "figure","figure","Figure Four Glute Stretch","Stretching the muscles that rotate the hips (specifically, the glutes and piriformis) can have a positive domino effect on the knees, says Williams. Her favorite way to stretch these often overlooked muscles is to do a Figure Four stretch: Lie on your back with your feet on the floor, then cross your right ankle over your left knee and clasp your hands behind your left thigh. Slowly and gently pull your left knee toward your chest. Repeat on the other side."),
                new jointEntity("knee", "hamstring","hamstring","Hamstring stretch", "1. Lie on the floor or bed with both legs bent.\n2. Slowly lift one leg, still bent, and bring your knee back toward your chest.\n3. Link your hands behind your thigh, not your knee, and straighten your leg.\n4. Pull your straight leg back toward your head until you feel the stretch.\n 5. Hold for 30 to 60 seconds, then slowly bend your knee and lower your leg back"),
                new jointEntity("knee", "hip","hip","Hip Flexor and Quad stretch", "When you're in pain, doing the go-to standing quad stretch (you know, the one where you hold onto one ankle and pull it close to your glutes) can be really challenging, if not impossible, says Williams. \"If bending your knee is difficult, this stretch can be really effective,\" she says. Lie on the floor or a bed on your stomach, and loop a belt or yoga strap around your right foot, holding either side with each hand. Gently pull the belt or strap so your heel moves toward your butt. When you feel a stretch in your hip flexor and quadriceps, hold for 30 seconds, and then repeat on the other side."),
                new jointEntity("knee", "legDip","leg_dip","One-Leg Dip", "1. Stand between two chairs and hold on to them for balance.\n2. Lift one leg about 12 inches and hold it out in front of you.\n3. Slowly, keeping your back straight, bend the other leg and lower your body a few inches, as if you were about to sit in a chair. Don't cross the lifted leg in front of the bent leg.\n4. Hold for 5 seconds and straighten bay.\n5. Repeat and switch legs"),
                new jointEntity( "knee", "legRaise","leg_raise","Leg Raise","1. Lie flat on your back on the floor or bed with your arms at your sides, toes up.\n2. Keep your leg straight while tightening your leg muscles, and slowly lift it several inches.\n3. Tighten your stomach muscles to push your lower back down.\n4. Hold and count to 5, then lower your leg as slowly as possible.\n5. Repeat, then switch to the other leg."),
                new jointEntity("knee", "legStretch","leg_stretch","Leg Stretch", "1. Sit on the floor with both legs out straight. Stabilize yourself with your hands on either side of your hips, and keep your back straight.\n2. Slowly bend one knee until it feels stretched, but not until it becomes painful.\n3. Hold your leg in that position for 5 seconds, then slowly straighten your leg out as far as you can, again holding for 5 seconds."),
                new jointEntity("knee", "roller","roller","IT Basnd Foam Roller", "It's incredibly common for the iliotibial band-the ligament that runs along the outside of the thigh, from the hip to the shin-to become tight and inflamed, which in turn can lead to knee pain. The best way to stretch it out is to use a foam roller on the whole outer thigh area, says Williams. Lie on your right side and place foam roller just below your right hip. Cross your left leg over and place it on the ground in front of you. Keeping your right hand or forearm on the ground, move your left foot up to roll down the side of your right thigh, stopping when the foam roller is just above your right knee; then move your left foot down, coming back to the starting position. Repeat on the other leg."),

                //back
                new jointEntity("back", "backward","backward","Backward Bending", "Do this for 5 minutes daily."),
                new jointEntity("back", "forward","forward","Forward Bending","Perform these exercises daily for about 10 minutes."),

                //neck
                new jointEntity("neck", "ex1","ex1","Exercise 1", "Lie on your back on a firm surface such as floor. Place your palms behind your head and slowly pull your head upward and forward. Hold for five seconds. Return to starting position. Do ten repetitions."),
                new jointEntity("neck", "ex2","ex2","Exercise 2", "Start by looking straight ahead. Slowly make ten circles with your head starting to the left. Then make ten circles starting to the right."),
                new jointEntity("neck", "ex3","ex3","Exercise 3", "Start by looking straight ahead. Rest the back of your left hand against your lower back. Place your right palm on the top of your head. Gently pull your head to the right until you feel a stretch in the neck muscles. Don't force the motion. Hold for five seconds, then return to starting position. Switch the arms. Do ten repetitions."),
                new jointEntity("neck", "ex4","ex4","Exercise 4", "Start by looking straight ahead. Place your palms behind your head and slowly press your head forward and downward. Hold for five seconds. Return to starting position. Do ten repetitions."),
                new jointEntity("neck", "ex5","ex5","Exercise 5", "Resting flat on your back, place your palms on the mat beside you. Inhale, activate your core, and lift your feet off the floor until they're at a 90 degree angle. Support your hips and lower back with your hands as you lift them off the floor. Continue to lift up as you hinge at the hips and rest your feet directly above your head. Hold for 20 seconds."),
                new jointEntity("neck", "ex6","ex6","Exercise 6", "Start by looking straight ahead. Cross your hands behind your back and try to touch your fingers. Hold for five seconds. Switch the arms. Do ten repetitions."),
                new jointEntity("neck", "ex7","ex7","Exercise 7", "Start by looking straight ahead. Your feet should be slightly apart, positioned just under your hips. With your arms start making circles forward for 30 seconds. The circles must be firm and strong enough in order to engage the spine blades. Then for 30 second make circles backward."),
                new jointEntity("neck", "ex8","ex8","Exercise 8", "Start by looking straight ahead. Slowly lower your chin toward your chest. Hold for five seconds, then return to starting position. Without arching your back, slowly move your head backward so you are looking upward. Hold for five seconds. Return to starting position. Do ten repetitions."),
                new jointEntity("neck", "ex9","ex9","Exercise 9", "Start by looking straight ahead. Slowly lean your head to the left. Hold for five seconds, then return to starting position. Then, slowly lean your head to the other side. Hold for five seconds. Return to starting position. Do ten repetitions."),
                new jointEntity("neck", "ex10","ex10","Exercise 10", "Start by looking straight ahead. Slowly raise both shoulders up. Hold for five seconds, then return to starting position. Do ten repetitions."),

                //shoulder
                new jointEntity("shoulder", "action1","act1","Action 1", "1. Lean forward and place one hand on a counter or table for support. Let your other arm hang freely at your side.\n2. Gentle swing your arm forward and back. Repeat the exercise moving your arm side-to-side, and repeat again in a circular motion.\n3. Repeat the entire sequence with the other arm."),
                new jointEntity("shoulder", "action2","act2","Action 2", "1. Relax your shoulders and gentally pull one arm across your chest as far as possible,holding at your upper arm."),
                new jointEntity("shoulder", "action3","act3","Action 3", "1. Lean forward and place one hand on a counter or table for support. Let your other arm hang freely at your side.\n2. Gentle swing your arm forward and back. Repeat the exercise moving your arm side-to-side, and repeat again in a circular motion.\n3. Repeat the entire sequence with the other  arm."),
                new jointEntity("shoulder", "action4","act4","Action 4", "1. Grasp the stick with one hand and cup the other end of the stick with the other hand.\n2. Keep the elbow of the shoulder you are stretching against the side of your body and push the stick horizontally as shown to the point of feeling a pull without pain.\n3. Hold for 30 seconds and then relax for 30 seconds 4. Repeat on the other side."),
                new jointEntity("shoulder", "action5","act5","Action 5", "1. Lie on your stomach with your arms by your sides. Place a pillow under your forehead for comfort, if required.\n2. Gently draw your shoulder blades together and down your back as far as possible.\n3. Ease about halfway off from this position and hold for 10 seconds.\n4. Relax and repeat 10 times.")

        };
    }
}

