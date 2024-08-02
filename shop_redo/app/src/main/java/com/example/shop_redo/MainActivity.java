package com.example.shop_redo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }



    public void clickCall(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:886422058000"));
        startActivity(i);
    }

    public void clickMap(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:0,0?q=好食慢慢"));
        startActivity(i);
    }

    public void webSearch(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/people/%E5%A5%BD%E9%A3%9F%E6%85%A2%E6%85%A2/100064563467025/?sk=about"));
        startActivity(i);
    }

    public void inlineBooking(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://inline.app/booking/-MLklxfzM-y0mKfLggd2:inline-live-2/-MLklxqI24BRUfuq2Y4B?language=zh-tw"));
        startActivity(i);

    }

}