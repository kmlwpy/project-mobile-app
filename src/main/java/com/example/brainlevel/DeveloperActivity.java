package com.example.brainlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DeveloperActivity extends AppCompatActivity {
    String sSource = " ";
    String sDestination = "https://www.google.co.th/maps/place/Rajamangala+University+of+Technology+Thanyaburi/@14.0366751,100.7254732,17z/data=!3m1!4b1!4m5!3m4!1s0x311d78a4a8713c3f:0xf019238243532a0!8m2!3d14.0366751!4d100.7276619";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }
    public void openmap(View view)
    {
        finish();
        DesplayTrack(sSource, sDestination);
    }
    private void DesplayTrack(String sSource, String sDestination) {
        try {
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" + sSource+ "/"
                    + sDestination);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/appsdetail?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent menuform = new Intent(this, MenuActivity.class);
        startActivity(menuform);
        finish(); //ปิ ดหน้าปัจจุบัน
    }

}