package com.example.jawadkhan.healthandfitness;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;

/**
 * Created by Jawad Khan on 6/23/2018.
 */

public class popUp extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");
        if(id == 1)
            setContentView(R.layout.activity_popup);
        else if(id == 2)
            setContentView(R.layout.activity_contact_us);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        getWindow().setLayout((int)(width * .8),(int) (height * .6));
    }
}
