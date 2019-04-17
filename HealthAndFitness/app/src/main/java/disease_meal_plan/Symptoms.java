package disease_meal_plan;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jawadkhan.healthandfitness.AppDatabase;
import com.example.jawadkhan.healthandfitness.R;

import DAO.diseaseDAO;
import DTO.diseaseEntity;

/**
 * Created by Jawad Khan on 6/4/2018.
 */

public class Symptoms extends Fragment {

    private TextView textView;
    private diseaseDAO diseaseDAO;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_symptoms, container, false);
        Bundle bundle = this.getArguments();
        String message = bundle.getString("Message");
        diseaseDAO = (diseaseDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).diseaseDAO();
        diseaseDAO.insertAll(diseaseEntity.populateData());
        diseaseEntity diseaseEntity = diseaseDAO.getDisease(message);
        textView = (TextView) view.findViewById(R.id.tv_symptoms);
        textView.setText(diseaseEntity.getSymptoms());
        return view;
    }
}
