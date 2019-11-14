package com.sushant.esoftwarica;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etU, etP;
    private Button btnL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etU = findViewById(R.id.etusername);
        etP = findViewById(R.id.etpassword);
        btnL = findViewById(R.id.btnLogin);


    btnL.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String user = etU.getText().toString().trim();
            String pass = etP.getText().toString().trim();

            if (TextUtils.isEmpty(etU.getText().toString())){etU.setError("Input Username"); return;}
            if (TextUtils.isEmpty(etP.getText().toString())){etP.setError("Input Password"); return;}

            if (user.equals("sushant") && pass.equals("S4321")){

                Toast toast = Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();
                Intent intent = new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
            }else
            {
                etP.setError("Incorrect Password");
                return;
            }
            etP.setText(null);
            etU.setText(null);

        }
    });
    }
}
