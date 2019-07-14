package com.example.multiple_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutAlc(View view) {
//        Button aboutAlcButton = findViewById(R.id.about_Alc);
        Intent intent = new Intent(this,alcPage.class);
        startActivity(intent);

    }

    public void myprofile(View view) {
        Button aboutMyProfile = findViewById(R.id.my_profile);
        Intent intent = new Intent(this,myProfile.class);
        startActivity(intent);

    }

}
