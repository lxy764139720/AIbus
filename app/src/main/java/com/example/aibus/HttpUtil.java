package com.example.aibus;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    /**
     * 多线程异步请求方法
     *
     * @param address url
     * @param callback 回调
     */
    public static void sendRequestWithOkhttp(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        //根据url创建request对象
        Request request = new Request.Builder().url(address).build();
        //根据request创建匿名Call对象，调用其异步请求方法enqueue()
        client.newCall(request).enqueue(callback);
    }
}
