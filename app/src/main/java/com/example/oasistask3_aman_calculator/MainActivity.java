package com.example.oasistask3_aman_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonDivision;
    private Button buttonMul;
    private Button button10;
    private Button buttonC;
    private Button buttonEqual;


    private EditText edittext;

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        edittext = findViewById(R.id.edittext);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null) {
                    edittext.setText("");
                } else {
                    mValueOne = Float.parseFloat(edittext.getText() + "");
                    Addition = true;
                    edittext.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                mSubtract = true;
                edittext.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                Multiplication = true;
                edittext.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edittext.getText() + "");
                Division = true;
                edittext.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edittext.getText() + "");

                if (Addition == true) {
                    edittext.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (mSubtract == true) {
                    edittext.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (Multiplication == true) {
                    edittext.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    edittext.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edittext.setText(edittext.getText() + ".");
            }
        });
    }
}