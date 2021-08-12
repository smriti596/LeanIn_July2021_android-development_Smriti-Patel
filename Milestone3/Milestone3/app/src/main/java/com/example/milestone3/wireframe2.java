package com.example.milestone3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class wireframe2 extends AppCompatActivity {

    View camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wireframe2);
         camera =findViewById(R.id.camera);
camera.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        try{
           Intent intent=new Intent();
           intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
           startActivity(intent);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
});



    }
}