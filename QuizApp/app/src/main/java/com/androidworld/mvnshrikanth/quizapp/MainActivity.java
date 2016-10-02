package com.androidworld.mvnshrikanth.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSubmit(View view) {

        int score = 0;
        Toast toast;

        RadioButton radioButtonAns1 = (RadioButton) findViewById(R.id.radio_qst1_opt3);
        RadioButton radioButtonAns2 = (RadioButton) findViewById(R.id.radio_qst2_opt1);
        RadioButton radioButtonAns3 = (RadioButton) findViewById(R.id.radio_qst3_opt2);
        RadioButton radioButtonAns4 = (RadioButton) findViewById(R.id.radio_qst4_opt4);
        RadioButton radioButtonAns5 = (RadioButton) findViewById(R.id.radio_qst5_opt3);

        CheckBox checkBoxAns6Opt1 = (CheckBox) findViewById(R.id.chk_qst6_opt1);
        CheckBox checkBoxAns6Opt2 = (CheckBox) findViewById(R.id.chk_qst6_opt2);
        CheckBox checkBoxAns6Opt3 = (CheckBox) findViewById(R.id.chk_qst6_opt3);
        CheckBox checkBoxAns6Opt4 = (CheckBox) findViewById(R.id.chk_qst6_opt4);
        CheckBox checkBoxAns6Opt5 = (CheckBox) findViewById(R.id.chk_qst6_opt5);

        if (radioButtonAns1.isChecked()) {
            score++;
        }
        if (radioButtonAns2.isChecked()) {
            score++;
        }
        if (radioButtonAns3.isChecked()) {
            score++;
        }
        if (radioButtonAns4.isChecked()) {
            score++;
        }
        if (radioButtonAns5.isChecked()) {
            score++;
        }

        if (checkBoxAns6Opt5.isChecked()) {
            score++;
            checkBoxAns6Opt1.setChecked(true);
            checkBoxAns6Opt2.setChecked(true);
            checkBoxAns6Opt3.setChecked(true);
            checkBoxAns6Opt4.setChecked(true);

        } else if (checkBoxAns6Opt1.isChecked() && checkBoxAns6Opt2.isChecked() && checkBoxAns6Opt3.isChecked() && checkBoxAns6Opt4.isChecked() && !checkBoxAns6Opt5.isChecked()) {
            score++;
            checkBoxAns6Opt1.setChecked(true);
            checkBoxAns6Opt2.setChecked(true);
            checkBoxAns6Opt3.setChecked(true);
            checkBoxAns6Opt4.setChecked(true);
            checkBoxAns6Opt5.setChecked(true);
        }

        radioButtonAns1.setTextColor(getResources().getColor(R.color.colorAns));
        radioButtonAns2.setTextColor(getResources().getColor(R.color.colorAns));
        radioButtonAns3.setTextColor(getResources().getColor(R.color.colorAns));
        radioButtonAns4.setTextColor(getResources().getColor(R.color.colorAns));
        radioButtonAns5.setTextColor(getResources().getColor(R.color.colorAns));

        checkBoxAns6Opt1.setTextColor(getResources().getColor(R.color.colorAns));
        checkBoxAns6Opt2.setTextColor(getResources().getColor(R.color.colorAns));
        checkBoxAns6Opt3.setTextColor(getResources().getColor(R.color.colorAns));
        checkBoxAns6Opt4.setTextColor(getResources().getColor(R.color.colorAns));
        checkBoxAns6Opt5.setTextColor(getResources().getColor(R.color.colorAns));

        Toast.makeText(getApplicationContext(), "You scored " + score + "\nRight answers are highlighted in green.", Toast.LENGTH_SHORT).show();
    }


    public void chkAll(View view) {
        CheckBox checkBoxAns6Opt1 = (CheckBox) findViewById(R.id.chk_qst6_opt1);
        CheckBox checkBoxAns6Opt2 = (CheckBox) findViewById(R.id.chk_qst6_opt2);
        CheckBox checkBoxAns6Opt3 = (CheckBox) findViewById(R.id.chk_qst6_opt3);
        CheckBox checkBoxAns6Opt4 = (CheckBox) findViewById(R.id.chk_qst6_opt4);
        CheckBox checkBoxAns6Opt5 = (CheckBox) findViewById(R.id.chk_qst6_opt5);

        if (checkBoxAns6Opt5.isChecked()) {
            checkBoxAns6Opt1.setChecked(true);
            checkBoxAns6Opt2.setChecked(true);
            checkBoxAns6Opt3.setChecked(true);
            checkBoxAns6Opt4.setChecked(true);
        } else {
            checkBoxAns6Opt1.setChecked(false);
            checkBoxAns6Opt2.setChecked(false);
            checkBoxAns6Opt3.setChecked(false);
            checkBoxAns6Opt4.setChecked(false);
        }
    }
}
