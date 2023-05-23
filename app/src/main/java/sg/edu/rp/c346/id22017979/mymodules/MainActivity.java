package sg.edu.rp.c346.id22017979.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346,tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("module","C346");
                i.putExtra("name","Android Programming");
                i.putExtra("year","2020");
                i.putExtra("sem","1");
                i.putExtra("credit","4");
                i.putExtra("venue","W66M");
                startActivity(i);

            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("module","C349");
                i.putExtra("name","iPad Programming");
                i.putExtra("year","2020");
                i.putExtra("sem","1");
                i.putExtra("credit","4");
                i.putExtra("venue","W64P");
                startActivity(i);

            }
        });

    }
}