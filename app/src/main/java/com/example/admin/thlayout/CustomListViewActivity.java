package com.example.admin.thlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Admin on 8/3/2017.
 */

public class CustomListViewActivity extends AppCompatActivity{
    ListView lv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);

        lv = (ListView) findViewById(R.id.listViewCustom);

        ArrayList<Integer> listId = addElementImage();


        ArrayList<String> listString = addElementString();

        CustomAdapter customAdapter = new CustomAdapter(CustomListViewActivity.this, listId, listString);
        lv.setAdapter(customAdapter);

    }

    private ArrayList<Integer> addElementImage (){
        ArrayList<Integer> listId = new ArrayList<>();
        listId.add(R.drawable.anh1);
        listId.add(R.drawable.anh2);
        return listId;
    }
    private ArrayList<String> addElementString (){
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Minh Xấu Xí");
        listString.add("Cẩm Đẹp Trai");
        return listString;
    }
}
