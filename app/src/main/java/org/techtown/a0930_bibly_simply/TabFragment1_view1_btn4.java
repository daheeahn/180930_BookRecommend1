package org.techtown.a0930_bibly_simply;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabFragment1_view1_btn4 extends Fragment {

    @BindView(R.id.dummy1) ImageView dummy1;
    @BindView(R.id.dummy2) ImageView dummy2;
    @BindView(R.id.dummy3) ImageView dummy3;
    @BindView(R.id.dummy4) ImageView dummy4;
    @BindView(R.id.dummy5) ImageView dummy5;
    @BindView(R.id.dummy6) ImageView dummy6;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.tab_fragment_1_view_1_btn_non_recycle, container, false);
        ButterKnife.bind(this, view);

        //recyclerview //오류
//        Context context = view.getContext();
//        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment1_recyclerview1);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(layoutManager);
//
//        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(3);
//        recyclerView.setAdapter(adapter);

        dummy1.setImageResource(R.drawable.dummy_4_1);
        dummy2.setImageResource(R.drawable.dummy_4_2);
        dummy3.setImageResource(R.drawable.dummy_4_3);
        dummy4.setImageResource(R.drawable.dummy_4_4);
        dummy5.setImageResource(R.drawable.dummy_4_5);
        dummy6.setImageResource(R.drawable.dummy_4_6);

        return view;
    }
}
