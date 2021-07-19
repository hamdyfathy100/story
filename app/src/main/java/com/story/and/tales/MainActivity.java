package com.story.and.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.ll);
        layout.setVisibility(View.GONE);
        Network();


    }



    private void Network(){
        ConnectivityManager connectivityManager
                =(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if (networkInfo!=null&&networkInfo.isConnected()==true){

            startActivity(new Intent(this,HomeActivity.class));
            finish();

        }else {

            layout.setVisibility(View.VISIBLE);

        }
    }


}