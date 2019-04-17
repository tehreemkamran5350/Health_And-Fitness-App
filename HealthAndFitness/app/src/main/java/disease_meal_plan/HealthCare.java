package disease_meal_plan;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jawadkhan.healthandfitness.R;

public class HealthCare extends Fragment implements View.OnClickListener{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_health_care,container, false);
        btn1 =  view.findViewById(R.id.opt_des);
        btn2 =  view.findViewById(R.id.opt_cause);
        btn3 =  view.findViewById(R.id.opt_sym);
        btn4 =  view.findViewById(R.id.opt_diet);
        btn5 =  view.findViewById(R.id.opt_pre);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Health is Wealth");
    }

    public void onClick(View view){
        if (view.getId() == R.id.opt_des)
        {
            Bundle bundle = this.getArguments();
            String message = bundle.getString("Message");
            Bundle bundle1 = new Bundle();
            bundle1.putString("Message", message);
            Fragment fragment = new Description();
            fragment.setArguments(bundle1);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        if(view.getId() == R.id.opt_cause){
            Bundle bundle = this.getArguments();
            String message = bundle.getString("Message");
            Bundle bundle1 = new Bundle();
            bundle1.putString("Message", message);
            Fragment fragment = new Causes();
            fragment.setArguments(bundle1);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }
        if(view.getId() == R.id.opt_sym){
            Bundle bundle = this.getArguments();
            String message = bundle.getString("Message");
            Bundle bundle1 = new Bundle();
            bundle1.putString("Message", message);
            Fragment fragment = new Symptoms();
            fragment.setArguments(bundle1);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
        if(view.getId() == R.id.opt_diet){
            Bundle bundle = this.getArguments();
            String message = bundle.getString("Message");
            Bundle bundle1 = new Bundle();
            bundle1.putString("Message", message);
            Fragment fragment = new Diet();
            fragment.setArguments(bundle1);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }
        if(view.getId() == R.id.opt_pre){
            Bundle bundle = this.getArguments();
            String message = bundle.getString("Message");
            Bundle bundle1 = new Bundle();
            bundle1.putString("Message", message);
            Fragment fragment = new Prevention();
            fragment.setArguments(bundle1);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
