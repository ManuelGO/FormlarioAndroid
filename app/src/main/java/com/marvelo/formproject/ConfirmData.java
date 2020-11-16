package com.marvelo.formproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmData extends AppCompatActivity {

    private TextView txtName;
    private TextView txtPhone;
    private TextView txtEmail;
    private TextView txtDesc;
    private TextView txtDOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_data);

        Bundle params = getIntent().getExtras();
        String name = params.getString(getResources().getString(R.string.NAME));
        String phone = params.getString(getResources().getString(R.string.PHONE));
        String email = params.getString(getResources().getString(R.string.EMAIL));
        String description = params.getString(getResources().getString(R.string.DESCRIPTION));
        String dob = params.getString(getResources().getString(R.string.DOB));

        txtName    = (TextView) findViewById(R.id.txtName);
        txtPhone   = (TextView) findViewById(R.id.txtPhone);
        txtEmail   = (TextView) findViewById(R.id.txtMail);
        txtDesc   = (TextView) findViewById(R.id.txtDesc);
        txtDOB  = (TextView) findViewById(R.id.txtDOB);

        txtName.setText(name);
        txtPhone.setText(phone);
        txtEmail.setText(email);
        txtDesc.setText(description);
        txtDOB.setText(dob);
    }

    public void goBack(View view) {
        super.onBackPressed();
    }

}