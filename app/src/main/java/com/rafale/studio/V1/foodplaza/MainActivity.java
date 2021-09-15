package com.rafale.studio.V1.foodplaza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.rafale.studio.V1.foodplaza.Adaptors.CategoryAdaptor;
import com.rafale.studio.V1.foodplaza.Domains.CategoryDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     * Design & Developed by Kuldeep Sahu.
     * E-mail: sahukuldeep912001@gmail.com
     * http://skywarrior09.gq
     */

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();

    }// @Override

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.categoty_recycleview_main_ac);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Burgers", "cat_1"));
        categoryList.add(new CategoryDomain("Pizzas", "cat_2"));
        categoryList.add(new CategoryDomain("Hotdogs", "cat_3"));
        categoryList.add(new CategoryDomain("Noodles", "cat_4"));
        categoryList.add(new CategoryDomain("Shakes", "cat_5"));

        adapter = new CategoryAdaptor(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }

}// END