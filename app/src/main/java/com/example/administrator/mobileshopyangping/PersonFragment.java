package com.example.administrator.mobileshopyangping;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PersonFragment extends BaseFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_person,container,false);
        return(view);
    }
}
