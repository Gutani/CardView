package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.Adapter;
import com.example.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewHolder mViewHolder = new ViewHolder();
    private List<Post> posts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHolder.recyclerView = findViewById(R.id.recyclerView);

        //Layout
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);

        mViewHolder.recyclerView.setLayoutManager(layoutManager);

        //CREATING THE POSTS
        this.preparePostGeneratingRandomly();
        //Adapter
        Adapter adapter = new Adapter(posts);
        mViewHolder.recyclerView.setAdapter(adapter);
    }
    public void preparePostGeneratingRandomly(){
        Post post = new Post("Testing 1", "Yehs", R.drawable.imagem2);
        this.posts.add(post);

        post = new Post("Testing 2", "Yehs", R.drawable.imagem2);
        this.posts.add(post);
        post = new Post("Testing 3", "Yehs", R.drawable.imagem3);
        this.posts.add(post);
        post = new Post("Testing 4", "Yehs", R.drawable.imagem4);
        this.posts.add(post);
        post = new Post("Testing 5", "Yehs", R.drawable.imagem4);
        this.posts.add(post);
        post = new Post("Testing 6", "Yehs", R.drawable.imagem2);
        this.posts.add(post);
        post = new Post("Testing 7", "Yehs", R.drawable.imagem1);
        this.posts.add(post);
        post = new Post("Testing 8", "Yehs", R.drawable.imagem3);
        this.posts.add(post);



    }

    public static class ViewHolder{
        RecyclerView recyclerView;
    }
}