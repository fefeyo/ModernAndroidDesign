package com.fefe.modernapisample.Fragments;


import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fefe.modernapisample.Modules.AppComponent;
import com.fefe.modernapisample.R;
import com.fefe.modernapisample.databinding.FragmentMainBinding;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment {
    private FragmentMainBinding binding;

    public MainFragment() {}

    @Inject
    Context appContext;

    @Override
    protected void inject(AppComponent appComponent) {
        appComponent.inject(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        return binding.getRoot();
    }

}
