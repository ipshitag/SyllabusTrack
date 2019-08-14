package com.example.sidedrawer;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import static android.content.Context.MODE_PRIVATE;

public class firstSubjectFragment extends Fragment
{
    public Context mContext;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        myView = inflater.inflate(R.layout.subject_one,container,false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.subject_one, null);
        CheckBox checkBox1 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) root.findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) root.findViewById(R.id.checkbox3);
        CheckBox checkBox4 = (CheckBox) root.findViewById(R.id.checkbox4);
        CheckBox checkBox5 = (CheckBox) root.findViewById(R.id.checkbox5);
        CheckBox checkBox6 = (CheckBox) root.findViewById(R.id.checkbox6);
        CheckBox checkBox7 = (CheckBox) root.findViewById(R.id.checkbox7);




        return root;

    }

}
