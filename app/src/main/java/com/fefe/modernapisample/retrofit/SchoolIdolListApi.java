package com.fefe.modernapisample.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by fefe on 2017/01/17.
 */

public interface SchoolIdolListApi {
    @GET("api/idols")
    Call<SchoolIdolBase> getIdolList(@Query("page") int page);
}
