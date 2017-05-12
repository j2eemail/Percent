package com.lxs.percent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lxs.percent.activity.FrameLayoutActivity;
import com.lxs.percent.activity.LinearLayoutActivity;
import com.lxs.percent.activity.RelativeLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linearLayoutOnClick(View view) {
        startActivity(new Intent(this, LinearLayoutActivity.class));
    }

    public void relativeLayoutOnClick(View view) {
        startActivity(new Intent(this, RelativeLayoutActivity.class));
    }

    public void frameLayoutOnClick(View view) {
        startActivity(new Intent(this, FrameLayoutActivity.class));
    }
}
