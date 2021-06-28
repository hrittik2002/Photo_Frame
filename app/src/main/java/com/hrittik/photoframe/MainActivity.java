package com.hrittik.photoframe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] names = {"Tendu" , "Dhoni" , "Virat" , "Rohit", "Boom" };
    ImageButton prev , next;
    ImageView pic;
    TextView txt;
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    public void prev(View v){
        txt = findViewById(R.id.txt);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX , "id" , getOpPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage - 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY , "id" , getOpPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        txt.setText(names[currentImage]);

    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    public void next(View v){
        txt = findViewById(R.id.txt);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX , "id" , getOpPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY , "id" , getOpPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        txt.setText(names[currentImage]);
    }
}