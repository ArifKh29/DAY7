package com.example.dts_day7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listviewActivity extends AppCompatActivity {

    ListView lvData;
    private String[] data = new String[]{
            "bakso","nasi goreng","mie ayam", "mie goreng", "ayam geprek"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lvData = findViewById(R.id.lvData);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(listviewActivity.this,android.R.layout.simple_list_item_1,data);
        lvData.setAdapter(adapter);
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(listviewActivity.this, data[i]+" Terpilih",Toast.LENGTH_LONG).show();
            }
        });

    }
}
