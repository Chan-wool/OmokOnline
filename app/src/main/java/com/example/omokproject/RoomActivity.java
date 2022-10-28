package com.example.omokproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RoomActivity extends AppCompatActivity {


    private ArrayList<RoomData> arrayList;
    private RoomAdapter roomAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerVeiw);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        roomAdapter = new RoomAdapter(arrayList);
        recyclerView.setAdapter(roomAdapter);


    }




    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(RoomActivity.this);
        builder.setTitle("나가...시게요...?")
                .setMessage("진짜....나갈건가요...? 제발 ㅠㅠ :(")
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                        System.runFinalization();
                        System.exit(0);
                    }
                })
                .setNegativeButton("취소", null)
                .setCancelable(false);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}