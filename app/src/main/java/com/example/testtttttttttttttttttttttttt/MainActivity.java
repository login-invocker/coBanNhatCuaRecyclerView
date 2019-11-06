package com.example.testtttttttttttttttttttttttt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
HelpAdapter helpAdapter;
    private RecyclerView recyclerView;
    List<HelpData> helpDatas = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        addControl();
    }

    private void addControl() {
        recyclerView=findViewById(R.id.recy);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
recyclerView.setLayoutManager(layoutManager);
recyclerView.setHasFixedSize(true);
helpAdapter=new HelpAdapter(helpDatas,this);
recyclerView.setAdapter(helpAdapter);
    }

    private void addData() {

        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
        helpDatas.add(new HelpData("Long"));
    }
}
