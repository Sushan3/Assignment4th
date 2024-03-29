package com.example.gameandcrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonCRUD,buttonWordGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCRUD = findViewById(R.id.btn1);
        buttonWordGame = findViewById(R.id.btn2);

        buttonWordGame.setOnClickListener(this);
        buttonCRUD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btn1)
        {
            Intent intent = new Intent(this,CrudOperationActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.btn2)
        {
            Intent intent = new Intent(this,WordGameActivity.class);
            startActivity(intent);
        }
    }
}
