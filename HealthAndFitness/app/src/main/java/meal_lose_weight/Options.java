package meal_lose_weight;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.jawadkhan.healthandfitness.AppDatabase;
import com.example.jawadkhan.healthandfitness.R;

import java.util.List;

import DAO.DaysDAO;
import DTO.Days;


/**
 * Created by Jawad Khan on 6/17/2018.
 */

public class Options extends Fragment implements View.OnClickListener{

    TextView textView;
    private int DayNum;
    private String text;
    Button breakfast, lunch, dinner;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_options,container, false);
        textView = (TextView) view.findViewById(R.id.tv_title_options);
        Bundle bundle = this.getArguments();
        String text = bundle.getString("text");
        textView.setText(text);
        DayNum = bundle.getInt("DayNo");
        breakfast = (Button) view.findViewById(R.id.tv_breakfast_options);
        lunch = (Button) view.findViewById(R.id.tv_lunch_options);
        dinner = (Button) view.findViewById(R.id.tv_dinner_options);
        breakfast.setOnClickListener(this);
        lunch.setOnClickListener(this);
        dinner.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Meal Plan");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.tv_breakfast_options)
        {
            Bundle bundle = new Bundle();
            bundle.putString("text", "Breakfast");
            DaysDAO daysDAO = (DaysDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).dataDao();
            daysDAO.insertAll(Days.populateData());
            List<Days> list = daysDAO.getAll();
            for (Days D : list) {
                int day = D.getDayNo();
                if (DayNum == day) {
                    text = D.getBreakfast();
                    bundle.putString("breakfast", text);
                    break;
                }
            }
            Fragment fragment = new Breakfast();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if(v.getId()==R.id.tv_lunch_options)
        {
            Bundle bundle = new Bundle();
            bundle.putString("text", "Lunch");
            DaysDAO daysDAO = (DaysDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).dataDao();
            daysDAO.insertAll(Days.populateData());
            List<Days> list = daysDAO.getAll();
            for (Days D : list) {
                int day = D.getDayNo();
                if (DayNum == day) {
                    text = D.getLunch();
                    bundle.putString("lunch", text);
                    break;
                }
            }
            Fragment fragment = new Lunch();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        else
        {
            Bundle bundle = new Bundle();
            bundle.putString("text", "Dinner");
            DaysDAO daysDAO = (DaysDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).dataDao();
            daysDAO.insertAll(Days.populateData());
            List<Days> list = daysDAO.getAll();
            for (Days D : list) {
                int day = D.getDayNo();
                if (DayNum == day) {
                    text = D.getDinner();
                    bundle.putString("dinner", text);
                    break;
                }
            }
            Fragment fragment = new Dinner();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
