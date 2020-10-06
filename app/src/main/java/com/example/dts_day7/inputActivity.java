package com.example.dts_day7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class inputActivity extends AppCompatActivity {
    TextView txtNama, txtAlamat;
    Button btnSimpan, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNama = findViewById(R.id.txtNama);
        txtAlamat = findViewById(R.id.txtAlamat);
        btnSimpan = findViewById(R.id.btnSimpan);
        btnReset = findViewById(R.id.btnReset);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, alamat;
                if(txtNama.getText().toString().equals("")){
                    Toast.makeText(inputActivity.this,"Nama belum di isi", Toast.LENGTH_LONG).show();
                    txtNama.requestFocus();
                }else if(txtAlamat.getText().toString().equals("")){
                    Toast.makeText(inputActivity.this,"Alamat belum di isi", Toast.LENGTH_LONG).show();
                    txtAlamat.requestFocus();
                }else {
                    nama = txtNama.getText().toString();
                    alamat = txtAlamat.getText().toString();
                    Toast.makeText(inputActivity.this,"Selamat Datang "+nama+" Yang Beralamat Di "+alamat,Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void reset(View view) {
        txtNama.setText("");
        txtAlamat.setText("");
    }
}
