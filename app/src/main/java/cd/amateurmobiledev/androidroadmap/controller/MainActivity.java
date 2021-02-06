package cd.amateurmobiledev.androidroadmap.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cd.amateurmobiledev.androidroadmap.R;
import cd.amateurmobiledev.androidroadmap.model.User;

public class MainActivity extends AppCompatActivity {

    private TextView GreetingTxt;
    private EditText NameInput;
    private Button PlayBtn;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User();

        GreetingTxt = findViewById(R.id.greeting_txt);
        NameInput = findViewById(R.id.name_input);
        PlayBtn = findViewById(R.id.play_btn);

        PlayBtn.setEnabled(false);

        NameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                PlayBtn.setEnabled(charSequence.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        PlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = NameInput.getText().toString();
                user.setFirstName(firstName);
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivity(i);
            }
        });
    }
}