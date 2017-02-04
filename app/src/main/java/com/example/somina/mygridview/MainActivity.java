package com.example.somina.mygridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    GridView gridView;

    Integer[] imageIDs = {
            R.drawable.gingerdroid_0, R.drawable.cupcake, R.drawable.icecream,
            R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop
    };

    String[] inames={"GingerBread","Cupcake","Ice-cream Sandwich","Jellybean","Kitkat","Lollipop"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, inames, imageIDs);
        gridView=(GridView)findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +inames[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}