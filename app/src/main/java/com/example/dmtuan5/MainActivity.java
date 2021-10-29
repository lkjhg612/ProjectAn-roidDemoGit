package com.example.dmtuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*nutMes = findViewById(R.id.btnMes);

        nutMes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manHinh1 = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(manHinh1);
            }
        });*/

        Button btnSendMessage = findViewById(R.id.btnMes);
        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSendMessage(view);
            }
        });
    }

    public void onSendMessage(View view){
        // lấy nội dung trên textView
        // tạo intent đề gửi nội dung đi
        EditText messageView = findViewById(R.id.editTextTextPersonName);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", messageText);
        startActivity(intent);

    }


}