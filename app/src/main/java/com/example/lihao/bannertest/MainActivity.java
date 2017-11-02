package com.example.lihao.bannertest;

import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

//https://github.com/youth5201314/banner
public class MainActivity extends AppCompatActivity {
    private Integer[] images = {R.drawable.p1,R.drawable.p2,R.drawable.p3};
    private String[] pictures = {"asset:///p1.jpg","asset:///p2.jpg","asset:///p3.jpg"};
    private List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringList.add("http://img1.imgtn.bdimg.com/it/u=3191256922,1392369155&fm=214&gp=0.jpg");
        stringList.add("http://a3.topitme.com/1/21/79/1128833621e7779211o.jpg");
        stringList.add("http://img1.50tu.com/meinv/xinggan/2013-11-16/e65e7cd83f37eed87067299266152807.jpg");
        stringList.add("http://pic12.nipic.com/20101031/4243103_103818169000_2.jpg");
        stringList.add("http://img1.imgtn.bdimg.com/it/u=4225722360,1367332860&fm=214&gp=0.jpg");
        Banner banner = (Banner) findViewById(R.id.banner);
        banner.setImages(stringList).setImageLoader(new GlideImageLoader()).start();

    }
}
