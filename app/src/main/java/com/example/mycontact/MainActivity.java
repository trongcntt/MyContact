package com.example.mycontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import  com.example.mycontact.Contact;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lstContact;
    private ImageButton btnAdd;
    private ArrayList<Contact> lstData;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstContact = findViewById(R.id.lstContact);
        btnAdd = findViewById(R.id.btnAdd);

        lstData = new ArrayList<>();
        lstData.add(new Contact(1,"Nguyễn văn a","0397158921"));
        lstData.add(new Contact(2,"Trần văn b","0389134218"));
        lstData.add(new Contact(3,"Lê văn c","0359771955"));
        lstData.add(new Contact(4,"Trọng văn d","0345640688"));

        myAdapter = new MyAdapter(this,lstData);
        lstContact.setAdapter(myAdapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}