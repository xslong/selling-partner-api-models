package com.amazon.SellingPartnerAPIAA;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import okhttp3.*;

import java.io.IOException;

public class LWAExchangeRefreshToken {


    /**
     * 使用LWA授权交换LWA refresh token
     *
     * @param lwaClientId
     * @param lwaclientSecret
     * @param code
     */
    public static Result exchange(OkHttpClient httpClient, String endpoint, String lwaClientId, String lwaclientSecret, String code) {
        RequestBody formBody = new FormBody.Builder()
                .add("grant_type", "authorization_code")
                .add("code", code)
                .add("redirect_uri", "")
                .add("client_id", lwaClientId)
                .add("client_secret", lwaclientSecret)
                .build();

        Request request = new Request.Builder()
                .url(endpoint)  //https://api.amazon.com/auth/o2/token
                .post(formBody)
                .build();

        Call call = httpClient.newCall(request);
        try {
            Response response = call.execute();
            if (response.isSuccessful()) {
                Gson gson = new Gson();
                ResponseBody body = response.body();
                if (body != null) {
                    Result result = gson.fromJson(body.toString(), Result.class);
                    return result;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        throw new RuntimeException("交换 LWA refresh token失败");
    }

    @Data
    public static class Result {

        @SerializedName("access_token")
        private String access_token;

        @SerializedName("token_type")
        private String tokenType;

        @SerializedName("expires_in")
        private long expiresIn;

        @SerializedName("refresh_token")
        private String refreshToken;
    }


}
