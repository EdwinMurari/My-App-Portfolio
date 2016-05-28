package com.example.edwin.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launchPopularMovies(View view) {
        displayToast("This button will launch my popular movies app!");
    }

    public void launchStockHawk(View view) {
        displayToast("This button will launch my stockhawk app!");
    }

    public void launchBuilditBigger(View view) {
        displayToast("This button will launch my build it bigger!");
    }

    public void launchMakeitMaterial(View view) {
        displayToast("This button will launch my make your app material!");
    }

    public void launchGoUbiquitous(View view) {
        displayToast("This button will launch my go ubiquitous app!");
    }

    public void lanchCapstone(View view) {
        displayToast("This button will launch my capstone app!");
    }
}
