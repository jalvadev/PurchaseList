package com.jnoma.purchaselist.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jnoma.purchaselist.Helpers.RegisterHelper;
import com.jnoma.purchaselist.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Register extends AppCompatActivity {

    @BindView(R.id.et_username_register)
    EditText etUsername;
    @BindView(R.id.et_email_register)
    EditText etEmail;
    @BindView(R.id.et_passord_register)
    EditText etPass;
    @BindView(R.id.et_repeat_password)
    EditText erRepeatPass;
    @BindView(R.id.bt_register)
    Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);


        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte errorState;
                boolean everythingIsCorrect;

                //STEP 1: verifying that username is ok
                errorState = RegisterHelper.verifyUsername(etUsername.getText().toString());

                if(errorState == 1){
                    etUsername.setError(getString(R.string.em_username_correct));
                }else if(errorState == 2){
                    etUsername.setError(getString(R.string.em_username_used));
                }

                //STEP 2: verifying that email is ok

                //STEP 3: verifying that passwords is ok
            }
        });
    }

}
