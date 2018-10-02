package org.techtown.a0930_bibly_simply;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TabFragment2 extends Fragment {

//    @BindView(R.id.book) ImageView book;
//    @BindView(R.id.title) TextView title;
//    @BindView(R.id.author) TextView author;
//    @BindView(R.id.review_text) EditText review_text;
//    @BindView(R.id.review_star) RatingBar review_star;
//    @BindView(R.id.review_btn) Button review_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_2, container, false);
        ButterKnife.bind(this, view);

        //recyclerview
        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment2_recyclerview1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        MyRecyclerViewAdapter_TabFragment2 adapter = new MyRecyclerViewAdapter_TabFragment2();
        recyclerView.setAdapter(adapter);

        return view;
    }

//    @OnClick(R.id.review_btn) void click(View v) {
//        //평가완료 버튼 누르면 해당 책 상세정보로 가기
//        Intent intent = new Intent(getActivity(), BookDetailActivity.class);
//        intent.putExtra("book", book.getId());
//        intent.putExtra("title", title.getText().toString());
//        intent.putExtra("author", author.getText().toString());
//        startActivity(intent);
//    }
}
