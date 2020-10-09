package com.vnat.textwatchercreditcardnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtCCN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCCN = findViewById(R.id.edtCCN);

        TextWatcher textWatcher = new CreditCardNumberTextWatcher(edtCCN);
        edtCCN.addTextChangedListener(textWatcher);
    }
}