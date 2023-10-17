package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dynamic Fragment

        // Get the FragmentManager for managing fragments in the activity.
        FragmentManager manager = getSupportFragmentManager();
        // Start a new fragment transaction.
        FragmentTransaction transaction = manager.beginTransaction();
        // Create an instance of the DetailsFragment.
        DetailsFragment detailsFragment = new DetailsFragment();
        // Create an instance of the ListMenuFragment.
        ListMenuFragment listMenuFragment = new ListMenuFragment();
        // Add the ListMenuFragment to the "listFragment" container in the layout.
        transaction.add(R.id.listFragment, listMenuFragment);
        // Add the DetailsFragment to the "detailsFragment" container in the layout.
        transaction.add(R.id.detailsFragment, detailsFragment);
        // Add the transaction to the back stack so that the user can navigate back to
        // the previous state of fragments when using the back button.
        transaction.addToBackStack(null);
        // Commit the transaction to apply the fragment changes to the activity.
        transaction.commit();
    }
}