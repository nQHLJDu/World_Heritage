package com.example.worldheritage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
    }

    public void button_kinki(View view){
        Intent intent = new Intent(Main.this, KinkiActivity.class);
        startActivity(intent);
    }

    public void button_tyugoku(View view){
        Intent intent = new Intent(Main.this, TyugokuActivity.class);
        startActivity(intent);
    }

    public void button_shikoku(View view){
        Intent intent = new Intent(Main.this, ShikokuActivity.class);
        startActivity(intent);
    }

    public void button_kyusyu(View view){
        Intent intent = new Intent(Main.this, KyusyuActivity.class);
        startActivity(intent);
    }

    public void button_tyubu(View view){
        Intent intent = new Intent(Main.this, TyubuActivity.class);
        startActivity(intent);
    }

    public void button_kanto(View view){
        Intent intent = new Intent(Main.this, KantoActivity.class);
        startActivity(intent);
    }

    public void button_tohoku(View view){
        Intent intent = new Intent(Main.this, TohokuActivity.class);
        startActivity(intent);
    }

}