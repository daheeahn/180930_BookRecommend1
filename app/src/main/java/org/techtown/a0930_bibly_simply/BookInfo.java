package org.techtown.a0930_bibly_simply;

import android.media.Image;
import android.widget.ImageView;

public class BookInfo {
    public int book; //책표지
    public String title;
    public String author;
    public String review;
    public float rate; //평점

    public BookInfo(int book) {
        this(book, "", "");
    }

    public BookInfo(int book, String title, String author) {
        this.book = book;
        this.title = title;
        this.author = author;
        this.review = "";
        this.rate = 0;
    }

}
