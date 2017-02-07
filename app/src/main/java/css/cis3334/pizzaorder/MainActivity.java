// Created 2/6/17
// Created by Sara Desrocher

package css.cis3334.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTotal;
    CheckBox cbDelivery, cbXCheese;
    RadioButton rbSm, rbMed, rbLar;
    Button btnTotal;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTotal = (TextView) findViewById(R.id.TextViewTotal);
        cbDelivery = (CheckBox) findViewById(R.id.checkBoxDelivery);
        cbXCheese = (CheckBox) findViewById(R.id.checkBoxXCheese);
        rbSm = (RadioButton) findViewById(R.id.radioButton1);
        rbMed = (RadioButton) findViewById(R.id.radioButton2);
        rbLar = (RadioButton) findViewById(R.id.radioButton3);
        btnTotal = (Button) findViewById(R.id.buttonCalcTotal);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

    }

    public void onClickButton(View view) {
        Double total = 0.00;
        if (rbSm.isChecked()) {
            total = 7.00;
        } else if (rbMed.isChecked()) {
            total = 9.00;
        } else if (rbLar.isChecked()) {
            total = 13.00;
        }

        if (cbXCheese.isChecked()){
            total = total + 1.75;
        }else if (cbDelivery.isChecked()){
            total = total + 2.50;
        }


            String.format("Total is $%.2f", total);

    }
}