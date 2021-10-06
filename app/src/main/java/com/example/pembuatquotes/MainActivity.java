package com.example.pembuatquotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText  quotes, author;
    Button  submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quotes = findViewById(R.id.isiQuotes);
        author = findViewById(R.id.isiPenulis);
        submit = findViewById(R.id.submitBtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getQuotes = quotes.getText().toString();
                String getAuthor = author.getText().toString();

                Intent intent = new Intent(MainActivity.this, HasilQuotes.class);
                intent.putExtra("quotes",getQuotes);
                intent.putExtra("author",getAuthor);
                startActivity(intent);
            }
        });

    }
}