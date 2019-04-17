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

public class jointPainHome extends Fragment implements View.OnClickListener{

    private Button neckBtn;
    private Button backBtn;
    private Button kneeBtn;
    private Button shoulderBtn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_joint_pain_home, container, false);

        kneeBtn=(Button)view.findViewById(R.id.btn_knee);
        kneeBtn.setOnClickListener(this);

        neckBtn=(Button)view.findViewById(R.id.btn_neck);
        neckBtn.setOnClickListener(this);

        backBtn=(Button)view.findViewById(R.id.btn_back);
        backBtn.setOnClickListener(this);

        shoulderBtn=(Button)view.findViewById(R.id.btn_shoulder);
        shoulderBtn.setOnClickListener(this);

        return  view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Stay Strong, Stay Happy");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_knee){
            Fragment fragment = new knee_pain_exercise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_back){
            Fragment fragment = new back_pain_exercise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_neck){
            Fragment fragment = new neck_pain_exercise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_shoulder){
            Fragment fragment = new shoulder_pain_exercise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

    }
}
