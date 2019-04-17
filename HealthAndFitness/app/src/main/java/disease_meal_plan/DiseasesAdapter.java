package disease_meal_plan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jawadkhan.healthandfitness.R;

import java.util.List;

import DTO.diseaseEntity;

/**
 * Created by Jawad Khan on 5/26/2018.
 */

public class DiseasesAdapter extends RecyclerView.Adapter<DiseasesAdapter.MyViewHolder>{

    private List<diseaseEntity> diseasesList;

    public DiseasesAdapter(List<diseaseEntity> list){
        this.diseasesList = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_healthy_diet, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        diseaseEntity dis = diseasesList.get(position);

    }

    @Override
    public int getItemCount() {
        return diseasesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public Button btn;

        public MyViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.iv_healthyDiet);
            btn = (Button) view.findViewById(R.id.btn_healthyDiet);
        }
    }
}
