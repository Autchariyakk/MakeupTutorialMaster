package com.example.lupan.makeuptutorial;

import android.content.Intent;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class activity_two extends AppCompatActivity {

    Camera camera;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button buttonCamera = (Button) findViewById(R.id.button_camera);

        // OPEN CAMERA

        camera = Camera.open();





        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_two.this,activity_3.class);

                startActivity(intent);

            }
        });

    }
}


