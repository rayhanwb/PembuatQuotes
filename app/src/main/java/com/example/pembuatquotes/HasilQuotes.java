package com.example.pembuatquotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.widget.TextView;


public class HasilQuotes extends AppCompatActivity {

    TextView infoquotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_quotes);

       infoquotes = findViewById(R.id.hasilQuotes);

       Intent intent = getIntent();
        String getQuotes = intent.getStringExtra("quotes");
        String getAuthor = intent.getStringExtra("author");

        infoquotes.setText("\""+getQuotes+"\" -"+getAuthor);
    }
}