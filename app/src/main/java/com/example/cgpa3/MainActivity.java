package com.example.cgpa3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
private DrawerLayout drawerLayout;
 Button launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_layout);
        Toolbar toolbar=findViewById(R.id.toolbarid);
        NavigationView navigationView=findViewById(R.id.navigation_viewid);
        setSupportActionBar(toolbar);
        drawerLayout=findViewById(R.id.nav_drawer_layoutid);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,
                toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.Maincontainer,new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.homeid);
        }

////////

        //launcher=findViewById(R.id.launchbutton);
        //launcher.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if (menuItem.getItemId()==R.id.homeid){
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.Maincontainer,new HomeFragment()).commit();
            setTitle(menuItem.getTitle());
        }
        if (menuItem.getItemId()==R.id.calculatorid){
            getSupportFragmentManager().beginTransaction().
                   replace(R.id.Maincontainer,new CalculatorFragment()).commit();
//            Intent intent=new Intent(MainActivity.this,CalculateActivity.class);
//            startActivity(intent);



        }
        if (menuItem.getItemId()==R.id.gpachartid){
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.Maincontainer,new GpaChartFragment()).commit();
            setTitle(menuItem.getTitle());
        }

        if (menuItem.getItemId()==R.id.shareid){

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="CGPA Calculator";
            String body="This is a awesome app to calculated University level CGPA";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share with"));

        }
        if (menuItem.getItemId()==R.id.feedbackid){
            Toast.makeText(this,"You clicked on share",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,FeedbackActivity.class);
            startActivity(intent);
        }
        if (menuItem.getItemId()==R.id.appid){
            Intent intent=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(intent);
        }
        if (menuItem.getItemId()==R.id.developerid){
            Intent intent=new Intent(MainActivity.this,DeveloperActivity.class);
            startActivity(intent);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.exitinmenu){
            super.onBackPressed();
        }
        if (item.getItemId()==R.id.aboutinmenu){

            Intent intent=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}

