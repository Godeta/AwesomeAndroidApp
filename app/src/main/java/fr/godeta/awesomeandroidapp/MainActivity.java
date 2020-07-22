package fr.godeta.awesomeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button weather, map, calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.weather = findViewById(R.id.weather);
        this.calc = findViewById(R.id.calc);
        this.map = findViewById(R.id.map);

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Weather.class);
                startActivity(otherActivity);
                finish();
            }
        });

        map.setOnClickListener( (v) -> {
            Intent otherActivity = new Intent(getApplicationContext(),MapsActivity.class);
            startActivity(otherActivity);
            finish();
        });
    }
}
