package com.example.lenovo.congyunlong20170710;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddView addView = (AddView) findViewById(R.id.addview);
        addView.setListener(new BaseOnClickListener.OnClickListener() {
            @Override
            public void OnClick(int num) {
                Toast.makeText(MainActivity.this,"数量改变为"+num,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
