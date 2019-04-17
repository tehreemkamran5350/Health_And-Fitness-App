package joint_pain;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
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

public class knee_pain_exercise extends Fragment implements View.OnClickListener{

    private Button legRaiseBtn;
    private Button hamstringBtn;
    private Button legDipBtn;
    private Button legStrechBtn;
    private Button calfBtn;
    private Button hipBtn;
    private Button rollerBtn;
    private Button figureBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.knee_pain_exercises, container, false);

        legRaiseBtn=(Button)view.findViewById(R.id.btn_knee_legRaise);
        legRaiseBtn.setOnClickListener(this);

        hamstringBtn=(Button) view.findViewById(R.id.btn_knee_hamstring);
        hamstringBtn.setOnClickListener(this);

        legDipBtn=(Button) view.findViewById(R.id.btn_knee_legDip);
        legDipBtn.setOnClickListener(this);

        legStrechBtn=(Button) view.findViewById(R.id.btn_knee_legStrech);
        legStrechBtn.setOnClickListener(this);

        calfBtn=(Button) view.findViewById(R.id.btn_knee_calf);
        calfBtn.setOnClickListener(this);

        hipBtn=(Button) view.findViewById(R.id.btn_knee_hip);
        hipBtn.setOnClickListener(this);

        rollerBtn=(Button) view.findViewById(R.id.btn_knee_roller);
        rollerBtn.setOnClickListener(this);

        figureBtn=(Button) view.findViewById(R.id.btn_knee_figure);
        figureBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_knee_legDip){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "legDip");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_knee_legRaise){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "legRaise");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(v.getId() == R.id.btn_knee_legStrech){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "legStretch");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_knee_calf){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "calf");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(v.getId() == R.id.btn_knee_figure){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "figure");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(v.getId() == R.id.btn_knee_hamstring){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "hamstring");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(v.getId() == R.id.btn_knee_hip){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "hip");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_knee_roller){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "knee");
            bundle.putString("exType", "roller");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();

        }
    }
}
