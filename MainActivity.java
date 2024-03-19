package com.example.apka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tekst = (TextView) findViewById(R.id.textView);
        Button przycisk = (Button) findViewById(R.id.button);
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst.setText(przycisk.getText());
            }
        });
        Button przycisk2 = (Button) findViewById(R.id.button2);
        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst.setText(przycisk2.getText());
            }
        });
        Button przycisk3 = (Button) findViewById(R.id.button3);
        przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst.setText(przycisk3.getText());
            }
        });

    }
}