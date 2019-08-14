package com.example.sidedrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

public class firstSubjectFragment extends Fragment
{
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        myView = inflater.inflate(R.layout.subject_one,container,false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.subject_one, null);
        CheckBox checkBox1 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox3 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox4 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox5 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox6 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox7 = (CheckBox) root.findViewById(R.id.checkBox1);
        return root;

    }
}
