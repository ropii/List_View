package com.example.listview;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class CookieAdapter extends ArrayAdapter<Cookie> {

    Context context;
    List<Cookie> objects;
    public CookieAdapter(Context context, int resource, int textViewResourceId, List<Cookie> objects){
        super(context, resource, textViewResourceId, objects);
        this.context=context;
        this.objects=objects;
    }





}
