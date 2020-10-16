package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListmusicActivity extends AppCompatActivity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    private ImageView imageNext, imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmusic);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("How You Like That","BlackPink",R.raw.how_you_like_that));
        arrayList.add(new Music("Ice Cream","BlackPink, Selena Gomez ",R.raw.ice_cream));
        arrayList.add(new Music("Pretty Savage","BlackPink",R.raw.pretty_savage));
        arrayList.add(new Music("Bet You Wanna (Feat.Cardi B)","BlackPink",R.raw.bet_you_wanna));
        arrayList.add(new Music("Lovesick Girls","BlackPink",R.raw.lovesick_girls));
        arrayList.add(new Music("Crazy Over You","BlackPink",R.raw.crazy_over_you));
        arrayList.add(new Music("Love To Hate Me","BlackPink",R.raw.love_to_hate_me));
        arrayList.add(new Music("You Never Know","BlackPink",R.raw.you_never_know));

        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item,arrayList);
        songList.setAdapter(adapter);

        imageBack =(ImageView) findViewById(R.id.before);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity1();
            }
        });

       imageNext =(ImageView) findViewById(R.id.next);
        imageNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity2();
            }
        });
    }
    public void openLoginActivity1(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openLoginActivity2(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}