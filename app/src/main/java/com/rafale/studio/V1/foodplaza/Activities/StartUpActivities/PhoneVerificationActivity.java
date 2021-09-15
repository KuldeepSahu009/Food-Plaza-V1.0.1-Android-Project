package com.rafale.studio.V1.foodplaza.Activities.StartUpActivities;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.rafale.studio.V1.foodplaza.R;

public class PhoneVerificationActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_phone_verification);

    }// @Override

}//END