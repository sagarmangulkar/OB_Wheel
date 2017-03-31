package adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import contracts.ObFragments;
import fragments.AboutFragment;
import fragments.DisclaimerFragment;
import fragments.HomeFragment;
import fragments.MoreAppsFragment;
import fragments.ReferencesFragment;

/**
 * Created by MacBookPro on 3/30/17.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private List<ObFragments> obFragmentsList;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        obFragmentsList = new ArrayList<>();
        obFragmentsList.add(new HomeFragment());
        obFragmentsList.add(new DisclaimerFragment());
        obFragmentsList.add(new AboutFragment());
        obFragmentsList.add(new ReferencesFragment());
        obFragmentsList.add(new MoreAppsFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return (Fragment) obFragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return obFragmentsList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return obFragmentsList.get(position).getTitle();
    }
}
