package exercise_lose_weight;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jawadkhan.healthandfitness.AppDatabase;
import com.example.jawadkhan.healthandfitness.R;

import DAO.DayDAO;
import DAO.Day_WorkoutDAO;
import DAO.WorkoutDAO;
import DTO.Day_Workout;
import DTO.Days;
import DTO.LossWeightDay;
import DTO.Workout;
import joint_pain.exercise;

/**
 * Created by Jawad Khan on 6/22/2018.
 */

public class StartActivity extends Fragment {

    public static StartActivity sActivity ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_start, container, false);

        sActivity= this;
        SharedPreferences sp = getActivity().getSharedPreferences("database_exercise", Context.MODE_PRIVATE);
        if (sp.contains("populated") == false){
            WorkoutDAO wdb = (WorkoutDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).Workout_DAO();
            wdb.insertAll(Workout.populateData());

            DayDAO ddb = (DayDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).Day_DAO();
            ddb.insertAll(LossWeightDay.populateData());

            Day_WorkoutDAO wddb = (Day_WorkoutDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).day_workoutDAO();
            wddb.insertAll(Day_Workout.populateData());
            SharedPreferences.Editor e = sp.edit();
            e.putString("populated", "true");
            e.commit();
        }

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Loss Weight in 30 Days");
    }
}
