package com.example.omokproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button btnGameStart, btnGameEnd , btnGameMade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnGameStart = findViewById(R.id.btnGameStart);
        btnGameEnd = findViewById(R.id.btnGameEnd);
        btnGameMade = findViewById(R.id.btnGameMade);

        btnGameStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(StartActivity.this, "StartClicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), EnterGameActivity.class);
                startActivity(intent);
            }
        });

        btnGameMade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
                startActivity(intent);
            }
        });

        btnGameEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
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

                //Toast.makeText(StartActivity.this, "게임이 종료됩니다", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
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