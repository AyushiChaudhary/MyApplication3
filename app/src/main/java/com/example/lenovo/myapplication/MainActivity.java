package com.example.lenovo.myapplication;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.PatternMatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
private EditText Email;
private EditText Password;
private Button Login;
private TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText)findViewById(R.id.etemail);
        Password = (EditText)findViewById(R.id.etpassword);
        Register = (TextView) findViewById(R.id.textView5);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainActivity.this,SignupActivity.class));
            }
        });

        Login = (Button) findViewById(R.id.btnlogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=Email.getText().toString();
                String password=Password.getText().toString();
                if(email.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Email is required!",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter Password!",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(getApplicationContext(),"Please Enter a valid email!",Toast.LENGTH_SHORT).show();
                    return;

                }
                if(password.length()<=8){
                    Toast.makeText(getApplicationContext(),"Password contain atleast 8  characters!",Toast.LENGTH_SHORT).show();
                    return;
                }


            }

        });









    }
}
