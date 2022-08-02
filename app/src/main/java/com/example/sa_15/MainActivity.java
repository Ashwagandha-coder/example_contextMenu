package com.example.sa_15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView first;
    private TextView second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.tv_first);
        second = findViewById(R.id.tv_second);

        registerForContextMenu(first);
        registerForContextMenu(second);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {


        if (v.getId() == R.id.tv_first) {

            menu.add(0);
            menu.add("for");
            menu.add("door");
            menu.add("bor");


        }

        else {

            menu.add(0);
            menu.add("zakd");
            menu.add("romb");
            menu.add("park");

        }

    }
}