package com.spreadinghands.manavtasanrakshan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.trash1, "Have some hope"));
        models.add(new Model(R.drawable.thetransformingearth, "Have some hope"));
        models.add(new Model(R.drawable.educationforeveryone, "Have some hope"));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPagerSlides);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);
    }
}
