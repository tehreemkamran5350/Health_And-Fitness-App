package exercise_lose_weight;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jawadkhan.healthandfitness.AppDatabase;
import com.example.jawadkhan.healthandfitness.R;

import java.io.Serializable;
import java.util.List;

import DAO.WorkoutDAO;
import DTO.Workout;

/**
 * Created by Jawad Khan on 6/22/2018.
 */

public class ExerciseActivity extends Fragment implements View.OnClickListener{

    private RecyclerView recyclerView ;
    public static ExerciseActivity mActivity;
    private List<Workout> list ;
    private ContentAdapterClass adapter;
    private String id ;
    private Button start_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_exercises, container, false);
        fillData();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        adapter = new ContentAdapterClass(getActivity().getApplicationContext(), list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        start_btn= view.findViewById(R.id.start_btn);
        start_btn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.start_btn){
            Bundle bundle = new Bundle();
            bundle.putSerializable("workout_list", (Serializable) list);
            Fragment fragment = new workout_layout();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();
        }
    }

    private void fillData(){
        Bundle bundle = getArguments();
        id = bundle.getString("id");
        int dayID= Integer.parseInt(id);
        WorkoutDAO wdb = (WorkoutDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).Workout_DAO();
        list = wdb.getWorkouts(dayID);
    }
}
