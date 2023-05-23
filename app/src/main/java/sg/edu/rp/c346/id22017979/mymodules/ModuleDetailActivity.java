package sg.edu.rp.c346.id22017979.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvInfo;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvInfo = findViewById(R.id.textView);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String module = intentReceived.getStringExtra("module");
        String name = intentReceived.getStringExtra("name");
        String year = intentReceived.getStringExtra("year");
        String sem = intentReceived.getStringExtra("sem");
        String credit = intentReceived.getStringExtra("credit");
        String venue = intentReceived.getStringExtra("venue");
        tvInfo.setText("Module Code: " + module + "\nModule Name: " + name + "\nAcademic Year: " + year
                        + "\nSemester: " + sem + "\nModule Credit: " + credit + "\nVenue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}