package com.kariot.loginsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaration
    Button myButton;
    EditText edtUsername;
    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Views Init
        myButton = findViewById(R.id.button);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();

                if (username.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Username should not be empty",Toast.LENGTH_LONG).show();
                }else if(username.length()<6){
                    Toast.makeText(getApplicationContext(),"Username should be 6 characters long",Toast.LENGTH_LONG).show();
                }else if(password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Password should not be empty",Toast.LENGTH_LONG).show();
                }else if (password.length()<6){
                    Toast.makeText(getApplicationContext(),"Password should be 6 characters long",Toast.LENGTH_LONG).show();
                }else{
                   Toast.makeText(getApplicationContext(),"Form Validated",Toast.LENGTH_LONG).show();

                   Intent newActivity = new Intent(MainActivity.this,DashboardActivity.class);
                   newActivity.putExtra("UNAME",username);
                   newActivity.putExtra("PWORD",password);
                   startActivity(newActivity);
                }

            }
        });
    }

   /* public void onClickButton(View view) {
        Log.d("OnClick","Detected");
    }*/
}
