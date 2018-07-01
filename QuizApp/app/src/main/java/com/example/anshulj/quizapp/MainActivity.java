package com.example.anshulj.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0,r1=0,r2=0;
    String detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitQuiz(View view) {

        EditText namefield = (EditText) findViewById(R.id.name_field);
        String name = namefield.getText().toString();
        EditText contactfield = (EditText) findViewById(R.id.contact_field);
        String contact = contactfield.getText().toString();
        EditText textfield1 = (EditText) findViewById(R.id.text_field1);
        String text1 = textfield1.getText().toString();
        CheckBox chkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        boolean checkbox1 = chkbox1.isChecked();

        CheckBox chkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        boolean checkbox2 = chkbox2.isChecked();
        if (text1.equals("viewGroup")) {
            score++;
        }


        if (checkbox1 == true && checkbox2 == true) {
            score++;
        }

        EditText captchafield = (EditText) findViewById(R.id.captcha_field);
        String captfield = captchafield.getText().toString();
        if (captfield.equals("smwm")) {
            score++;
        }
        if (r1>0){
            score++;
        }
        if(r2>0){
            score++;
        }
        Context context = getApplicationContext();
        CharSequence text = "You Scored " + score + "!!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        TextView details = (TextView) findViewById(R.id.details);
        detail="Name : " + name + "\nContact No. : " + contact;
        details.setText(detail);
        score=0;

    }

    public void r1Clicked(View view) {
        boolean r1checked = ((RadioButton) view).isChecked();
        if (view.getId() == R.id.radiobutton2) {
            r1++;
        }
        else {
            r1=0;
        }
    }

    public void r2Clicked(View view) {
        boolean r2checked = ((RadioButton) view).isChecked();
        if (view.getId() == R.id.radiobutton24) {
            r2++;
        }
        else {
            r2=0;
        }
    }
}

