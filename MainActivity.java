package com.abdelvpn.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect = findViewById(R.id.connect);

        connect.setOnClickListener(v -> {
            Toast.makeText(this,"Connexion au serveur V2Ray...",Toast.LENGTH_LONG).show();
        });
    }
}
