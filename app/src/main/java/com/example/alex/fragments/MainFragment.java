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
import com.example.alex.fragments.groups.ClubsGroupsFragment;
import com.example.alex.fragments.groups.FacultyGroupsFragment;
import com.example.alex.fragments.groups.SubscriptionsFragment;


/**
 * Created by Alex on 3/5/2016.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button mySubsButton = (Button) rootView.findViewById(R.id.mySubsButton);
        Button facultyButton = (Button) rootView.findViewById(R.id.facultyButton);
        Button clubsButton = (Button) rootView.findViewById(R.id.clubsButton);

        mySubsButton.setOnClickListener(this);
        facultyButton.setOnClickListener(this);
        clubsButton.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.mySubsButton:
                fragment = new SubscriptionsFragment();
                replaceFragment(fragment);
                break;

            case R.id.facultyButton:
                fragment = new FacultyGroupsFragment();
                replaceFragment(fragment);
                break;

            case R.id.clubsButton:
                fragment = new ClubsGroupsFragment();
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
