package com.example.worldclock;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout sydney = findViewById(R.id.place1);
        TextView sydneyText = sydney.findViewById(R.id.city);
        sydneyText.setText(R.string.sydney);
        ImageView sydneyPic = sydney.findViewById(R.id.pic);
        sydneyPic.setImageResource(R.drawable.sydney);
        TextClock sydTime = sydney.findViewById(R.id.time);
        sydTime.setTimeZone("Australia/Sydney");

        ConstraintLayout la = findViewById(R.id.place2);
        TextView laText = la.findViewById(R.id.city);
        laText.setText(R.string.la);
        ImageView laPic = la.findViewById(R.id.pic);
        laPic.setImageResource(R.drawable.la);
        TextClock laTime = la.findViewById(R.id.time);
        laTime.setTimeZone("America/Los_Angeles");

        ConstraintLayout ny = findViewById(R.id.place3);
        TextView nyText = ny.findViewById(R.id.city);
        nyText.setText(R.string.ny);
        ImageView nyPic = ny.findViewById(R.id.pic);
        nyPic.setImageResource(R.drawable.ny);
        TextClock nyTime = ny.findViewById(R.id.time);
        nyTime.setTimeZone("America/New_York");

        ConstraintLayout dublin = findViewById(R.id.place4);
        TextView dublinText = dublin.findViewById(R.id.city);
        dublinText.setText(R.string.dublin);
        ImageView dublinPic = dublin.findViewById(R.id.pic);
        dublinPic.setImageResource(R.drawable.dublin);
        TextClock dublinTime = dublin.findViewById(R.id.time);
        dublinTime.setTimeZone("Europe/Dublin");

        ConstraintLayout dallas = findViewById(R.id.place5);
        TextView dallasText = dallas.findViewById(R.id.city);
        dallasText.setText(R.string.dallas);
        ImageView dallasPic = dallas.findViewById(R.id.pic);
        dallasPic.setImageResource(R.drawable.dallas);
        TextClock dallasTime = dallas.findViewById(R.id.time);
        dallasTime.setTimeZone("US/Central");



    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void twentyFour(View view) {
        ConstraintLayout sydney = findViewById(R.id.place1);
        TextClock sydTime = sydney.findViewById(R.id.time);
        sydTime.setFormat12Hour("k:mm");

        ConstraintLayout la = findViewById(R.id.place2);
        TextClock laTime = la.findViewById(R.id.time);
        laTime.setFormat12Hour("k:mm");

        ConstraintLayout ny = findViewById(R.id.place3);
        TextClock nyTime = ny.findViewById(R.id.time);
        nyTime.setFormat12Hour("k:mm");

        ConstraintLayout dublin = findViewById(R.id.place4);
        TextClock dublinTime = dublin.findViewById(R.id.time);
        dublinTime.setFormat12Hour("k:mm");

        ConstraintLayout dallas = findViewById(R.id.place5);
        TextClock dallasTime = dallas.findViewById(R.id.time);
        dallasTime.setFormat12Hour("k:mm");
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void twelve(View view) {
        ConstraintLayout sydney = findViewById(R.id.place1);
        TextClock sydTime = sydney.findViewById(R.id.time);
        sydTime.setFormat12Hour("h:mm a");

        ConstraintLayout la = findViewById(R.id.place2);
        TextClock laTime = la.findViewById(R.id.time);
        laTime.setFormat12Hour("h:mm a");

        ConstraintLayout ny = findViewById(R.id.place3);
        TextClock nyTime = ny.findViewById(R.id.time);
        nyTime.setFormat12Hour("h:mm a");

        ConstraintLayout dublin = findViewById(R.id.place4);
        TextClock dublinTime = dublin.findViewById(R.id.time);
        dublinTime.setFormat12Hour("h:mm a");

        ConstraintLayout dallas = findViewById(R.id.place5);
        TextClock dallasTime = dallas.findViewById(R.id.time);
        dallasTime.setFormat12Hour("h:mm a");

    }


}
//calender format gettimezone
