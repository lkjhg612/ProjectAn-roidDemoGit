package ThucHanhThem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dmtuan5.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonOpenURL;
    private Button buttonSendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.buttonOpenURL = (Button) this.findViewById(R.id.btnGoogle);
        this.buttonSendEmail = (Button) this.findViewById(R.id.btnEmail);

        this.buttonOpenURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openURL();

            }
        });

        this.buttonSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();

            }
        });



    }


    public void openURL(){
        String url = "https://www.google.com/";

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        this.startActivity(intent);
    }

    public void sendEmail(){
        String[] recipients = new String[]{"friendemail@gmail.com"};

        String subject = "Hi how are you";

        String content = "This is my test email";

        Intent intentEmail = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        intentEmail.putExtra(Intent.EXTRA_EMAIL, recipients);
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
        intentEmail.putExtra(Intent.EXTRA_TEXT, content);

        intentEmail.setType("text/plain");

        startActivity(Intent.createChooser(intentEmail, "Choose an email client from..."));
    }
}