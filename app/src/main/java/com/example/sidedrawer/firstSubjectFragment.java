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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.subject_one, container, false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.subject_one, null);
        CheckBox checkBox1 = (CheckBox) root.findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) root.findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) root.findViewById(R.id.checkbox3);
        CheckBox checkBox4 = (CheckBox) root.findViewById(R.id.checkbox4);
        CheckBox checkBox5 = (CheckBox) root.findViewById(R.id.checkbox5);
        CheckBox checkBox6 = (CheckBox) root.findViewById(R.id.checkbox6);
        CheckBox checkBox7 = (CheckBox) root.findViewById(R.id.checkbox7);

         boolean checked1 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);
        checkBox1.setChecked(checked1);

        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);

        boolean checked3 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);

        boolean checked4 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);

        boolean checked5 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);

        boolean checked6 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);

        boolean checked7 = PreferenceManager.getDefaultSharedPreferences(this.getActivity())
                .getBoolean("checkBox1", false);

        return root;

    }

    public void onCheckboxClicked(View view)
    {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        switch (myView.getId())
        {
            case R.id.checkBox1:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;

            case R.id.checkbox2:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;

            case R.id.checkbox3:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;

            case R.id.checkbox4:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;

            case R.id.checkbox5:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;

            case R.id.checkbox6:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;

            case R.id.checkbox7:
                PreferenceManager.getDefaultSharedPreferences(this.getActivity()).edit()
                        .putBoolean("checkBox1", checked).commit();
                break;
        }

    }


    }


