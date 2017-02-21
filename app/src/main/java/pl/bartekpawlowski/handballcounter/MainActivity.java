package pl.bartekpawlowski.handballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    int penaltyTeamA;
    int penaltyTeamB;
    int yellowCardTeamA;
    int yellowCardTeamB;
    int redCardTeamA;
    int redCardTeamB;

//  Views
    private TextView scoreTeamAView;
    private TextView scoreTeamBView;
    private TextView penaltyTeamAView;
    private TextView penaltyTeamBView;
    private TextView yellowCardTeamAView;
    private TextView yellowCardTeamBView;
    private TextView redCardTeamAView;
    private TextView redCardTeamBView;

    static final String SCORE_TEAM_A = "scoreTeamA";
    static final String SCORE_TEAM_B = "scoreTeamB";
    static final String PENALTY_TEAM_A = "penaltyTeamA";
    static final String PENALTY_TEAM_B = "penaltyTeamB";
    static final String YELLOW_CARD_TEAM_A = "yellowCardTeamA";
    static final String YELLOW_CARD_TEAM_B = "yellowCardTeamB";
    static final String RED_CARD_TEAM_A = "redCardTeamA";
    static final String RED_CARD_TEAM_B = "redCardTeamB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamAView = (TextView) findViewById(R.id.scoreTeamA);
        scoreTeamBView = (TextView) findViewById(R.id.scoreTeamB);
        penaltyTeamAView = (TextView) findViewById(R.id.penaltyTeamA);
        penaltyTeamBView = (TextView) findViewById(R.id.penaltyTeamB);
        yellowCardTeamAView = (TextView) findViewById(R.id.yellowCardTeamA);
        yellowCardTeamBView = (TextView) findViewById(R.id.yellowCardTeamB);
        redCardTeamAView = (TextView) findViewById(R.id.redCardTeamA);
        redCardTeamBView = (TextView) findViewById(R.id.redCardTeamB);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
            scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);
            penaltyTeamA = savedInstanceState.getInt(PENALTY_TEAM_A);
            penaltyTeamB = savedInstanceState.getInt(PENALTY_TEAM_B);
            yellowCardTeamA = savedInstanceState.getInt(YELLOW_CARD_TEAM_A);
            yellowCardTeamB = savedInstanceState.getInt(YELLOW_CARD_TEAM_B);
            redCardTeamA = savedInstanceState.getInt(RED_CARD_TEAM_A);
            redCardTeamB = savedInstanceState.getInt(RED_CARD_TEAM_B);
        } else {
            scoreTeamA = 0;
            scoreTeamB = 0;
            penaltyTeamA = 0;
            penaltyTeamB = 0;
            yellowCardTeamA = 0;
            yellowCardTeamB = 0;
            redCardTeamA = 0;
            redCardTeamB = 0;
        }

        displayAll();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(SCORE_TEAM_A, scoreTeamA);
        savedInstanceState.putInt(SCORE_TEAM_B, scoreTeamB);
        savedInstanceState.putInt(PENALTY_TEAM_A, penaltyTeamA);
        savedInstanceState.putInt(PENALTY_TEAM_B, penaltyTeamB);
        savedInstanceState.putInt(YELLOW_CARD_TEAM_A, yellowCardTeamA);
        savedInstanceState.putInt(YELLOW_CARD_TEAM_B, yellowCardTeamB);
        savedInstanceState.putInt(RED_CARD_TEAM_A, redCardTeamA);
        savedInstanceState.putInt(RED_CARD_TEAM_B, redCardTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    private void displayScoreTeamA(int score) {
        scoreTeamAView.setText(String.valueOf(score));
    }

    private void displayScoreTeamB(int score) {
        scoreTeamBView.setText(String.valueOf(score));
    }

    private void displayPenaltyTeamA(int penalty) {
        String text = penalty * 2 + " min";
        penaltyTeamAView.setText(text);
    }

    private void displayPenlatyTeamB(int penalty) {
        String text = penalty * 2 + " min";
        penaltyTeamBView.setText(text);
    }

    private void displayYellowCardTeamA(int card) {
        yellowCardTeamAView.setText(String.valueOf(card));
    }

    private void displayYellowCardTeamB(int card) {
        yellowCardTeamBView.setText(String.valueOf(card));
    }

    private void displayRedCardTeamA(int card) {
        redCardTeamAView.setText(String.valueOf(card));
    }

    private void displayRedCardTeamB(int card) {
        redCardTeamBView.setText(String.valueOf(card));
    }

    public void addPoint(View view) {
        String team = view.getTag().toString();

        switch (team) {
            case "A":
                scoreTeamA += 1;
                displayScoreTeamA(scoreTeamA);
                break;
            case "B":
                scoreTeamB += 1;
                displayScoreTeamB(scoreTeamB);
                break;
        }
    }

    public void addPenalty(View view) {
        String team = view.getTag().toString();

        switch (team) {
            case "A":
                penaltyTeamA += 1;
                displayPenaltyTeamA(penaltyTeamA);
                break;
            case "B":
                penaltyTeamB += 1;
                displayPenlatyTeamB(penaltyTeamB);
                break;
        }
    }

    public void addYellowCard(View view) {
        String team = view.getTag().toString();

        switch (team) {
            case "A":
                yellowCardTeamA += 1;
                displayYellowCardTeamA(yellowCardTeamA);
                break;
            case "B":
                yellowCardTeamB += 1;
                displayYellowCardTeamB(yellowCardTeamB);
                break;
        }
    }

    public void addRedCard(View view) {
        String team = view.getTag().toString();

        switch (team) {
            case "A":
                redCardTeamA += 1;
                displayRedCardTeamA(redCardTeamA);
                break;
            case "B":
                redCardTeamB += 1;
                displayRedCardTeamB(redCardTeamB);
                break;
        }
    }

    private void displayAll() {
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayPenaltyTeamA(penaltyTeamA);
        displayPenlatyTeamB(penaltyTeamB);
        displayYellowCardTeamA(yellowCardTeamA);
        displayYellowCardTeamB(yellowCardTeamB);
        displayRedCardTeamA(redCardTeamA);
        displayRedCardTeamB(redCardTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;

        displayAll();
    }
}
