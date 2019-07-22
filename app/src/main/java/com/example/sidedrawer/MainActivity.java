package com.example.sidedrawer;

import android.app.FragmentManager;
import android.app.Fragment;
//import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
//import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.subject_one);
        //String[] maths1 = {"Set Theory", "Probablity and Statistics", "Algebra", "Co-ordinate Geometry","Calculus","Trigonometry","Vectors"};
        //ListAdapter listAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,maths1);
        //ListView listView1 = (ListView) findViewById(R.id.suboneList);
        //listView1.setAdapter(listAdapter1);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = null;

        if (id == R.id.nav_subjectOne)
        {
            //transaction.replace(R.id.content_frame,new firstSubjectFragment());
            //transaction.addToBackStack(null);
            fragmentManager.beginTransaction().replace(R.id.content_frame,new firstSubjectFragment()).commit();
            //fragment = new firstSubjectFragment();

        }
        else if (id == R.id.nav_subjectTwo)
        {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new secondSubjectFragment())
                    .commit();

        }
        else if (id == R.id.nav_subjectThree)
        {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new thirdSubjectFragment())
                    .commit();
        }
        else if (id == R.id.nav_subjectFour)
        {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new fourthSubjectFragment())
                    .commit();

        }
        else if (id == R.id.nav_subjectFive)
        {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new fiveSubjectFragment())
                    .commit();

        }
        else if (id == R.id.addOne)
        {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new oneAdditionalFragment())
                    .commit();

        }
        else if (id == R.id.addTwo)
        {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new twoAdditionalFragment())
                    .commit();


        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
