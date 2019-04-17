package joint_pain;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jawadkhan.healthandfitness.R;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

public class neck_pain_exercise extends Fragment implements View.OnClickListener{

    private Button ex1Btn;
    private Button ex2Btn;
    private Button ex3Btn;
    private Button ex4Btn;
    private Button ex5Btn;
    private Button ex6Btn;
    private Button ex7Btn;
    private Button ex8Btn;
    private Button ex9Btn;
    private Button ex10Btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.neck_pain_exercise, container, false);

        ex1Btn=(Button)view.findViewById(R.id.btn_neck_ex1);
        ex1Btn.setOnClickListener(this);

        ex2Btn=(Button)view.findViewById(R.id.btn_neck_ex2);
        ex2Btn.setOnClickListener(this);

        ex3Btn=(Button)view.findViewById(R.id.btn_neck_ex3);
        ex3Btn.setOnClickListener(this);

        ex4Btn=(Button)view.findViewById(R.id.btn_neck_ex4);
        ex4Btn.setOnClickListener(this);

        ex5Btn=(Button)view.findViewById(R.id.btn_neck_ex5);
        ex5Btn.setOnClickListener(this);

        ex6Btn=(Button)view.findViewById(R.id.btn_neck_ex6);
        ex6Btn.setOnClickListener(this);

        ex7Btn=(Button)view.findViewById(R.id.btn_neck_ex7);
        ex7Btn.setOnClickListener(this);

        ex8Btn=(Button)view.findViewById(R.id.btn_neck_ex8);
        ex8Btn.setOnClickListener(this);

        ex9Btn=(Button)view.findViewById(R.id.btn_neck_ex9);
        ex9Btn.setOnClickListener(this);

        ex10Btn=(Button)view.findViewById(R.id.btn_neck_ex10);
        ex10Btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_neck_ex1){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex1");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex2){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex2");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex3){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex3");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex4){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex4");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex5){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex5");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex6){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex6");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex7){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex7");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex8){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex8");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex9){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex9");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck_ex10){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "neck");
            bundle.putString("exType", "ex10");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
