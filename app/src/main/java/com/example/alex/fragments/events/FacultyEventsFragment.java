package com.example.alex.fragments.events;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alex.corkboard.EventDetailsActivity;
import com.example.alex.corkboard.R;

/**
 * Created by Alex on 3/5/2016.
 */
public class FacultyEventsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_faculty_events, container, false);

        // begin buttons to go to event details activity
        Button group1Button = (Button) rootView.findViewById(R.id.group1Button);
        group1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group2Button = (Button) rootView.findViewById(R.id.group2Button);
        group2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group3Button = (Button) rootView.findViewById(R.id.group3Button);
        group3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group4Button = (Button) rootView.findViewById(R.id.group4Button);
        group4Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group5Button = (Button) rootView.findViewById(R.id.group5Button);
        group5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group6Button = (Button) rootView.findViewById(R.id.group6Button);
        group6Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group7Button = (Button) rootView.findViewById(R.id.group7Button);
        group7Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group8Button = (Button) rootView.findViewById(R.id.group8Button);
        group8Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button group9Button = (Button) rootView.findViewById(R.id.group9Button);
        group9Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailsActivity.class);
                startActivity(intent);
            }
        });
        // end buttons to go to event details activity

        return rootView;
    }

}
