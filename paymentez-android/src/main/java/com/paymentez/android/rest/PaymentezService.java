package com.paymentez.android.rest;

import com.paymentez.android.rest.model.CardBinResponse;
import com.paymentez.android.rest.model.CreateTokenRequest;
import com.paymentez.android.rest.model.CreateTokenResponse;
import com.paymentez.android.rest.model.GetCardsResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by mmucito on 13/09/17.
 */

public interface PaymentezService {

    @POST("/v2/card/add")
    Call<CreateTokenResponse> createToken(@Body CreateTokenRequest createTokenRequest);

    @GET("/v2/card_bin/{bin}")
    Call<CardBinResponse> cardBin(@Path("bin") String bin);

    @GET("/v2/card/list")
    //Call<CardBinResponse> cardList(@Path("bin") String bin);
    Call<GetCardsResponse> cardList(@Query("uid") String uid);

}
