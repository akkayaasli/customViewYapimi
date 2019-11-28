package com.example.customviewyapimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView goster;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goster=findViewById(R.id.listview);

        rehber[] kisiler=new rehber[]
                {
                        new rehber("Aslı Akkaya","0558 567 1453",R.drawable.wp),
                        new rehber("Mihrimah Mercan","0558 188 1453",R.drawable.ic_launcher_background)
                };
        rehberAdapter adapter=new rehberAdapter(this,R.layout.customlist,kisiler);
        goster.setAdapter(adapter);
    }
}
