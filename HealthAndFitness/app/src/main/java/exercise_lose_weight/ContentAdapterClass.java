package exercise_lose_weight;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jawadkhan.healthandfitness.AppDatabase;
import com.example.jawadkhan.healthandfitness.R;

import java.util.List;

import DAO.WorkoutDAO;
import DTO.Workout;

/**
 * Created by Jawad Khan on 6/22/2018.
 */

public class ContentAdapterClass extends RecyclerView.Adapter {
    Context context;
    private List<Workout> list;

    public ContentAdapterClass(Context context, List<Workout> list) {
        this.context= context;
        this.list = list;
    }

    @Override
    public myContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.content_view, parent,false);
        return new myContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((myContentViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myContentViewHolder extends RecyclerView.ViewHolder{
        public TextView name ;
        public pl.droidsonroids.gif.GifImageView image;
        public TextView description;
        public TextView time;

        public myContentViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.workout_name);
            image =(pl.droidsonroids.gif.GifImageView)itemView.findViewById(R.id.workout_image);
            time=(TextView)itemView.findViewById(R.id.workout_time);
        }

        public void bindView(int position){
            Workout w= list.get(position);
            name.setText(w.getName());
            String img=w.getImage();
            int res = context.getResources().getIdentifier(img, "drawable", context.getPackageName());
            image.setImageResource(res);
            time.setText(w.getTime());
        }
    }
}
