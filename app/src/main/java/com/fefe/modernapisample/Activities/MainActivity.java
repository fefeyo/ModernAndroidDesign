package com.fefe.modernapisample.Activities;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;

import com.fefe.modernapisample.Modules.AppComponent;
import com.fefe.modernapisample.R;
import com.fefe.modernapisample.databinding.ActivityMainBinding;
import com.fefe.modernapisample.retrofit.SchoolIdol;
import com.fefe.modernapisample.retrofit.SchoolIdolBase;
import com.fefe.modernapisample.retrofit.SchoolIdolListApi;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {
    private ActivityMainBinding binding;

    @Inject
    Context appContext;
    @Inject
    SchoolIdolListApi schoolIdolListApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        schoolIdolListApi.getIdolList(1).enqueue(new Callback<SchoolIdolBase>() {
            @Override
            public void onResponse(Call<SchoolIdolBase> call, Response<SchoolIdolBase> response) {
                List<SchoolIdol> results = response.body().getResults();
                StringBuilder sb = new StringBuilder();
                for(SchoolIdol idol : results) {
                    sb.append(idol.getJapanese_name() + "(" + idol.getAge() + ")");
                    sb.append("\n");
                    sb.append("誕生日：" + idol.getBirthday());
                    sb.append("\n\n");
                }
                binding.text.setText(sb.toString());
            }

            @Override
            public void onFailure(Call<SchoolIdolBase> call, Throwable t) {
                Log.d("error", t.toString());
            }
        });
    }

    @Override
    protected void inject(AppComponent appComponent) {
        appComponent.inject(this);
    }
}
