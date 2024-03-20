package com.example.apka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int a;
    public int b;
    public boolean isFirstSet = false;
    public boolean isSecondSet = false;
    public int result;
    public int equasionType; //1=Addition,2=subtraction
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tekst = (TextView) findViewById(R.id.textView);
        TextView eqTypeTxt = (TextView) findViewById(R.id.equasionTypeText);
        tekst.setText("0");
//        First row

        Button przycisk1 = (Button) findViewById(R.id.button1);
        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("1");
                }else{
                    tekst.setText(tekst.getText()+"1");
                }
            }
        });

        Button przycisk2 = (Button) findViewById(R.id.button2);
        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("2");
                }else{
                    tekst.setText(tekst.getText()+"2");
                }
            }
        });

        Button przycisk3 = (Button) findViewById(R.id.button3);
        przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("3");
                }else{
                    tekst.setText(tekst.getText()+"3");
                }
            }
        });

        Button przyciskAdd = (Button) findViewById(R.id.buttonAdd);
        przyciskAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = String.valueOf(tekst.getText());
                if(isFirstSet==false) {
                    a = Integer.parseInt(temp);
                    tekst.setText("");
                    isFirstSet=true;
                }
                equasionType=1;
                eqTypeTxt.setText("+");
            }
        });

//        Second row

        Button przycisk4 = (Button) findViewById(R.id.button4);
        przycisk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("4");
                }else{
                    tekst.setText(tekst.getText()+"4");
                }
            }
        });

        Button przycisk5 = (Button) findViewById(R.id.button5);
        przycisk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("5");
                }else{
                    tekst.setText(tekst.getText()+"5");
                }
            }
        });

        Button przycisk6 = (Button) findViewById(R.id.button6);
        przycisk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("6");
                }else{
                    tekst.setText(tekst.getText()+"6");
                }
            }
        });

        Button przyciskSub = (Button) findViewById(R.id.buttonSub);
        przyciskSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = String.valueOf(tekst.getText());
                if(isFirstSet==false) {
                    a = Integer.parseInt(temp);
                    tekst.setText("");
                    isFirstSet = true;
                }
                equasionType=2;
                eqTypeTxt.setText("-");
            }
        });

//        Third row

        Button przycisk7 = (Button) findViewById(R.id.button7);
        przycisk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("7");
                }else{
                    tekst.setText(tekst.getText()+"7");
                }
            }
        });

        Button przycisk8 = (Button) findViewById(R.id.button8);
        przycisk8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("8");
                }else{
                    tekst.setText(tekst.getText()+"8");
                }
            }
        });

        Button przycisk9 = (Button) findViewById(R.id.button9);
        przycisk9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()=="0") {
                    tekst.setText("9");
                }else{
                    tekst.setText(tekst.getText()+"9");
                }
            }
        });

//        Fourth row

        Button przycisk0 = (Button) findViewById(R.id.button0);
        przycisk0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tekst.getText()!="0") {
                    tekst.setText(tekst.getText()+"0");
                }
            }
        });

        Button przyciskEQ = (Button) findViewById(R.id.buttonEQ);
        przyciskEQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = String.valueOf(tekst.getText());
                if(isFirstSet){
                    b = Integer.parseInt(temp);
                    isSecondSet = true;
                }
                if(isFirstSet && isSecondSet){
                    switch(equasionType){
                        case 1:
                            result=a+b;
                            tekst.setText(String.valueOf(result));
                            eqTypeTxt.setText("=");
                            a=0;
                            b=0;
                            isFirstSet=false;
                            isSecondSet=false;
                            break;
                        case 2:
                            result=a-b;
                            tekst.setText(String.valueOf(result));
                            eqTypeTxt.setText("=");
                            a=0;
                            b=0;
                            isFirstSet=false;
                            isSecondSet=false;
                            break;
                    }
                }

            }
        });

        Button przyciskAC = (Button) findViewById(R.id.buttonAC);
        przyciskAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tekst.setText("0");
                eqTypeTxt.setText("");
                isFirstSet=false;
                isSecondSet=false;
            }
        });
    }
}