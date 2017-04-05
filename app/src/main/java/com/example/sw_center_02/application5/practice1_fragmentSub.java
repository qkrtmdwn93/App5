package com.example.sw_center_02.application5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by SOMN on 2017-04-05.
 */

public class practice1_fragmentSub extends android.support.v4.app.Fragment{
    public practice1_fragmentSub(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.subfragment, container, false);
    }
}
