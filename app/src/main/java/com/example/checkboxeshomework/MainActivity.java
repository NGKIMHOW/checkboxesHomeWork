package com.example.checkboxeshomework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view){
        String message = "Topping : ";

        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.chocolate_syrup);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.sprinkles);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.crushed_nut);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.cherries);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.orio_cookies_crumbles);

        if (checkBox1.isChecked()){
            message += "Chocolate Syrup " + "";
        }
        if (checkBox2.isChecked()){
            message += "Sprinkles " + "";
        }
        if (checkBox3.isChecked()){
            message += "Crushed Nut " + "";
        }
        if (checkBox4.isChecked()){
            message += "Cherries " + "";
        }
        if (checkBox5.isChecked()){
            message += "Orio Cookies Crumbles " + "";
        }

        displayToast(message);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }

}