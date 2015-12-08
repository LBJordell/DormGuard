package com.example.dormguard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.ImageButton;
import java.util.TimerTask;
import java.util.logging.Handler;

public class VideoLibrary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_library.xml
        setContentView(R.layout.video_library);

        ImageButton mainButton = (ImageButton) findViewById(R.id.ImageButtonVoD);

        mainButton.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                // Start VideoLibraryPlayer.class
                Intent myIntent = new Intent(VideoLibrary.this,
                        HttpURLconnection.class);
                startActivity(myIntent);

            }
        });}


}


