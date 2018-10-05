package org.techtown.a0930_bibly_simply;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyRecyclerViewAdapter_TabFragment2_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<BookInfo> bookInfos = new ArrayList<>();
    //Activity mActivity;
    onBookInfoClickedListener listener;

    public interface onBookInfoClickedListener{
        void startActivity(String title);
    }

    public MyRecyclerViewAdapter_TabFragment2_Adapter(onBookInfoClickedListener listener) {
        //Activity activity,
        //mActivity = activity;
        this.listener = listener;
        bookInfos.add(new BookInfo(R.drawable.dummy_1_1, "dummy_1_1", "person_1_1"));
        bookInfos.add(new BookInfo(R.drawable.dummy_1_2, "dummy_1_2", "person_1_2"));
        bookInfos.add(new BookInfo(R.drawable.dummy_1_3, "dummy_1_3", "person_1_3"));
        bookInfos.add(new BookInfo(R.drawable.dummy_1_4, "dummy_1_4", "person_1_4"));
        bookInfos.add(new BookInfo(R.drawable.dummy_1_5, "dummy_1_5", "person_1_5"));
        bookInfos.add(new BookInfo(R.drawable.dummy_1_6, "dummy_1_6", "person_1_6"));
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //XML 가져오는 부분
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_fragment_2_recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //데이터를 넣어주는 부분. 바인딩하는 부분
        ((ViewHolder) holder).book.setImageResource(bookInfos.get(position).book);
        ((ViewHolder) holder).title.setText(bookInfos.get(position).title);
        ((ViewHolder) holder).author.setText(bookInfos.get(position).author);
    }

    @Override
    public int getItemCount() {
        //카운터
        return bookInfos.size();
    }

    //소스코드 절약해주는 부분 static 넣으면 더 좋음
    //RowCell -> ViewHolder로 바꿔줌
    private class ViewHolder extends RecyclerView.ViewHolder { //bookInfos.get(pos) 때문에 static 없앴음
        ImageView book;
        TextView title;
        TextView author;
        EditText review_text;
        RatingBar review_star;
        Button review_btn;

        public ViewHolder(View view) { //생성자
            super(view);
            book = (ImageView) view.findViewById(R.id.book);
            title = (TextView) view.findViewById(R.id.title);
            author = (TextView) view.findViewById(R.id.author);
            review_text = (EditText) view.findViewById(R.id.review_text);
            review_star = (RatingBar) view.findViewById(R.id.review_star);
            review_btn = (Button) view.findViewById(R.id.review_btn);

            review_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // get position
                    int pos = getAdapterPosition();
                    Intent myIntent;

                    // check if item still exists
                    if(pos != RecyclerView.NO_POSITION){
                        BookInfo clickedDataItem = bookInfos.get(pos);

                        //일단 한줄평, 별점을 토스트 메시지에 띄우긔
                        Toast.makeText(v.getContext(),
                                        title.getText() + " 의 한줄평 : " + review_text.getText() + ", 별점 : " + review_star.getRating(),
                                        Toast.LENGTH_SHORT).show();

                        //
                        listener.startActivity(title.getText().toString());

                        //getActivity, startActivity 오류
                        myIntent = new Intent(mActivity, BookDetailActivity.class);
                        myIntent.putExtra("book", R.drawable.dummy_1_1);
                        myIntent.putExtra("title", "dummy_1_1");
                        myIntent.putExtra("author", "person_1_1");
                        //mActivity.startActivity(myIntent);

                        //한줄평, 별점 저장한 후 해당 데이터 백그라운드 바꾸기
                        //안됨ㅜㅜ
//                        clickedDataItem.setReview(review_text.getText().toString());
//                        clickedDataItem.setRate(review_star.getRating());
//                        v.setBackgroundColor(0xff26abb5);
                    }
                }
            });
        }
    }
}