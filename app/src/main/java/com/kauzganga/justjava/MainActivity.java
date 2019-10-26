package com.kauzganga.justjava;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static  final int RESULT_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Moses Chongoloka the dev");
        startActivityForResult(intent,RESULT_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_CODE){
            if(resultCode == RESULT_OK){

                Toast.makeText(this,data.getStringExtra(SecondActivity.NAME), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
