package com.soren.sagen.implicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu floatingActionMenu;
    FloatingActionButton fabBtnMap,fabBtnMail,fabBtnPhncall,fabBtnTele ,fabBtnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionMenu = findViewById(R.id.Fab_menu);

        fabBtnMap = findViewById(R.id.floating_map_btn);
        fabBtnMail = findViewById(R.id.floating_mail_btn);
        fabBtnPhncall = findViewById(R.id.floating_phn_btn);
        fabBtnTele = findViewById(R.id.floating_tele_btn);
        fabBtnCamera = findViewById(R.id.floating_camera_btn);

        fabBtnMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
            }
        });
        fabBtnMail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked

            }
        });
        fabBtnPhncall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked

            }
        });
        fabBtnTele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked

            }
        });
        fabBtnCamera.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked

            }
        });
    }
}
