package exercise_lose_weight;

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

import com.example.jawadkhan.healthandfitness.R;

import java.util.List;

import DTO.Workout;

/**
 * Created by Jawad Khan on 6/22/2018.
 */

public class workout_layout extends Fragment implements View.OnClickListener{

    private List<Workout> list ;
    private pl.droidsonroids.gif.GifImageView image;
    private TextView name;
    private TextView description;
    private Button btn_next;
    private Button btn_finish;
    private int current ;
    private int size;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_workout_layout, container, false);
        list = (List<Workout>) getArguments().getSerializable("workout_list");

        image = (pl.droidsonroids.gif.GifImageView) view.findViewById(R.id.iv_workout_image);
        name =(TextView) view.findViewById(R.id.tv_workout_name);
        description =(TextView) view.findViewById(R.id.tv_workout_description);
        btn_next= (Button) view.findViewById(R.id.btn_next);
        btn_next.setOnClickListener(this);

        btn_finish=(Button)view.findViewById(R.id.btn_finish);
        btn_finish.setOnClickListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        size = list.size();
        current =0;
        Workout w= list.get(current);
        String img= w.getImage();
        int res = getResources().getIdentifier(img, "drawable", getActivity().getPackageName());
        image.setImageResource(res);
        name.setText(w.getName());
        description.setText(w.getDescription());
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.btn_next){
            if(current< size-1){
                current++;
                Workout w= list.get(current);
                String img = w.getImage();
                int res = getResources().getIdentifier(img, "drawable", getActivity().getPackageName());
                image.setImageResource(res);
                name.setText(w.getName());
                description.setText(w.getDescription());
            }
            if (current == size-1){
                btn_next.setVisibility(View.GONE);
                btn_finish.setVisibility(View.VISIBLE);
            }
        }
        if (view.getId()== R.id.btn_finish) {
            Fragment fragment = new StartActivity();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_main, fragment);
            fragmentTransaction.commit();
        }
    }
}

