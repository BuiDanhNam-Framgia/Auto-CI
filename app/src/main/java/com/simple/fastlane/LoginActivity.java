package com.simple.fastlane;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.
                activity_main);
        findViewById(R.id.link_signup)
                .setOnClickListener(
                        this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}
