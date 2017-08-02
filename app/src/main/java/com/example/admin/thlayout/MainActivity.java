package com.example.admin.thlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_practice);
        lv = (ListView) findViewById(R.id.listView);

        //Tạo mảng gán giá trị các thông số listView
        String [] name = {"A","B","C","D","E"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);
        lv.setAdapter(arrayAdapter);
    }
}
