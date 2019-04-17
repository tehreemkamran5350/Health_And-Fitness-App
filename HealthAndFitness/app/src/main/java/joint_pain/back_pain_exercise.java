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

public class back_pain_exercise extends Fragment implements View.OnClickListener{

    private Button forwardBtn;
    private Button bendingBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.back_pain_exercise, container, false);

        forwardBtn=(Button)view.findViewById(R.id.btn_back_forward);
        forwardBtn.setOnClickListener(this);

        bendingBtn=(Button) view.findViewById(R.id.btn_back_bending);
        bendingBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_back_forward){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "back");
            bundle.putString("exType", "forward");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }

        if(v.getId() == R.id.btn_back_bending){
            Bundle bundle = new Bundle();
            bundle.putString("joint", "back");
            bundle.putString("exType", "backward");
            Fragment fragment = new exercise();
            fragment.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment).addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
