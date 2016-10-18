package com.example.dam2.fragmenttabhost;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

public class FragmentPestanya1 extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.pestanya1_layout,container,false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        Resources res = getResources();
        tv.setText(res.getString(R.string.eti_tab1));
        return v;
    }
}
