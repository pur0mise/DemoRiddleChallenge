package sg.edu.rp.c346.id22023910.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswerQ1;
    TextView tvAnswerQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswerQ1 = findViewById(R.id.tvAnswerQ1);
        tvAnswerQ2 = findViewById(R.id.tvAnswerQ2);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");


        if (questionsSelected.equals("Q1")) {
            tvAnswerQ1.setText(questionsSelected + " answer is: Queue");
        }
        else if (questionsSelected.equals("Q2")) {
            tvAnswerQ2.setText(questionsSelected + " answer is: Gone");
        }
    }
}