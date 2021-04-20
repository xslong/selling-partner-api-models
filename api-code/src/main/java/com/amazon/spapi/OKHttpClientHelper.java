package com.amazon.spapi;

import okhttp3.OkHttpClient;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;

public class OKHttpClientHelper {

    public static OkHttpClient.Builder builder(){
        /*
     return    new OkHttpClient.Builder()
                .sslSocketFactory(sslSocketFactory, trustManager)
             */


             return null;
    }

}
