package com.example.specialdelights;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickBrownie(View view){
        CheckBox caramelCheckbox = (CheckBox) findViewById(R.id.caramel_brownie);
        CheckBox fudgeCheckbox= (CheckBox) findViewById(R.id.fudge_brownie);
        CheckBox cheesecakeCheckbox= (CheckBox) findViewById(R.id.cheesecake_brownie);
        if (caramelCheckbox.getVisibility() == View.VISIBLE) {
            caramelCheckbox.setVisibility(View.GONE);
            fudgeCheckbox.setVisibility(View.GONE);
            cheesecakeCheckbox.setVisibility(View.GONE);
        } else {
            caramelCheckbox.setVisibility(View.VISIBLE);
            fudgeCheckbox.setVisibility(View.VISIBLE);
            cheesecakeCheckbox.setVisibility(View.VISIBLE);
        }
    }

    public void onClickLollipop(View view){
        CheckBox watermelonCheckbox = (CheckBox) findViewById(R.id.watermelon_lolli);
        CheckBox berryCheckbox= (CheckBox) findViewById(R.id.berry_lolli);
        CheckBox pineappleCheckbox= (CheckBox) findViewById(R.id.pineappple_lolli);
        if (watermelonCheckbox.getVisibility() == View.VISIBLE) {
            watermelonCheckbox.setVisibility(View.GONE);
            berryCheckbox.setVisibility(View.GONE);
            pineappleCheckbox.setVisibility(View.GONE);
        } else {
            watermelonCheckbox.setVisibility(View.VISIBLE);
            berryCheckbox.setVisibility(View.VISIBLE);
            pineappleCheckbox.setVisibility(View.VISIBLE);
        }
    }

    public void onClickGelato(View view){
        CheckBox chocoNutCheckbox = (CheckBox) findViewById(R.id.chocoNut_cream);
        CheckBox oreoCheckbox= (CheckBox) findViewById(R.id.oreo_cream);
        CheckBox vanillaCheckbox= (CheckBox) findViewById(R.id.vanilla_cream);
        if (chocoNutCheckbox.getVisibility() == View.VISIBLE) {
            chocoNutCheckbox.setVisibility(View.GONE);
            oreoCheckbox.setVisibility(View.GONE);
            vanillaCheckbox.setVisibility(View.GONE);
        } else {
            chocoNutCheckbox.setVisibility(View.VISIBLE);
            oreoCheckbox.setVisibility(View.VISIBLE);
            vanillaCheckbox.setVisibility(View.VISIBLE);
        }
    }


}