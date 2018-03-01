package com.guiying.module.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.guiying.module.common.utils.ToastUtils;

@Route(path = "/my/main")
public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
       String id= getIntent().getStringExtra("id");
        ToastUtils.showLongToast(id);
    }
}
