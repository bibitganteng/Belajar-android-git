package com.example.bibit_aries.bibitaries;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void tampilfragment1(View view) {
        android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame,new BlankFragment() );
        ft.commit();
    }

    public void tampilfragment2(View view) {
        android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame,new BlankFragment2() );
        ft.commit();
    }
}
