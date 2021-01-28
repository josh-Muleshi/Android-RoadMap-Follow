package cd.amateurmobiledev.androidroadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        timer = new Timer();
        timer.schedule(() -> {
            Intent i = new Intent(this,);
            startActivity(i);
            finish();
        }, 5000);

    }
}