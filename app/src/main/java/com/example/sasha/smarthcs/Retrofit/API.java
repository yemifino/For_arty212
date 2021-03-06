package com.example.sasha.smarthcs.Retrofit;

import com.example.sasha.smarthcs.Main_1.Login;
import com.example.sasha.smarthcs.Retrofit.today_cals.today_gas;
import com.example.sasha.smarthcs.Retrofit.today_cals.today_light;
import com.example.sasha.smarthcs.Retrofit.today_cals.today_water;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API {
    @POST("/check_password")
    Call<Reply> login(@Body Login user);

    @POST("/GSV")
    Call<GSV> getResources(@Body POST_GSV GSV );


    @POST("/get_data/{type}")
    Call<ResursePOL> getFullResources(@Body PostData ResursePOL , @Query("type") String type);

    @POST("/hasg")
    Call<has_gas> getGas(@Body POST_GSV has_gas);

    @POST("/hasl")
    Call<has_light> getLight(@Body POST_GSV has_light);

    @POST("/hasw")
    Call<has_water> getWater(@Body POST_GSV has_water);

    @POST("/total")
    Call<has_total> getTotal(@Body POST_GSV has_total);


    @POST("/today_gas")
    Call<today_gas> getToday_gas(@Body POST_GSV today_gas);


    @POST("/today_light")
    Call<today_light> getToday_light(@Body POST_GSV today_gas);

    @POST("/today_water")
    Call<today_water> getToday_water(@Body POST_GSV today_water);

}
