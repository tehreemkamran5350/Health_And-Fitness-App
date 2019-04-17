package disease_meal_plan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jawadkhan.healthandfitness.R;

/**
 * Created by Jawad Khan on 5/30/2018.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.diseases.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private Button btn;
        private ImageView img;

        public ListViewHolder(View itemView){
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.iv_healthyDiet);
            btn = (Button) itemView.findViewById(R.id.btn_healthyDiet);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            btn.setText(OurData.diseases[position]);
            btn.setId(OurData.id[position]);
            img.setImageResource(OurData.picture[position]);

        }
        @Override
        public void onClick(View v) {

        }
    }
}
