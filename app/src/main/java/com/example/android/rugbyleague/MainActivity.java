package com.example.android.rugbyleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tracks to the score for the Team blue
    int scoreTeamblue = 0;
    //Tracks to the score for Team red
    int scoreTeamred = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    /**
     * Increase the score for Team blue by 5 Points.
     */
    public void addFiveForTeamBlue(View view) {
        scoreTeamblue = scoreTeamblue + 5;
        displayForTeamblue (scoreTeamblue);

    }
    /**
     * Increase the score for Team blue by 5 Points.
     */
    public void addFiveForTeamBlue2(View view) {
        scoreTeamblue = scoreTeamblue + 5;
        displayForTeamblue( scoreTeamblue );
    }
    /**
     * Increase the score for Team blue by 2 Points.
     */
    public void addTwoForTeamBlue(View view) {
        scoreTeamblue = scoreTeamblue + 2;
        displayForTeamblue( scoreTeamblue );
    }
    /**
     * Increase the score for Team blue by 3 Points.
     */
    public void addThreeForTeamBlue(View view) {
        scoreTeamblue = scoreTeamblue + 3;
        displayForTeamblue( scoreTeamblue );
    }
    /**
     * Increase the score for Team blue by 3 Points.
     */
    public void addThreeForTeamBlue2(View view) {
        scoreTeamblue = scoreTeamblue + 3;
        displayForTeamblue( scoreTeamblue );
    }

    /**
     * Increase the score for Team red by 3 Points.
     */
    public void addThreeForTeamRed2(View view) {
        scoreTeamred = scoreTeamred + 3;
        displayForTeamred (scoreTeamred);

    }
    /**
     * Increase the score for Team red by 3 Points.
     */
    public void addThreeForTeamRed(View view) {
        scoreTeamred = scoreTeamred + 3;
        displayForTeamred( scoreTeamred );
    }

    /**
     * Increase the score for Team red by 2 Points.
     */
    public void addTwoForTeamRed(View view) {
        scoreTeamred = scoreTeamred + 2;
        displayForTeamred( scoreTeamred );
    }
    /**
     * Increase the score for Team red by 5 Points.
     */
    public void addFiveForTeamRed(View view) {
        scoreTeamred = scoreTeamred + 5;
        displayForTeamred( scoreTeamred );
    }
    /**
     * Increase the score for Team red by 5 Points.
     */
    public void addFiveForTeamRed2(View view) {
        scoreTeamred = scoreTeamred + 5;
        displayForTeamred( scoreTeamred );
    }

    /**
     * Reset all the Points to 0.
     */
    public void resetScore(View view) {
        scoreTeamblue = 0;
        scoreTeamred = 0;
        displayForTeamblue(scoreTeamblue);
        displayForTeamred(scoreTeamred);
    }
    /**
         * Displays the given score for Team Blue.
         */
    public void displayForTeamblue(int score) {
        TextView scoreView = (TextView) findViewById( R.id.team_blue_score );
        scoreView.setText( String.valueOf(score) );
    }
    /**
     * Displays the given score for Team Red.
     */
    public void displayForTeamred(int score) {
        TextView scoreView = (TextView) findViewById( R.id.team_red_score );
        scoreView.setText( String.valueOf(score));
    }

}


