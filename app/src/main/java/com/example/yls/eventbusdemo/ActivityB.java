package com.example.yls.eventbusdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by 日不落 on 2017/4/2.
 */

public class ActivityB extends AppCompatActivity {

    private Button btn_FirstEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        btn_FirstEvent = (Button) findViewById(R.id.btn_first_event);
        btn_FirstEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new FirstEvent("消息按钮被点击"));

            }
        });

    }
}
