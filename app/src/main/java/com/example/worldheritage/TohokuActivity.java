package com.example.worldheritage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

//extends AppCompatActivityをコピー忘れずに
public class TohokuActivity extends AppCompatActivity {

    //近畿地方の画面表示
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tohoku);
    }

    //地図連携メソッド
    public void button1(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_hokkaido);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }

    public void button2(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_aomori);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }

    public void button3(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_iwate);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }

    public void button4(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_miyagi);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }

    public void button5(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_akita);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }

    public void button6(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_yamagata);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }

    public void button7(View view) {
        //文字列取得
        Resources res = getResources();
        String address = res.getString(R.string.map_hukushima);
        //地図インテント
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=" + address));
        startActivity(intent);
    }



}