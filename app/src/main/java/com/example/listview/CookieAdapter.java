package com.example.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CookieAdapter extends ArrayAdapter<Cookie> {

    Context context;
    List<Cookie> objects;
    public CookieAdapter(Context context, int resource, int textViewResourceId, List<Cookie> objects){
        super(context, resource, textViewResourceId, objects);
        this.context=context;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.activity_lisr_view_row_layout,parent,false);

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        ImageView ivCookie=view.findViewById(R.id.ivCookie);
        Cookie temp = objects.get(position);

        ivCookie.setImageResource(temp.getImageId());
        tvPrice.setText(String.valueOf(temp.getPrice()));
        tvName.setText(temp.getName());



        return view;
    }



}
