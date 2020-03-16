package com.gemaadhan.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void addThreeForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 3;

        displayForTeamA(scoreForTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 2;

        displayForTeamA(scoreForTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 1;

        displayForTeamA(scoreForTeamA);
    }

    public void resetForTeamA(View v) {
        scoreForTeamA = 0;
        displayForTeamA(scoreForTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void addThreeForTeamB(View v) {
        scoreForTeamB = scoreForTeamB + 3;

        displayForTeamB(scoreForTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreForTeamB = scoreForTeamB + 2;

        displayForTeamB(scoreForTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreForTeamB = scoreForTeamB + 1;

        displayForTeamB(scoreForTeamB);
    }

    public void resetForTeamB(View v) {
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetAll (View v) {
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
