package com.dhuli.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    Button i1, i2, i3, i4, i5, i6, i7, i8, i9, d_zero, zero, point, equal, plus, sub, multi, Division, ac;
    TextView number;
    int first_number,second_number;
    char ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        d_zero = findViewById(R.id.d_zero);
        zero = findViewById(R.id.zero);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        Division = findViewById(R.id.Division);
        ac = findViewById(R.id.ac);
        number = findViewById(R.id.number);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "1");
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "2");
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "3");
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "4");
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "5");
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "6");
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "7");
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "8");
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "9");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("");
            }
        });
        d_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "00");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + "0");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                number.setText(num + ".");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '+';
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '-';
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '*';
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '/';
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ope == '+') {
                    second_number = Integer.parseInt(number.getText().toString());
                    addition();
                }
                else if(ope == '-'){
                    second_number = Integer.parseInt(number.getText().toString());
                    sub();
                }
                else if(ope == '*'){
                    second_number = Integer.parseInt(number.getText().toString());
                    multiple();
                }
                else if(ope == '/'){
                    second_number = Integer.parseInt(number.getText().toString());
                    Division();
                }

            }
        });

    }

    void addition() {
        int sum = first_number + second_number;
        number.setText(" " + sum);
    }
    void sub() {
        int sum = first_number - second_number;
        number.setText(" " + sum);
    }
    void multiple() {
        int sum = first_number * second_number;
        number.setText(" " + sum);
    }
    void Division() {
        int sum = first_number / second_number;
        number.setText(" " + sum);
    }


}