package com.example.android.quakereport;

/**
 * Created by leo on 12/12/16.
 */
public class Earthquake {

    // Create a state for each TextView in earthquake_list_item.xml
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Constructor for Earthquake object
     * @param magnitude
     * @param location
     * @param date
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }


    // Getter methods
    public String getMagnitude() { return mMagnitude; }

    public String getLocation() { return mLocation; }

    public String getDate() { return mDate; }
}
