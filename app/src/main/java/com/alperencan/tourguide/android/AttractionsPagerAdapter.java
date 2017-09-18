package com.alperencan.tourguide.android;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link AttractionsPagerAdapter} is a {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class AttractionsPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public AttractionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return AttractionsFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.attraction_hotels);
            case 1:
                return context.getString(R.string.attraction_malls);
            case 2:
                return context.getString(R.string.attraction_restaurants);
            case 3:
                return context.getString(R.string.attraction_historical_sites);
        }
        return null;
    }
}
