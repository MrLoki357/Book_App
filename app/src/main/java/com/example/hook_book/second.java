package com.example.hook_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class second extends AppCompatActivity {

    ImageView SplashImage;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SplashImage=findViewById(R.id.img);
        lottieAnimationView=findViewById(R.id.lottie);
        SplashImage.animate().translationY(-1800).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
    }
}