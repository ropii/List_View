package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Cookie> cookiesArLs= new ArrayList<>();
    ListView lvCookie;
    CookieAdapter cookieAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCookie = findViewById(R.id.lvCookiee);


        createArLs();
        createAdapter();

    }
    public void createAdapter(){

        cookieAdapter=new CookieAdapter(this,0,0, cookiesArLs);
        lvCookie.setAdapter(cookieAdapter);
    }

    public void createArLs(){
         cookiesArLs.add(new Cookie("1","0",R.drawable.cookie));
        cookiesArLs.add(new Cookie("2","10",R.drawable.red));
        cookiesArLs.add(new Cookie("3","20",R.drawable.black));
        cookiesArLs.add(new Cookie("4","30",R.drawable.blue));
        cookiesArLs.add(new Cookie("5","40",R.drawable.purple));
        cookiesArLs.add(new Cookie("6","99999",R.drawable.colors));

        cookiesArLs.add(new Cookie("will be added soon","",R.drawable.error));
        cookiesArLs.add(new Cookie("will be added soon","",R.drawable.error));
        cookiesArLs.add(new Cookie("will be added soon","",R.drawable.error));
        cookiesArLs.add(new Cookie("will be added soon","",R.drawable.error));
        cookiesArLs.add(new Cookie("will be added soon","",R.drawable.error));
        cookiesArLs.add(new Cookie("will be added soon","",R.drawable.error));

    }
}