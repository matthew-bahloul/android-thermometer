 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

 public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView description;
    EditText input;
    TextView results;
    Button convert;
    DecimalFormat format;

    float temp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        description = findViewById(R.id.description);
        input = findViewById(R.id.input);
        results = findViewById(R.id.results);
        convert = findViewById(R.id.convert);

        results.setVisibility(View.GONE);

        format = new DecimalFormat("#0.00");

        convert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (input.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double temp = Double.parseDouble(input.getText().toString().trim()) / 3.0 + 4.0;

                    results.setText("The approximate temperature outise is " + format.format(temp) + " degrees Celsius");

                    results.setVisibility(View.VISIBLE);
                }
            }
        }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
