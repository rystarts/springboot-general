package com.rystars.general.httpclient.bean;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class HttpClientUtil {

    private HttpClientUtil() {}

    static CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

    public static String sentHttpGet(String url, List<NameValuePair> nvps) throws IOException, URISyntaxException {
        HttpGet httpGet = new HttpGet();
        /**
         * URIBuilder使用了建造者模式
         */
        URI uri = new URIBuilder(url).addParameters(nvps).build();
        httpGet.setURI(uri);
        CloseableHttpResponse execute = closeableHttpClient.execute(httpGet);
        HttpEntity entity = execute.getEntity();
        return EntityUtils.toString(entity,"utf-8");
    }

    public static String sentHttpPost(String url , JSONObject jsonObject) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        HttpEntity httpEntity = new StringEntity(jsonObject.toJSONString());
        httpPost.setEntity(httpEntity);
        CloseableHttpResponse execute = closeableHttpClient.execute(httpPost);
        HttpEntity entity = execute.getEntity();
        return EntityUtils.toString(entity,"utf-8");
    }

}
