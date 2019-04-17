package meal_lose_weight;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jawadkhan.healthandfitness.R;

/**
 * Created by Jawad Khan on 6/17/2018.
 */

public class Dinner extends Fragment {

    private TextView tv_title,textView;
    private  String title,text;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_dinner, container, false);
        Bundle bundle = this.getArguments();
        title = bundle.getString("text");
        text = bundle.getString("dinner");
        textView = (TextView) view.findViewById(R.id.tv_meal_dinner);
        tv_title = (TextView) view.findViewById(R.id.tv_title_dinner);
        tv_title.setText(title);
        textView.setText(text);
        return view;
    }
}
