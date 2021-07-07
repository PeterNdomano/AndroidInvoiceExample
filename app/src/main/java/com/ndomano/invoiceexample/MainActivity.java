package com.ndomano.invoiceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ndomano.invoiceexample.R;

public class MainActivity extends AppCompatActivity {
    //item spinners
    Spinner row1Item;
    Spinner row2Item;
    Spinner row3Item;

    //qty edittexts
    EditText row1Qty;
    EditText row2Qty;
    EditText row3Qty;

    //rate edittexts
    EditText row1Rate;
    EditText row2Rate;
    EditText row3Rate;

    //totals
    TextView row1Total;
    TextView row2Total;
    TextView row3Total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize spinners
        row1Item = (Spinner) findViewById(R.id.row1Item);
        row2Item = (Spinner) findViewById(R.id.row2Item);
        row3Item = (Spinner) findViewById(R.id.row3Item);

        //initialize qty edittexts
        row1Qty = (EditText) findViewById(R.id.row1Qty);
        row2Qty = (EditText) findViewById(R.id.row2Qty);
        row3Qty = (EditText) findViewById(R.id.row3Qty);

        //initialize rate editexts
        row1Rate = (EditText) findViewById(R.id.row1Rate);
        row2Rate = (EditText) findViewById(R.id.row2Rate);
        row3Rate = (EditText) findViewById(R.id.row3Rate);

        //initialize totals
        row1Total = (TextView) findViewById(R.id.row1Total);
        row2Total = (TextView) findViewById(R.id.row2Total);
        row3Total = (TextView) findViewById(R.id.row3Total);

        //setup onTextCange listener to all edittexts
        row1Rate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //..not useful here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here our concern is
                textChangeListener();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        row2Rate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //..not useful here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here our concern is
                textChangeListener();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        row3Rate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //..not useful here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here our concern is
                textChangeListener();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        row1Qty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //..not useful here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here our concern is
                textChangeListener();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        row2Qty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //..not useful here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here our concern is
                textChangeListener();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        row3Qty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //..not useful here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //here our concern is
                textChangeListener();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void handleTotal1(){
        //check if field have something written on
        if(row1Rate.getText().toString().trim().length() > 0 && row1Qty.getText().toString().trim().length() > 0){
            //then get total for the first row
            int total = Integer.parseInt(row1Rate.getText().toString()) * Integer.parseInt(row1Qty.getText().toString());
            row1Total.setText(String.valueOf(total));
        }
        else{
            //Toast.makeText(this, "Please write something on row 1", Toast.LENGTH_SHORT).show();
        }

    }

    public void handleTotal2(){
        //check if field have something written on
        if(row2Rate.getText().toString().trim().length() > 0 && row2Qty.getText().toString().trim().length() > 0){
            //then get total for the first row
            int total = Integer.parseInt(row2Rate.getText().toString()) * Integer.parseInt(row2Qty.getText().toString());
            row2Total.setText(String.valueOf(total));
        }
        else{
            //Toast.makeText(this, "Please write something on row 2", Toast.LENGTH_SHORT).show();
        }

    }

    public void handleTotal3(){
        //check if field have something written on
        if(row3Rate.getText().toString().trim().length() > 0 && row3Qty.getText().toString().trim().length() > 0){
            //then get total for the first row
            int total = Integer.parseInt(row3Rate.getText().toString()) * Integer.parseInt(row3Qty.getText().toString());
            row3Total.setText(String.valueOf(total));
        }
        else{
            //Toast.makeText(this, "Please write something on row 3", Toast.LENGTH_SHORT).show();
        }

    }

    public void handelMainTotal(){
        //this handles the main total
        int total = 0;
        total = Integer.parseInt(row1Total.getText().toString()) + Integer.parseInt(row2Total.getText().toString()) + Integer.parseInt(row3Total.getText().toString());
        ((TextView) findViewById(R.id.mainTotal)).setText("MAIN TOTAL: "+String.valueOf(total));
    }

    public void textChangeListener(){
        //call all handles here, and voilla! you are done
        handleTotal1();
        handleTotal2();
        handleTotal3();
        handelMainTotal();
    }
}