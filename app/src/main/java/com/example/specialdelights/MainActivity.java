package com.example.specialdelights;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Switch;

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

    //Checkbox Code
    public void onCheckboxClickedBrownie(View view){
        CheckBox caramelCheckbox = (CheckBox) findViewById(R.id.caramel_brownie);
        CheckBox fudgeCheckbox= (CheckBox) findViewById(R.id.fudge_brownie);
        CheckBox cheesecakeCheckbox= (CheckBox) findViewById(R.id.cheesecake_brownie);

        Switch caramelSwitch = (Switch) findViewById(R.id.caramel_switch);
        Switch fudgeSwitch = (Switch) findViewById(R.id.fudge_switch);
        Switch cheesecakeSwitch = (Switch) findViewById(R.id.cheesecake_switch);

        boolean checked1 = caramelCheckbox.isChecked();
        boolean checked2 = fudgeCheckbox.isChecked();
        boolean checked3 = cheesecakeCheckbox.isChecked();

        if (checked1)
            caramelSwitch.setVisibility(View.VISIBLE);
        else
            caramelSwitch.setVisibility(View.GONE);

        if (checked2)
            fudgeSwitch.setVisibility(View.VISIBLE);
        else
            fudgeSwitch.setVisibility(View.GONE);

        if (checked3)
            cheesecakeSwitch.setVisibility(View.VISIBLE);
        else
            cheesecakeSwitch.setVisibility(View.GONE);

    }

    public void onCheckboxClickedGelato(View view){
        CheckBox chocoNutCheckbox = (CheckBox) findViewById(R.id.chocoNut_cream);
        CheckBox oreoCheckbox= (CheckBox) findViewById(R.id.oreo_cream);
        CheckBox vanillaCheckbox= (CheckBox) findViewById(R.id.vanilla_cream);

        Switch chocoNutSwitch = (Switch) findViewById(R.id.chocoNut_switch);
        Switch oreoSwitch = (Switch) findViewById(R.id.oreo_switch);
        Switch vanillaSwitch = (Switch) findViewById(R.id.vanillaP_switch);

        boolean checked1 = chocoNutCheckbox.isChecked();
        boolean checked2 = oreoCheckbox.isChecked();
        boolean checked3 = vanillaCheckbox.isChecked();

        if (checked1)
            chocoNutSwitch.setVisibility(View.VISIBLE);
        else
            chocoNutSwitch.setVisibility(View.GONE);

        if (checked2)
            oreoSwitch.setVisibility(View.VISIBLE);
        else
            oreoSwitch.setVisibility(View.GONE);

        if (checked3)
            vanillaSwitch.setVisibility(View.VISIBLE);
        else
            vanillaSwitch.setVisibility(View.GONE);

    }

    //Switch Code
    public void onSwitchClickedCaramel(View view){
        RadioGroup caramelRadio = (RadioGroup) findViewById(R.id.caramel_radioGp);
        boolean on = ((Switch) view).isChecked();

        if (on)
            caramelRadio.setVisibility(View.VISIBLE);
        else
            caramelRadio.setVisibility(View.GONE);

    }

    public void onSwitchClickedFudge(View view){
        RadioGroup fudgeRadio = (RadioGroup) findViewById(R.id.fudge_radioGp);
        boolean on = ((Switch) view).isChecked();

        if (on)
            fudgeRadio.setVisibility(View.VISIBLE);
        else
            fudgeRadio.setVisibility(View.GONE);

    }

    public void onSwitchClickedCheesecake(View view){
        RadioGroup cheesecakeRadio = (RadioGroup) findViewById(R.id.cheesecake_radioGp);
        boolean on = ((Switch) view).isChecked();

        if (on)
            cheesecakeRadio.setVisibility(View.VISIBLE);
        else
            cheesecakeRadio.setVisibility(View.GONE);

    }

    public void onSwitchClickedChocoNut(View view){
        RadioGroup chocoNutRadio = (RadioGroup) findViewById(R.id.chocoNut_radioGp);
        boolean on = ((Switch) view).isChecked();

        if (on)
            chocoNutRadio.setVisibility(View.VISIBLE);
        else
            chocoNutRadio.setVisibility(View.GONE);

    }

    public void onSwitchClickedOreo(View view){
        RadioGroup oreoRadio = (RadioGroup) findViewById(R.id.oreo_radioGp);
        boolean on = ((Switch) view).isChecked();

        if (on)
            oreoRadio.setVisibility(View.VISIBLE);
        else
            oreoRadio.setVisibility(View.GONE);

    }

    public void onSwitchClickedVanillaP(View view){
        RadioGroup vanillaRadio = (RadioGroup) findViewById(R.id.vanilla_radioGp);
        boolean on = ((Switch) view).isChecked();

        if (on)
            vanillaRadio.setVisibility(View.VISIBLE);
        else
            vanillaRadio.setVisibility(View.GONE);

    }

}