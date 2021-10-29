package BtSlide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.dmtuan5.R;

public class SInhVienActivity extends AppCompatActivity {
    Button btnLuu;
    EditText txtHoTen, txtMSSV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinh_vien);

        btnLuu = findViewById(R.id.btnLuu);

        txtHoTen = findViewById(R.id.txtHoTen);
        txtMSSV = findViewById(R.id.txtMssv);

        Intent it = getIntent();

        Bundle b = new Bundle();

        b.putString("HoTen", txtHoTen.getText().toString());
        b.putString("MSSV", txtMSSV.getText().toString());

        it.putExtra("Dữ liệu truyền", b);
        setResult(777, it);

        finish();
    }
}