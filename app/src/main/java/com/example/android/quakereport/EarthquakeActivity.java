package com.example.android.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("4.5", "San Francisco", "Dec 12, 2016"));
        earthquakes.add(new Earthquake("4.5", "San Diego", "Dec 1, 2016"));
        earthquakes.add(new Earthquake("4.5", "San Jose", "Dec 2, 2016"));
        earthquakes.add(new Earthquake("6.5", "San Antonio", "Dec 3, 2016"));
        earthquakes.add(new Earthquake("9.5", "San Bruno", "Dec 99, 2016"));
        earthquakes.add(new Earthquake("9.9", "San Mateo", "Dec 4, 2016"));
        earthquakes.add(new Earthquake("6.3", "San Pablo", "Dec 15, 2016"));



        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, earthquakes);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        earthquakeListView.setAdapter(adapter);
    }
}
