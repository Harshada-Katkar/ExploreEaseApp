package com.sveri.exploreease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText etMail,etPwd;
    Button btnLogIn;

    FirebaseAuth eAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etMail = findViewById(R.id.editTextMail);
        etPwd = findViewById(R.id.editTextPwd);
        btnLogIn = findViewById(R.id.buttonLogIn);

        eAuth = FirebaseAuth.getInstance();

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerNewUser();
            }
        });

    }

    public void registerNewUser() {

        String email = etMail.getText().toString().trim();
        String pwd = etPwd.getText().toString().trim();

        if (email.isEmpty()) {
            etMail.setError("Email cannot be Empty");
            return;
        }
        if (pwd.isEmpty()) {
            etPwd.setError("Password cannot be Empty");
            return;
        }


        eAuth.signInWithEmailAndPassword(email, pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {

                    Toast.makeText(LoginActivity.this, "Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, OptionActivity.class));

                } else {
                    Toast.makeText(LoginActivity.this, " Failed", Toast.LENGTH_SHORT).show();

                }
                etMail.setText(null);
                etPwd.setText(null);
                etPwd.requestFocus();

            }
        });
    }

}
