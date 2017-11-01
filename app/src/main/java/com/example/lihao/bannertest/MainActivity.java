package com.example.lihao.bannertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;
//https://github.com/youth5201314/banner
public class MainActivity extends AppCompatActivity {
    private int[] images = {R.drawable.p1,R.drawable.p2,R.drawable.p3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner = (Banner) findViewById(R.id.banner);
//        banner.setImages(images).setImageLoader(new GlideImageLoader()).start();
    }
}
