package cd.amateurmobiledev.androidroadmap;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtNom;
    private TextView txtDesc;
    private TextView txtLoc;
    private TextView txtWebSite;
    private TextView txtDate;

    private Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDesc = findViewById(R.id.txtDescription);
        txtLoc = findViewById(R.id.txtLocalisation);
        txtWebSite = findViewById(R.id.txtWebSite);
        txtDate = findViewById(R.id.txtDate);

        btnEdit = findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivityForResult(intent, 15);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 15){
            if (resultCode == 12) {
                txtNom = findViewById(R.id.txtNom);
                String nom = data.getStringExtra("nom");
                txtNom.setText(nom);
            }
        }
    }
}