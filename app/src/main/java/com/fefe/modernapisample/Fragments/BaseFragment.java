package com.fefe.modernapisample.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fefe.modernapisample.MainApplication;
import com.fefe.modernapisample.Modules.AppComponent;
import com.fefe.modernapisample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {


    public BaseFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject(MainApplication.appComponent());
    }

    protected abstract void inject(AppComponent appComponent);
}
