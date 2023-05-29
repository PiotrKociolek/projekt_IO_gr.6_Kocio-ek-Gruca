package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

public class CameraAndPdfList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ImageButton button = findViewById(R.id.viewPdf);//pdf poczatek
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                intent.putExtra("pdf_url","https://www.soundczech.cz/temp/lorem-ipsum.pdf"); //plan polowan
                startActivity(intent);//pdf koniec

                ImageButton aparat; //aparat poczatek
                aparat = (ImageButton) findViewById(R.id.aparat);
                aparat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            Intent intent1 = new Intent();
                            intent1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivity(intent1);
                        } catch (Exception e)
                        {
                            e.printStackTrace();
                        }

                    }//aparat koniec
                });

            }
        });
    }
}