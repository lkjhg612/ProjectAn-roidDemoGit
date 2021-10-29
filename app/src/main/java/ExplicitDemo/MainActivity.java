package ExplicitDemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dmtuan5.R;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFullName;
    private TextView textFeedback;

    private Button buttonSendMessage;
    public static final int MY_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        this.editTextFullName = findViewById(R.id.editText_fullName);
        this.textFeedback = findViewById(R.id.text_feedback);

        this.buttonSendMessage = findViewById(R.id.button_sendMessage);

        this.buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();

            }
        });

    }
    public void input(){

    }

    public void sendMessage(){
        String fullName = editTextFullName.getText().toString();
        String message = "Hello, Please watch hentai with me";

        Intent intent = new Intent(this,GreetingActivity.class);
        intent.putExtra("fullname", fullName);
        intent.putExtra("message", message);
        this.startActivityForResult(intent, MY_REQUEST_CODE);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK && requestCode == MY_REQUEST_CODE){
            String feedback = data.getStringExtra("feedback");
            this.textFeedback.setText(feedback);
        }else {
            this.textFeedback.setText("!?");
        }
    }
}