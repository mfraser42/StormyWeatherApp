package com.crimson.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.crimson.stormy.R;
import com.crimson.stormy.adapters.DayAdapter;
import com.crimson.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }



}
