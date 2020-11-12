package com.onedream.wedoxadapterdelegatesdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.onedream.wedoxadapterdelegatesdemo.bean.ABean;
import com.onedream.wedoxadapterdelegatesdemo.bean.BBean;
import com.onedream.wedoxadapterdelegatesdemo.bean.CBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_test;
    //
    private List dataList = new ArrayList<>();
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        initView();
        initData();
        initEvent();
    }

    private void initView() {
        rv_test = findViewById(R.id.rv_test);
    }

    private void initData() {
        myAdapter = new MyAdapter(this, dataList);
        rv_test.setLayoutManager(new LinearLayoutManager(this));
        rv_test.setAdapter(myAdapter);
        //
        getData();
    }

    private void getData() {
        ABean a = new ABean();
        BBean b = new BBean();
        CBean c = new CBean();
        for (int i = 0; i < 100; i++) {
            dataList.add(a);
            dataList.add(b);
            dataList.add(c);
        }
        myAdapter.notifyDataSetChanged();
    }

    private void initEvent() {

    }
}
