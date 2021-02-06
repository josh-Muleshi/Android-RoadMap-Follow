package cd.amateurmobiledev.androidroadmap.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import cd.amateurmobiledev.androidroadmap.R;
import cd.amateurmobiledev.androidroadmap.model.Question;
import cd.amateurmobiledev.androidroadmap.model.QuestionBanck;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtQuestion;
    private Button btnAns1;
    private Button btnAns2;
    private Button btnAns3;
    private Button btnAns4;

    private QuestionBanck questionBanck;
    private Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionBanck = this.generateQuestions();

        txtQuestion = findViewById(R.id.question_text);
        btnAns1 = findViewById(R.id.answer1_btn);
        btnAns2 = findViewById(R.id.answer2_btn);
        btnAns3 = findViewById(R.id.answer3_btn);
        btnAns4 = findViewById(R.id.answer4_btn);

        btnAns1.setTag(0);
        btnAns2.setTag(1);
        btnAns3.setTag(2);
        btnAns4.setTag(3);

        btnAns1.setOnClickListener(this);
        btnAns2.setOnClickListener(this);
        btnAns3.setOnClickListener(this);
        btnAns4.setOnClickListener(this);

        currentQuestion = questionBanck.getQuestion();
        this.displayQuestion(currentQuestion);

    }

    @Override
    public void onClick(View view) {
        int responceIndex =(int) view.getTag();

        if (responceIndex == currentQuestion.getAnswerIndex()){
            Toast.makeText(this, "well done", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "bad answer", Toast.LENGTH_SHORT).show();
        }
    }

    public void displayQuestion(final Question question){
        txtQuestion.setText(question.getQuestion());
        btnAns1.setText(question.getChoiceList().get(0));
        btnAns2.setText(question.getChoiceList().get(1));
        btnAns3.setText(question.getChoiceList().get(2));
        btnAns4.setText(question.getChoiceList().get(3));
    }

    private QuestionBanck generateQuestions(){

        Question question1 = new Question("Who is the creator of Android?",
                Arrays.asList("Andy Rubin",
                        "Steve Wozniak",
                        "Jake Wharton",
                        "Paul Smith"),
                0);

        Question question2 = new Question("When did the first man land on the moon?",
                Arrays.asList("1958",
                        "1962",
                        "1967",
                        "1969"),
                3);

        Question question3 = new Question("What is the house number of The Simpsons?",
                Arrays.asList("42",
                        "101",
                        "666",
                        "742"),
                3);

        return new QuestionBanck(Arrays.asList(question1,
                question2,
                question3));
    }
}
