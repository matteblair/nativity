package com.mapzen.nativity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mapzen.nativelibrary.Cuber;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("nativity");
    }

    public native int square(int number);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int square = square(4);
        int cube = Cuber.cube(4);

        String text = "";
        text += "Square: " + String.valueOf(square) + "\n";
        text += "Cube: " + String.valueOf(cube) + "\n";

        TextView textView = (TextView)findViewById(R.id.text_view);
        textView.setText(text);
    }

}
