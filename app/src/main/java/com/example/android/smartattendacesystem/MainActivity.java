package com.example.android.smartattendacesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.Settings_id:
                Toast.makeText(this,"settings clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Users_id:
                Toast.makeText(this, "Users clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Class_id:
                Toast.makeText(this,"class clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.AboutUs_id:
                Toast.makeText(this,"about us cliked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search_id:
                Toast.makeText(this, "search icon clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cart_id:
                Toast.makeText(this, "cart icon clicked", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
        finish();
    }
        return super.onOptionsItemSelected(item);
    }
}

