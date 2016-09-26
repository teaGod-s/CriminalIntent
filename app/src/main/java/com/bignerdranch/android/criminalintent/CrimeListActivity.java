package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by teaGod on 2016/9/19.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
