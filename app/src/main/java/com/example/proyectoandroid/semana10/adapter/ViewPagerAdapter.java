package com.example.proyectoandroid.semana10.adapter;

import static com.example.proyectoandroid.semana10.TabActivity.PRIMER_FRAGMENT;
import static com.example.proyectoandroid.semana10.TabActivity.SEGUNDO_FRAGMENT;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.proyectoandroid.semana10.fragments.PrimerFragment;
import com.example.proyectoandroid.semana10.fragments.SegundoFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    // numero de tabs
    private final int numbreOfTabs;


    public ViewPagerAdapter(FragmentManager fm, int numbreOfTabs) {
        super(fm);
        this.numbreOfTabs = numbreOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        //Depediendo del la posicion
        //Se laza en cada swipe o click
        switch (position) {
            case PRIMER_FRAGMENT:
                return new PrimerFragment();
            case SEGUNDO_FRAGMENT:
                return new SegundoFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numbreOfTabs;
    }
}
