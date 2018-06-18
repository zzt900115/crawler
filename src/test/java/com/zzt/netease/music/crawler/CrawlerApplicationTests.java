package com.zzt.netease.music.crawler;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrawlerApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String args [ ]) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://music.163.com/api/song/detail/?id=210049&ids=[210049]")
                .get()
                .build();

         Response response =  client.newCall(request).execute();
         String result = response.body().string();
        System.out.println(response.isSuccessful());
         if(response.isSuccessful()){
             System.out.println(result);
         }

    }
}
