package com.example.activity.chapter07_layout_java;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout;
        mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        // TextView
        TextView tv;
        tv = new TextView(this);
        tv.setText("Hello World Android!");
        tv.setTextColor(Color.GREEN);
        tv.setTextSize(20);
        tv.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        // Button
        Button btn;
        btn = new Button(this);
        btn.setText("Click me!");
        btn.setBackgroundColor(Color.YELLOW);

        mainLayout.addView(tv);
        mainLayout.addView(btn);

        LinearLayout.LayoutParams tvParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tv.setLayoutParams(tvParams);

        LinearLayout.LayoutParams btnLayourparams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btn.setLayoutParams(btnLayourparams);

        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        this.setContentView(mainLayout);



    }
}
