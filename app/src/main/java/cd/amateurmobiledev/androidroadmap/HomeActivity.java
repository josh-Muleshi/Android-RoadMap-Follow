package cd.amateurmobiledev.androidroadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText edtNom;
    private EditText edtDesc;
    private EditText edtLoc;
    private EditText edtWebSite;
    private EditText edtDate;

    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        edtNom = findViewById(R.id.edtNom);
        btnSave = findViewById(R.id.save);

        btnSave.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                 intent.putExtra("nom", edtNom.getText().toString());
                 startActivity(intent);
             }
        });
    }
}