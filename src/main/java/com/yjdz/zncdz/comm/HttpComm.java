package com.yjdz.zncdz.comm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public final class HttpComm {

    private static CloseableHttpClient closeableHttpClient = null;
    private static CloseableHttpResponse response = null;


    public static void openHttpClient(){
        closeableHttpClient = HttpClients.createDefault();
    }

    public static JSONObject sendHttpGet(String url) throws IOException {

        openHttpClient();
        HttpGet httpGet= new HttpGet(url);
        httpGet.setHeader("Content-Type","application/json");
        response = closeableHttpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return JSON.parseObject(EntityUtils.toString(entity));

    }

    public static void closeConn() throws IOException {
        closeableHttpClient.close();
        response.close();
    }

}
