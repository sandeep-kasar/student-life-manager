package com.studentlifemanager.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studentlifemanager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NovFragment extends JanFragment {


    public NovFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jan, container, false);

        setUpView(view, 11);

        return view;

    }

}
