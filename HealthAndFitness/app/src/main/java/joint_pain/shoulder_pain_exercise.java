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

public class shoulder_pain_exercise extends Fragment implements View.OnClickListener{

    private Button act1Btn;
    private Button act2Btn;
    private Button act3Btn;
    private Button act4Btn;
    private Button act5Btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shoulder_pain_exercise, container, false);

        act1Btn=(Button)view.findViewById(R.id.btn_act1);
        act1Btn.setOnClickListener(this);

        act2Btn=(Button)view.findViewById(R.id.btn_act2);
        act2Btn.setOnClickListener(this);

        act3Btn=(Button)view.findViewById(R.id.btn_act3);
        act3Btn.setOnClickListener(this);

        act4Btn=(Button)view.findViewById(R.id.btn_act4);
        act4Btn.setOnClickListener(this);

        act5Btn=(Button)view.findViewById(R.id.btn_act5);
        act5Btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_act1){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "shoulder");
            bundle.putString("exType", "action1");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_act2){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "shoulder");
            bundle.putString("exType", "action2");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_act3){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "shoulder");
            bundle.putString("exType", "action3");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_act4){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "shoulder");
            bundle.putString("exType", "action4");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_act5){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "shoulder");
            bundle.putString("exType", "action5");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

    }
}
