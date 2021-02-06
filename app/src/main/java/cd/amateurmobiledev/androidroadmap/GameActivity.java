package cd.amateurmobiledev.androidroadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView txtQuestion;
    private Button btnAns1;
    private Button btnAns2;
    private Button btnAns3;
    private Button btnAns4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        txtQuestion = findViewById(R.id.question_text);
        btnAns1 = findViewById(R.id.answer1_btn);
        btnAns2 = findViewById(R.id.answer2_btn);
        btnAns3 = findViewById(R.id.answer3_btn);
        btnAns4 = findViewById(R.id.answer4_btn);
    }
}