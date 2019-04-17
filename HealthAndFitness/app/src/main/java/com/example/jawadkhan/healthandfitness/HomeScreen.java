package com.example.jawadkhan.healthandfitness;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeScreen extends Fragment implements  View.OnClickListener{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_screen, container, false);
        btn1 = view.findViewById(R.id.diet_diseases);
        btn2 = view.findViewById(R.id.diet_weight);
        btn3 = view.findViewById(R.id.exercise_weight);
        btn4 = view.findViewById(R.id.exercise_pain);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.diet_diseases){
            Intent intent = new Intent(getActivity(), HealthyDiet.class);
            intent.putExtra("id", 1);
            startActivity(intent);
        }

        if(v.getId() == R.id.diet_weight){
            Intent intent = new Intent(getActivity(), HealthyDiet.class);
            intent.putExtra("id",2);
            startActivity(intent);
        }

        if(v.getId() == R.id.exercise_weight){
            Intent intent = new Intent(getActivity(), HealthyDiet.class);
            intent.putExtra("id", 3);
            startActivity(intent);
        }

        if(v.getId() == R.id.exercise_pain){
            Intent intent = new Intent(getActivity(), HealthyDiet.class);
            intent.putExtra("id", 4);
            startActivity(intent);
        }
    }
}
