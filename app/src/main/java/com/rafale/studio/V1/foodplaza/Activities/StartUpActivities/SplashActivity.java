package com.rafale.studio.V1.foodplaza.Activities.StartUpActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rafale.studio.V1.foodplaza.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     */

    private static int SPLASH_SA = 4000;
    private Animation topAnim, bottomAnim, leftInAnim, rightInAnim;
    private ImageView powerImgSA, logoImgSA;
    private TextView nameTextSA, sloganTextSA, copyrightTextSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        topAnim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.bottom_animation);
        leftInAnim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.slide_in_left);
        rightInAnim = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.slide_in_right);

        powerImgSA = (ImageView) findViewById(R.id.power_img_SA);
        logoImgSA = (ImageView) findViewById(R.id.logo_img_SA);
        nameTextSA = (TextView) findViewById(R.id.name_text_SA);
        sloganTextSA = (TextView) findViewById(R.id.slogan_text_SA);
        copyrightTextSA = (TextView) findViewById(R.id.copyright_text_SA);

        powerImgSA.setAnimation(topAnim);
        logoImgSA.setAnimation(rightInAnim);
        nameTextSA.setAnimation(leftInAnim);
        sloganTextSA.setAnimation(rightInAnim);
        copyrightTextSA.setAnimation(bottomAnim);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), IntroActivity.class));
                finish();

            }
        }, 2000);

    }// @Override

}// END