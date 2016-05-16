package com.edcan.grooshbene.tripl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by GrooshBene on 15. 10. 9..
 */
public class LoginActivity extends Activity {
    EditText id, password;
    ImageView loginbutton,fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        id = (EditText)findViewById(R.id.id);
        password = (EditText)findViewById(R.id.password);
        loginbutton = (ImageView)findViewById(R.id.loginbutton);
        fb = (ImageView)findViewById(R.id.fb);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().equals("test") && password.getText().toString().equals("test")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 확인해주세요!", Toast.LENGTH_SHORT).show();
                }
                if (id.getText().toString().trim().equalsIgnoreCase("")) {
                    id.setError("Enter ID");
                }
                if (password.getText().toString().trim().equalsIgnoreCase("")) {
                    password.setError("Enter Password");
                }
            }
        });

    }
}
