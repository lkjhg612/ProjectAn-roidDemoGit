package BtSlide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.dmtuan5.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button nutThemSv;
    ListView lvDSSV;
    ArrayAdapter adapter;

    ArrayList dssv = new ArrayList();

    public static final int MY_REQUEST_CODE = 777;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        nutThemSv= findViewById(R.id.btnThemSinhVien);
        lvDSSV = findViewById(R.id.lvThemSv);

        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, dssv);

        lvDSSV.setAdapter(adapter);

        nutThemSv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh = new Intent(MainActivity.this, SInhVienActivity.class);
                startActivityForResult(mh, MY_REQUEST_CODE);

            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        {
            Bundle b = data.getBundleExtra("DuLieuTruyen");
            String SV = b.getString("HoTen") + " - " + b.getString("MSSV");  dssv.add(SV);
            adapter.notifyDataSetChanged();//cập nhật
        }

    }
}