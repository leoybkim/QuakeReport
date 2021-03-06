package com.example.android.quakereport;

/**
 * Created by leo on 12/12/16.
 */
public class Earthquake {

    // Create a state for each TextView in earthquake_list_item.xml
    private double mMagnitude;
    private String mLocation;
    private long mTime;
    private String mUrl;

    /**
     * Constructor for Earthquake object
     * @param magnitude
     * @param location
     * @param time
     */
    public Earthquake(double magnitude, String location, long time, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
        mUrl = url;
    }


    // Getter methods
    public double getMagnitude() { return mMagnitude; }

    public String getLocation() { return mLocation; }

    public long getTimeInMilliseconds() { return mTime; }

    public String getUrl() { return mUrl; }
}
