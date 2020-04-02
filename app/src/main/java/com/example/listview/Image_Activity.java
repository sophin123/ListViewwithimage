package com.example.listview;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Image_Activity extends AppCompatActivity {

    int imageposition;

    ImageView carIv;
    int sessionID;

    int imageArray[] = {R.drawable.lamborgini, R.drawable.ford, R.drawable.mustang, R.drawable.bugatti, R.drawable.ferrari};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_);

        carIv = (ImageView) findViewById(R.id.carimageview);

        sessionID = getIntent().getIntExtra("IMAGE_POSITION", 0);
        carIv.setImageResource(imageArray[sessionID]);

    }
}
