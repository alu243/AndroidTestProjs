package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn1 = (Button)this.findViewById(R.id.button);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        TextView t = (TextView)findViewById(R.id.textView1);
//        t.setText("不推薦使用此方法");

        Button btn1 = (Button)this.findViewById(R.id.button);
        t.setText(btn1.getText() + "不推薦使用此方法");

    }
}
