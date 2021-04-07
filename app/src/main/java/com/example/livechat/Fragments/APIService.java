package com.example.livechat.Fragments;

import com.example.livechat.Notifications.MyResponse;
import com.example.livechat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers (
        {
            "Content-Type:application/json",
            "Authorization:key=AAAA_SDlK7E:APA91bE4p5C8PieCIhAASkEuhD-vcROOqOhrIRk0xh89Pwo2CPL2aEJ6f7I4D-IScRfh8PV7POTioERapHD1UsgsK1xA2_cvaNe1N7Q-3bCRJsVzxMPVVzvmRupvb6iHLEBVnrlpuniq\t\n"

        }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
