package com.rafale.studio.V1.foodplaza.Activities.StartUpActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rafale.studio.V1.foodplaza.R;

public class IntroActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     */

    private TextView signInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);

        signInBtn = (TextView) findViewById(R.id.sign_in_btn_intro_ac);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), com.rafale.studio.V1.foodplaza.Activities.StartUpActivities.SignInActivity.class));
            }
        });

    }// @Override

}// END