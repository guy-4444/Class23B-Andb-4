package com.guy.class23b_andb_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LST_properties = findViewById(R.id.main_LST_properties);


        ArrayList<Property> properties = DataManager.generateProperties();
        Adapter_Property adapterProperty = new Adapter_Property(this, properties);
        main_LST_properties.setLayoutManager(new LinearLayoutManager(this));
        main_LST_properties.setAdapter(adapterProperty);

    }
}