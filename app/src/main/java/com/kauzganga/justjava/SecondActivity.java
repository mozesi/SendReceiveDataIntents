package com.kauzganga.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    static  final String  TEXT_REPLY ="This is the second ACtivity";
    static  final String NAME = "Name";
    String nameOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent() != null){
            nameOne = getIntent().getStringExtra("name");
            Toast.makeText(this, getIntent().getExtras().get("name").toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void getBack(View view){
        Intent backIntent = new Intent();
        backIntent.putExtra(NAME,TEXT_REPLY + nameOne);
        setResult(RESULT_OK,backIntent);
        finish();
    }
}
