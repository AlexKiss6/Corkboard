package com.example.alex.fragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alex.corkboard.R;
import com.example.alex.fragments.events.FacultyEventsFragment;

/**
 * Created by Alex on 3/5/2016.
 */
public class GalleryFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        Button group1Button = (Button) rootView.findViewById(R.id.group1Button);
        Button group2Button = (Button) rootView.findViewById(R.id.group2Button);
        Button group3Button = (Button) rootView.findViewById(R.id.group3Button);
        Button group4Button = (Button) rootView.findViewById(R.id.group4Button);
        Button group5Button = (Button) rootView.findViewById(R.id.group5Button);
        Button group6Button = (Button) rootView.findViewById(R.id.group6Button);
        Button group7Button = (Button) rootView.findViewById(R.id.group7Button);
        Button group8Button = (Button) rootView.findViewById(R.id.group8Button);
        Button group9Button = (Button) rootView.findViewById(R.id.group9Button);

        group1Button.setOnClickListener(this);
        group2Button.setOnClickListener(this);
        group3Button.setOnClickListener(this);
        group4Button.setOnClickListener(this);
        group5Button.setOnClickListener(this);
        group6Button.setOnClickListener(this);
        group7Button.setOnClickListener(this);
        group8Button.setOnClickListener(this);
        group9Button.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.group1Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group2Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group3Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group4Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group5Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group6Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group7Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group8Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;

            case R.id.group9Button:
                fragment = new FacultyEventsFragment();
                replaceFragment(fragment);
                break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
