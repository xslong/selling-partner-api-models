package com.amazon.SellingPartnerAPIAA;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * LWA Authorization Signer
 */
public class LWAAuthorizationSigner {
    private static final String SIGNED_ACCESS_TOKEN_HEADER_NAME = "x-amz-access-token";

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.PACKAGE)
    private LWAClient lwaClient;

    private LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta;

    private void buildLWAAccessTokenRequestMeta(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
        String tokenRequestGrantType;
        if (!lwaAuthorizationCredentials.getScopes().isEmpty()) {
            tokenRequestGrantType = "client_credentials";
        } else {
            tokenRequestGrantType = "refresh_token";
        }

        lwaAccessTokenRequestMeta = LWAAccessTokenRequestMeta.builder()
                .clientId(lwaAuthorizationCredentials.getClientId())
                .clientSecret(lwaAuthorizationCredentials.getClientSecret())
                .refreshToken(lwaAuthorizationCredentials.getRefreshToken())
                .grantType(tokenRequestGrantType).scopes(lwaAuthorizationCredentials.getScopes())
                .build();
    }

     /**
     *
     * @param lwaAuthorizationCredentials LWA Authorization Credentials for token exchange
     */
    public LWAAuthorizationSigner(OkHttpClient okHttpClient, LWAAuthorizationCredentials lwaAuthorizationCredentials) {

        lwaClient = new LWAClient(lwaAuthorizationCredentials.getEndpoint(), okHttpClient);

        buildLWAAccessTokenRequestMeta(lwaAuthorizationCredentials);

    }

    /**
    *
    * Overloaded Constructor @param lwaAuthorizationCredentials LWA Authorization Credentials for token exchange
    * and LWAAccessTokenCache
    */
    public LWAAuthorizationSigner(OkHttpClient okHttpClient, LWAAuthorizationCredentials lwaAuthorizationCredentials,
           LWAAccessTokenCache lwaAccessTokenCache) {

       lwaClient = new LWAClient(lwaAuthorizationCredentials.getEndpoint(), okHttpClient);
       lwaClient.setLWAAccessTokenCache(lwaAccessTokenCache);

       buildLWAAccessTokenRequestMeta(lwaAuthorizationCredentials);

   }

    /**
     *  Signs a Request with an LWA Access Token
     * @param originalRequest Request to sign (treated as immutable)
     * @return Copy of originalRequest with LWA signature
     */
    public Request sign(Request originalRequest) {
        String accessToken = lwaClient.getAccessToken(lwaAccessTokenRequestMeta);

        return originalRequest.newBuilder()
                .addHeader(SIGNED_ACCESS_TOKEN_HEADER_NAME, accessToken)
                .build();
    }
}
