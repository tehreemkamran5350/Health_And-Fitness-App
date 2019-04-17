package com.example.jawadkhan.healthandfitness;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import disease_meal_plan.HealthCare;
import disease_meal_plan.ListFragment;
import exercise_lose_weight.ExerciseActivity;
import exercise_lose_weight.RestActivity;
import exercise_lose_weight.StartActivity;
import joint_pain.jointPainHome;
import meal_lose_weight.MealModule;
import meal_lose_weight.Options;


public class HealthyDiet extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_diet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");
        if(id == 1){
            ListFragment listFragment = new ListFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, listFragment);
            fragmentTransaction.commit();
        }
        if(id == 2){
            Fragment fragment = null;
            fragment = new MealModule();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();
        }

        if(id == 3){
            Fragment fragment = null;
            fragment = new StartActivity();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();
        }

        if(id == 4){
            Fragment fragment = null;
            fragment = new jointPainHome();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();
        }
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btn_aids){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Aids";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();
        }
        if(v.getId() == R.id.btn_thalassemia){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Thalassemia";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();
        }
        if(v.getId() == R.id.btn_hepatitis){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Hepatitis";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_ulcer){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Ulcerative Colitis";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();
        }
        if(v.getId() == R.id.btn_diabetes){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Diabetes";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_anemia){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Anemia";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_renal){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Renal Disease";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_thyroid){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Thyroid Disease";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_heart){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Heart Disease";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_asthma){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Asthma";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();
        }
        if(v.getId() == R.id.btn_dengue){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Dengue Fever";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_food){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Food Poisioning";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_blood){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "High Blood Pressure";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_mumps){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Mumps";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();

        }
        if(v.getId() == R.id.btn_tb){
            Fragment fragment = null;
            fragment = new HealthCare();
            Bundle bundle = new Bundle();
            String message = "Tuberculosis";
            bundle.putString("Message", message);
            fragment.setArguments(bundle);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.content_main, fragment).addToBackStack(null);
            ft.commit();
        }

        if(v.getId()==R.id.tv_day1_main)
        {
            Bundle bundle = new Bundle();
            bundle.putString("text", "Day 1 Meal Plan");
            bundle.putInt("DayNo", 1);
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day2_main)
        {
            Bundle bundle = new Bundle();
            bundle.putString("text", "Day 2 Meal Plan");
            bundle.putInt("DayNo", 2);
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day3_main)
        {
            Bundle bundle = new Bundle();
            bundle.putString("text", "Day 3 Meal Plan");
            bundle.putInt("DayNo", 3);
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day4_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 4);
            bundle.putString("text", "Day 4 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day5_main)
        {Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 5);
            bundle.putString("text", "Day 5 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day6_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 6);
            bundle.putString("text", "Day 6 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day7_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 7);
            bundle.putString("text", "Day 7 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day8_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 8);
            bundle.putString("text", "Day 8 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day9_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 9);
            bundle.putString("text", "Day 9 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day10_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 10);
            bundle.putString("text", "Day 10 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day11_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 11);
            bundle.putString("text", "Day 11 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day12_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 12);
            bundle.putString("text", "Day 12 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day13_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 13);
            bundle.putString("text", "Day 13 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day14_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 14);
            bundle.putString("text", "Day 14 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day15_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 15);
            bundle.putString("text", "Day 15 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day16_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 16);
            bundle.putString("text", "Day 16 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day17_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 17);
            bundle.putString("text", "Day 17 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day18_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 18);
            bundle.putString("text", "Day 18 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day19_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 19);
            bundle.putString("text", "Day 19 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day20_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 20);
            bundle.putString("text", "Day 20 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day21_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 21);
            bundle.putString("text", "Day 21 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day22_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo",22);
            bundle.putString("text", "Day 22 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day23_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 23);
            bundle.putString("text", "Day 23 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day24_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 24);
            bundle.putString("text", "Day 24 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day25_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 25);
            bundle.putString("text", "Day 25 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day26_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 26);
            bundle.putString("text", "Day 26 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day27_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 27);
            bundle.putString("text", "Day 27 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day28_main)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 28);
            bundle.putString("text", "Day 28 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.tv_day29_main) {
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 29);
            bundle.putString("text", "Day 29 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId() == R.id.tv_day30_main){
            Bundle bundle = new Bundle();
            bundle.putInt("DayNo", 30);
            bundle.putString("text", "Day 30 Meal Plan");
            Fragment fragment = new Options();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        else if (v.getId()== R.id.day_one){
            Bundle bundle = new Bundle();
            bundle.putString("id", "1");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_two){
            Bundle bundle = new Bundle();
            bundle.putString("id", "2");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_three){
            Bundle bundle = new Bundle();
            bundle.putString("id", "3");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_four){
            Bundle bundle = new Bundle();
            bundle.putString("id", "4");
            Fragment fragment = new RestActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_five){
            Bundle bundle = new Bundle();
            bundle.putString("id", "5");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_six) {
            Bundle bundle = new Bundle();
            bundle.putString("id", "6");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_seven){
            Bundle bundle = new Bundle();
            bundle.putString("id", "7");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_eight){
            Bundle bundle = new Bundle();
            bundle.putString("id", "8");
            Fragment fragment = new RestActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_nine){
            Bundle bundle = new Bundle();
            bundle.putString("id", "9");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_ten){
            Bundle bundle = new Bundle();
            bundle.putString("id", "10");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_eleven){
            Bundle bundle = new Bundle();
            bundle.putString("id", "11");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twelve){
            Bundle bundle = new Bundle();
            bundle.putString("id", "12");
            Fragment fragment = new RestActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_thirteen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "3");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_fourteen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "14");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_fifteen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "15");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_sixteen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "16");
            Fragment fragment = new RestActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_seventeen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "17");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_eighteen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "18");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_nineteen){
            Bundle bundle = new Bundle();
            bundle.putString("id", "19");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else  if (v.getId()== R.id.day_twenty)
        {
            Bundle bundle = new Bundle();
            bundle.putString("id", "20");
            Fragment fragment = new RestActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentyone){
            Bundle bundle = new Bundle();
            bundle.putString("id", "21");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentytwo){
            Bundle bundle = new Bundle();
            bundle.putString("id", "22");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentythree){
            Bundle bundle = new Bundle();
            bundle.putString("id", "23");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentyfour){
            Bundle bundle = new Bundle();
            bundle.putString("id", "24");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentyfive){
            Bundle bundle = new Bundle();
            bundle.putString("id", "25");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentysix){
            Bundle bundle = new Bundle();
            bundle.putString("id", "26");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentyseven){
            Bundle bundle = new Bundle();
            bundle.putString("id", "27");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentyeight){
            Bundle bundle = new Bundle();
            bundle.putString("id", "28");
            Fragment fragment = new RestActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_twentynine){
            Bundle bundle = new Bundle();
            bundle.putString("id", "29");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId()==R.id.day_thirty){
            Bundle bundle = new Bundle();
            bundle.putString("id", "30");
            Fragment fragment = new ExerciseActivity();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.icon_disease) {
            ListFragment listFragment = new ListFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, listFragment);
            fragmentTransaction.commit();

        } else if (id == R.id.icon_lose_weight) {
            Fragment fragment = null;
            fragment = new MealModule();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.icon_exercise) {
            Fragment fragment = null;
            fragment = new StartActivity();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.icon_joints_pain) {
            Fragment fragment = null;
            fragment = new jointPainHome();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.icon_about) {
            Intent intent = new Intent(this, popUp.class);
            intent.putExtra("id", 1);
            startActivity(intent);

        } else if (id == R.id.icon_contact) {
            Intent intent = new Intent(this, popUp.class);
            intent.putExtra("id", 2);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
