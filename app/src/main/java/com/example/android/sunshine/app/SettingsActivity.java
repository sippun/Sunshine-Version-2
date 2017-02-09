package com.example.android.sunshine.app;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Joel on 2/9/2017.
 */

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display fragment as main content
//        getFragmentManager().beginTransaction()
//                .replace(R.id.content, new SettingsFragment())
//                .commit();
    }

    public static class SettingsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load preferences from XML resource
//            TODO: Add preferences
//            addPreferencesFromResource(R.);
        }
    }
}