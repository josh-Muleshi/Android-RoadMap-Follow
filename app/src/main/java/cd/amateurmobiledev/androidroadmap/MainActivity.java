package cd.amateurmobiledev.androidroadmap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView GreetingTxt;
    private EditText NameInput;
    private Button PlayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GreetingTxt = findViewById(R.id.greeting_txt);
        NameInput = findViewById(R.id.name_input);
        PlayBtn = findViewById(R.id.play_btn);

    }
}