package com.rafale.studio.V1.foodplaza.Adaptors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rafale.studio.V1.foodplaza.Domains.CategoryDomain;
import com.rafale.studio.V1.foodplaza.R;

import java.util.ArrayList;

public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.viewHolder> {
    ArrayList<CategoryDomain> categoryDomains;

    //Constructor
    public CategoryAdaptor(ArrayList<CategoryDomain> categoryDomains) {
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_category, parent, false);

        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.CategoryName.setText(categoryDomains.get(position).getTitle());
        String picUrl = "";
        switch (position) {
            case 0: {
                picUrl = "cat_1";
                holder.mainCategoryLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.shape_4_1));
                break;
            }

            case 1: {
                picUrl = "cat_2";
                holder.mainCategoryLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.shape_4_2));
                break;
            }

            case 2: {
                picUrl = "cat_3";
                holder.mainCategoryLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.shape_4_3));
                break;
            }

            case 3: {
                picUrl = "cat_4";
                holder.mainCategoryLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.shape_4_4));
                break;
            }

            case 4: {
                picUrl = "cat_5";
                holder.mainCategoryLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.shape_4_5));
                break;
            }

        }
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl, "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.CategoryPic);
    }

    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView CategoryName;
        ImageView CategoryPic;
        ConstraintLayout mainCategoryLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            CategoryName = itemView.findViewById(R.id.CategoryName);
            CategoryPic = itemView.findViewById(R.id.CategoryPic);
            mainCategoryLayout = itemView.findViewById(R.id.mainCategoryLayout);
        }
    }

}//END
