package com.example.customviewyapimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView goster;
    private CustomAdapter customAdapter;
    private ArrayList<rehber> rehber2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*goster=findViewById(R.id.listview);

        rehber[] kisiler=new rehber[]
                {
                        new rehber("Aslı Akkaya","0558 567 1453",R.drawable.wp),
                        new rehber("Mihrimah Mercan","0558 188 1453",R.drawable.ic_launcher_background)
                };
        rehberAdapter adapter=new rehberAdapter(this,R.layout.customlist,kisiler);
        goster.setAdapter(adapter);*/
        goster=findViewById(R.id.listview);
        rehber2=new ArrayList<>();
        Cursor phones=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME+" ASC");
        while (phones.moveToNext()){
            String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String number=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            //int resim= 0;
            rehber rehber=new rehber();
            rehber.setAd(name);
            rehber.setNumara(number);
            //rehber.setKisiResim(resim);
            rehber2.add(rehber);
            Log.d("name>>",name+" "+number);
        }
        phones.close();
        customAdapter=new CustomAdapter(this,rehber2);
        goster.setAdapter(customAdapter);

    }
}
