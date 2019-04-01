package com.example.dell.kotlindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dell.kotlindemo.activity.BaseActivity;
import com.example.dell.kotlindemo.activity.BasicGrammarActivity;
import com.example.dell.kotlindemo.activity.ControlActivity;

/**
 * 创建日期：2019/2/25
 * 作者:baiyang
 */
public class TestActivity extends BaseActivity {
    private static final String TAG = "TestActivity";
    private Button btn_test;
    //private Button btn_test;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_grammar);
        btn_test = (Button) findViewById(R.id.btn_test);
        Intent intent = new Intent(this, ControlActivity.class);

    }

    private int sum(int a, int b) {
        return a + b;
    }


    @Override
    protected String getActionBarTitle() {
        return "Test";
    }

    @Override
    protected void initViews() {

    }

    private void onClickListener() {
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
