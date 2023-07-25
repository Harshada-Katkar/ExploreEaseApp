package com.sveri.exploreease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {


    EditText etName, etAge, etAddress, etEmail, etPwd;
    Button btnSignUp;
    CheckBox checkBox;

    FirebaseAuth eAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initializers();
        eAuth = FirebaseAuth.getInstance();


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registeruser();
            }
        });
    }

    protected void initializers() {

        etName = findViewById(R.id.editTextName);
        etAge = findViewById(R.id.editTextAge);
        etAddress = findViewById(R.id.editTextAddress);
        etEmail = findViewById(R.id.editTextEmail);
        etPwd = findViewById(R.id.editTextPassword);
        checkBox = findViewById(R.id.checkBoxTandC);
        btnSignUp = findViewById(R.id.buttonSignup);

    }

    public void registeruser(){
        String name = etName.getText().toString().trim();
        String age = etAge.getText().toString().trim();
        String Addr = etAddress.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String pwd = etPwd.getText().toString().trim();

        if (name.isEmpty()){
            etName.setError("Name cannot be empty");
            return;
        }
        if (age.isEmpty()){
            etAge.setError("Age cannot be empty");
            return;
        }
        if (Addr.isEmpty()){
            etAddress.setError("Address cannot be empty");
            return;
        }
        if (email.isEmpty()){
            etEmail.setError("Email cannot be empty");
            return;
        }
        if (pwd.isEmpty()){
            etPwd.setError("Password cannot be empty");
            return;
        }
        eAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    startActivity(new Intent(SignupActivity.this, OptionActivity.class));
                }else{
                    Toast.makeText(SignupActivity.this, "Sign up Failed", Toast.LENGTH_SHORT).show();

                }
                etEmail.setText(null);
                etPwd.setText(null);
                etName.setText(null);
                etAge.setText(null);
                etAddress.setText(null);
                etPwd.requestFocus();

            }
        });
    }

}