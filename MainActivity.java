package com.example.questionapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText searchBox;
    Button searchBtn;
    ImageView questionImage;

    @Override
    protected void onCreate(Bundle savedInstanceState;) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ربط العناصر بتصميم الشاشة
        searchBox = findViewById(R.id.searchBox);
        searchBtn = findViewById(R.id.searchBtn);
        questionImage = findViewById(R.id.questionImage);

        // برمجة زر البحث
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = searchBox.getText().toString().trim();

                // شرط البحث وعرض الصورة المناسبة
                if (query.contains("السؤال الأول") || query.contains("كلمة مفتاحية")) {
                    // عرض الصورة الأولى المخزنة في مجلد res/drawable
                    questionImage.setImageResource(R.drawable.q1);
                } 
                else if (query.contains("السؤال الثاني")) {
                    questionImage.setImageResource(R.drawable.q2);
                } 
                else {
                    Toast.makeText(MainActivity.this, "عذراً، لم يتم العثور على السؤال", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
