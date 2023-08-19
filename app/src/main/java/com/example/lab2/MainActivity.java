package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button ba, bs, bm, bd;
    Button be, bc, bdt;

    EditText tres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.button_zero);
        b0.setOnClickListener(this);

        b1 = (Button) findViewById(R.id.button_one);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.button_two);
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.button_three);
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.button_four);
        b4.setOnClickListener(this);

        b5 = (Button) findViewById(R.id.button_five);
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.button_six);
        b6.setOnClickListener(this);

        b7 = (Button) findViewById(R.id.button_seven);
        b7.setOnClickListener(this);

        b8 = (Button) findViewById(R.id.button_eight);
        b8.setOnClickListener(this);

        b9 = (Button) findViewById(R.id.button_nine);
        b9.setOnClickListener(this);

        ba = (Button) findViewById(R.id.button_add);
        ba.setOnClickListener(this);

        bm = (Button) findViewById(R.id.button_mul);
        bm.setOnClickListener(this);

        bs = (Button) findViewById(R.id.button_sub);
        bs.setOnClickListener(this);

        bd = (Button) findViewById(R.id.button_div);
        bd.setOnClickListener(this);

        be = (Button) findViewById(R.id.button_eql);
        be.setOnClickListener(this);

        bc = (Button) findViewById(R.id.button_clear);
        bc.setOnClickListener(this);

        bdt = (Button) findViewById(R.id.button_dot);
        bdt.setOnClickListener(this);

        tres = (EditText) findViewById(R.id.txt_input);
        tres.setText("");
    }

    @Override
    public void onClick(View v) {
        if (v.equals(b0))
            tres.append("0");

        if (v.equals(b1))
            tres.append("1");

        if (v.equals(b2))
            tres.append("2");

        if (v.equals(b3))
            tres.append("3");

        if (v.equals(b4))
            tres.append("4");

        if (v.equals(b5))
            tres.append("5");

        if (v.equals(b6))
            tres.append("6");

        if (v.equals(b7))
            tres.append("7");

        if (v.equals(b8))
            tres.append("8");

        if (v.equals(b9))
            tres.append("9");

        if (v.equals(ba))
            tres.append("+");

        if (v.equals(bm))
            tres.append("*");

        if (v.equals(bs))
            tres.append("-");

        if (v.equals(bd))
            tres.append("/");

        if (v.equals(bdt))
            tres.append(".");

        if (v.equals(bc))
            tres.setText("");

        if (v.equals(be)) {
            try {
                String data = tres.getText().toString();
                if (data.contains("/")) {
                    String[] oprands = data.split("/");
                    if (oprands.length == 2) {
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1 / op2;
                        tres.setText(String.valueOf(result));

                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }

                if (data.contains("+")) {
                    String[] oprands = data.split("\\+");
                    if (oprands.length == 2) {
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1 + op2;
                        tres.setText(String.valueOf(result));

                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }

                if (data.contains("*")) {
                    String[] oprands = data.split("\\*");
                    if (oprands.length == 2) {
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1 * op2;
                        tres.setText(String.valueOf(result));

                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }

                if (data.contains("-")) {
                    String[] oprands = data.split("-");
                    if (oprands.length == 2) {
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1 - op2;
                        tres.setText(String.valueOf(result));

                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    }
                }
            } catch (NumberFormatException e) {
                Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
            }

        }

    }
}
