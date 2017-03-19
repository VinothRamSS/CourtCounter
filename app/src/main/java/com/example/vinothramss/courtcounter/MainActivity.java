package com.example.vinothramss.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.t1pt3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore = teamAScore + 3 ;
                TextView scoreView = (TextView) findViewById(R.id.no1);
                scoreView.setText(String.valueOf(teamAScore));
            }
        });
        Button b2 = (Button) findViewById(R.id.t2pt3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore = teamBScore + 3 ;
                TextView scoreView = (TextView) findViewById(R.id.no2);
                scoreView.setText(String.valueOf(teamBScore));
            }
        });
        Button b3 = (Button) findViewById(R.id.t1pt2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore = teamAScore + 2 ;
                TextView scoreView = (TextView) findViewById(R.id.no1);
                scoreView.setText(String.valueOf(teamAScore));
            }
        });
        Button b4 = (Button) findViewById(R.id.t2pt2);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore = teamBScore + 2 ;
                TextView scoreView = (TextView) findViewById(R.id.no2);
                scoreView.setText(String.valueOf(teamBScore));
            }
        });
        Button b5 = (Button) findViewById(R.id.t1pt);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(teamAScore >0) {
                    teamAScore = teamAScore - 1;
                    TextView scoreView = (TextView) findViewById(R.id.no1);
                    scoreView.setText(String.valueOf(teamAScore));
                }
            }
        });
        Button b6 = (Button) findViewById(R.id.t2pt);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(teamBScore >0)
                {
                    teamBScore = teamBScore - 1 ;
                    TextView scoreView = (TextView) findViewById(R.id.no2);
                    scoreView.setText(String.valueOf(teamBScore));
                }
            }
        });
        Button b7 = (Button) findViewById(R.id.reset);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore =0 ;
                TextView scoreView = (TextView) findViewById(R.id.no1);
                scoreView.setText(String.valueOf(teamAScore));
                teamBScore =0 ;
                scoreView = (TextView) findViewById(R.id.no2);
                scoreView.setText(String.valueOf(teamBScore));
            }
        });
    }
}
