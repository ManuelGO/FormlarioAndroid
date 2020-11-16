package com.marvelo.formproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private DatePicker datePicker;
    private EditText phone;
    private EditText description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name        = (EditText) findViewById(R.id.fullName);
        email       = (EditText) findViewById(R.id.email);
        datePicker  = (DatePicker) findViewById(R.id.datePicker1);
        phone       = (EditText) findViewById(R.id.phone);
        description = (EditText) findViewById(R.id.description);
    }

    public void goToConfirm(View view) {
        Intent intent = new Intent(MainActivity.this, ConfirmData.class);

        intent.putExtra(getResources().getString(R.string.NAME), name.getText().toString());
        intent.putExtra(getResources().getString(R.string.EMAIL), email.getText().toString());
        intent.putExtra(getResources().getString(R.string.DOB), datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear());
        intent.putExtra(getResources().getString(R.string.DESCRIPTION), description.getText().toString());
        intent.putExtra(getResources().getString(R.string.PHONE), phone.getText().toString());

        startActivity(intent);
    }
}