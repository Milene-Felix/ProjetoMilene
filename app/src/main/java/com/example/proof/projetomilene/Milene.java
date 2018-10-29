package com.example.proof.projetomilene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Milene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milene);
        Button btnMilene = (Button) findViewById(R.id.btnVoltar);

        btnMilene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Milene.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
