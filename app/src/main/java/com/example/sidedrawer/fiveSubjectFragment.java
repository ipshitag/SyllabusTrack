package com.example.sidedrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fiveSubjectFragment extends Fragment
{
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        myView = inflater.inflate(R.layout.subject_five,container,false);
        return myView;
    }
}
