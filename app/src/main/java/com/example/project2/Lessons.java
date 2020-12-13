package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Lessons extends AppCompatActivity {
    TextView level;
    TextView skill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        level = findViewById(R.id.level);
        skill= findViewById(R.id.skill);
        Intent intent = getIntent();
        String le= intent.getStringExtra("level");
        String sk = intent.getStringExtra("skill");
        level.setText(le);
        skill.setText(sk);
    }
}