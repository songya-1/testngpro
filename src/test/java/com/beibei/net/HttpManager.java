package com.beibei.net;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class HttpManager {

    private static OkHttpClient sClient;

    private static OkHttpClient getClient() {
        if (sClient == null) {
            synchronized (HttpManager.class) {
                if (sClient == null) {
                    sClient = new OkHttpClient()
                            .newBuilder()
                            .build();
                }
            }
        }
        return sClient;
    }

    public static String sendRequest(String url) {
        String result = "";
        try {
            Request request = new Request.Builder().url(url).get().build();
            Response response = getClient().newCall(request).execute();
            if (response.isSuccessful()) {
                ResponseBody responseBody = response.body();
                result = responseBody.string();
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = "";
        }
        return result;
    }
}
