package com.example.asus.todolist;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TODOLIST extends AppCompatActivity implements View.OnClickListener  {
    private EditTextET itemET;
    private Button btn;
    private ListView itemsList;

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    public TODOLIST(ArrayList<String> items) {
        this.items = items;
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        itemET = findViewById(R.id.item_edit_text);
        btn = findViewById(R.id.add_btn);
        itemsList = findViewById(R.id.items_list);


        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getID()){
            case R.id.add_btn:
                String itemEntered = itemET.getText().toString();
                adapter.add(itemEntered);
                itemET.setText("");

                Toast.makeText(this,"Item Added",Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
