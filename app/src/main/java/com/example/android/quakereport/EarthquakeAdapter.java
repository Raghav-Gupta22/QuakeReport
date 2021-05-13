package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextview = convertView.findViewById(R.id.magnitude);
        magnitudeTextview.setText(currentEarthquake.getMagnitude());

        TextView locationTextView = convertView.findViewById(R.id.location);
        locationTextView.setText(currentEarthquake.getCity());

        TextView dateTextView = convertView.findViewById(R.id.date);
        dateTextView.setText(currentEarthquake.getDate());

        return super.getView(position, convertView, parent);
    }
}
