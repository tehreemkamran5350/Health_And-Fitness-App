package joint_pain;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jawadkhan.healthandfitness.AppDatabase;
import com.example.jawadkhan.healthandfitness.R;

import DAO.jointDAO;
import DTO.jointEntity;

/**
 * Created by Jawad Khan on 6/18/2018.
 */

public class exercise extends Fragment {
    private TextView tv_details;
    private ImageView img_ex;
    private String joint_type;
    private String ex_type;
    private TextView ex_title;
    private jointDAO jointDAO;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_exercise, container, false);

        ex_title=(TextView) view.findViewById(R.id.tv_ex_title);
        tv_details = (TextView) view.findViewById(R.id.tv_ex_detail);
        img_ex = (ImageView) view.findViewById(R.id.img_ex);

        Bundle bundle = getArguments();
        joint_type = bundle.getString("joint");
        ex_type = bundle.getString("exType");

        jointDAO = (jointDAO) AppDatabase.getInstance(getActivity().getApplicationContext()).jointDAO();
        jointDAO.insertAll(jointEntity.populateData());

        jointEntity j = jointDAO.findByName(ex_type, joint_type);

        ex_title.setText(j.getExTitle());
        tv_details.setText(j.getExDesc());
        int res = getResources().getIdentifier(j.getExImg(), "drawable", getActivity().getPackageName());
        img_ex.setImageResource(res);

        return view;
    }
}
