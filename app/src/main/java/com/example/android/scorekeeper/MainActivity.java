package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/***
 * View tag code in xml was taken from stack overflow
 *view tag devider adjustment as per design from udacity mentor help
 * everything else from udacity tutorial :)
 */

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void submit2PointsA(View view) {
        int points2 = 2;
        scoreTeamA = scoreTeamA + points2;
        displayForTeamA(scoreTeamA);
    }

    public void submit3PointsA(View view) {
        int points3 = 3;
        scoreTeamA = scoreTeamA + points3;
        displayForTeamA(scoreTeamA);
    }

    public void submitFreeThrowA(View view) {
        int points1 = 1;
        scoreTeamA = scoreTeamA + points1;
        displayForTeamA(scoreTeamA);
    }

    public void submit2PointsB(View view) {
        int points2 = 2;
        scoreTeamB = scoreTeamB + points2;
        displayForTeamB(scoreTeamB);
    }

    public void submit3PointsB(View view) {
        int points3 = 3;
        scoreTeamB = scoreTeamB + points3;
        displayForTeamB(scoreTeamB);
    }

    public void submitFreeThrowB(View view) {
        int points1 = 1;
        scoreTeamB = scoreTeamB + points1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);


    }

}
