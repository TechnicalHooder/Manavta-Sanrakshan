package com.spreadinghands.manavtasanrakshan;

import android.content.Context;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.List;

public class Adapter extends PagerAdapter {

    private List<Model>models;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_items, container, false);

        ImageView imageView;
        TextView title;
//        Button button;

        imageView = view.findViewById(R.id.imageLayout);
        title = view.findViewById(R.id.title);
 //       button = view.findViewById(R.id.givebutton);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());
   //     button.setOnClickListener((View.OnClickListener) models.get(position).getButton());

        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
