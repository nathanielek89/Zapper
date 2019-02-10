package com.Zapper.rating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import com.Zapper.rating.MainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendMessage (View view){
        //Toast.makeText(getActivity(), "Button Clicked", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "No one is nearby", Toast.LENGTH_LONG).show();
    }
}
