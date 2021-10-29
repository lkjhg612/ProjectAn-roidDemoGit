package com.example.dmtuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();//lấy cái intent nào dc gửi đến
        String messageText = intent.getStringExtra("message");
        TextView messageView = findViewById(R.id.textView);

        messageView.setText(messageText);

    }
}