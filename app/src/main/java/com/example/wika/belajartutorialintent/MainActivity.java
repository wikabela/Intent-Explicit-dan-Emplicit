package com.example.wika.belajartutorialintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnExplicit;
Button btnImplicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExplicit = findViewById(R.id.btn_exp);
        btnExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Berhasil intent dengan explicit", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ExplicitActivity.class);
                startActivity(intent);
            }
        });

        btnImplicit = findViewById(R.id.btn_imp);
        btnImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "081234567891";
                Toast.makeText(MainActivity.this, "Berhasil intent dengan implicit", Toast.LENGTH_SHORT).show();
                Intent intentdial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel"+phoneNumber));
                startActivity(intentdial);
            }
        });
    }
}
