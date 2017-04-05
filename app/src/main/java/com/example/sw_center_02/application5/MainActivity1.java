package com.example.sw_center_02.application5;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {
    Button btn1,btn2;
    boolean isMainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        final Practice1_fragment mainfragment = new Practice1_fragment();
        final practice1_fragmentSub subfragment = new practice1_fragmentSub();
        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentA, mainfragment);
        fragmentTransaction.commit();

        btn1 = (Button)mainfragment.getFragmentManager().findViewById(R.id.switch_second);
        btn2 = (Button)findViewById(R.id.switch_first);
        isMainFragment = false;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.replace(R.id.fragment, subfragment);
                fragmentTransaction.commit();
                isMainFragment = true;
            }
        });
    /*
            if(isMainFragment) {
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentTransaction.replace(R.id.fragment, mainfragment);
                    fragmentTransaction.commit();
                    isMainFragment = false;
                }
            });
        }*/

        }
    }

