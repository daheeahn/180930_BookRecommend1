package org.techtown.a0930_bibly_simply;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookDetailActivity extends AppCompatActivity {

    @BindView(R.id.book) ImageView book;
    @BindView(R.id.title) TextView title;
    @BindView(R.id.author) TextView author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();

//        Bitmap bitmap = (Bitmap) intent.getExtras().get("book");
//        book.setImageBitmap(bitmap);
        book.setImageResource((Integer) intent.getExtras().get("book"));
        title.setText(intent.getStringExtra("title"));
        author.setText(intent.getStringExtra("author"));
    }
}
