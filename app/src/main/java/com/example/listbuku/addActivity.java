package com.example.listbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addActivity extends AppCompatActivity {
    EditText title_input,author_input,pages_input;
    Button add_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        pages_input = findViewById(R.id.pages_input);
        add_button = findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper db = new MyDatabaseHelper(addActivity.this);
            db.addBook(title_input.getText().toString().trim(),author_input.getText().toString().trim(),
                       Integer.valueOf(pages_input.getText().toString().trim()));

                System.out.println(title_input.getText().toString().trim());
            }
        });


//        add_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////               MyDatabaseHelper db = new MyDatabaseHelper(addActivity.this);
////               db.addBook(title_input.getText().toString(),author_input.getText().toString().trim(),
////                       Integer.valueOf(pages_input.getText().toString().trim()));
//
//            }
//        });
    }
}