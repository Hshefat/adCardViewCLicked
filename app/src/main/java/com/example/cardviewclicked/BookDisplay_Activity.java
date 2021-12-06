package com.example.cardviewclicked;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDisplay_Activity extends AppCompatActivity {
    private TextView disTitle, disDescription, disCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_display);

        ActionBar actionBar = getSupportActionBar();

        disTitle = findViewById(R.id.disTitleID);
        disCategory = findViewById(R.id.disCategoryID);
        disDescription = findViewById(R.id.disDiscriptionID);
        img = findViewById(R.id.DisplaybookID);
        //Recevied data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Category = intent.getExtras().getString("Category");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        actionBar.setTitle(Title);

        //setting value
        disTitle.setText(Title);
        disCategory.setText(Category);
        disDescription.setText(Description);
        img.setImageResource(image);
    }
}