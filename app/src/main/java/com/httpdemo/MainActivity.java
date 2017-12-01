package com.httpdemo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.http.AjaxHttp;
import com.httpdemo.json.JsonAppUpdateInfo;
import com.httpdemo.json.PledgePayInfo;
import com.httpdemo.util.DateUtil;
import com.httpdemo.util.StringUtil;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    private AjaxHttp ajaxHttp;
    private Gson gson = new Gson();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        ajaxHttp = new AjaxHttp();
        init();
    }

    private void init() {
        findViewById(R.id.http).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String data = "123456789";
                    String dataEncode = "";
                    try {
                        dataEncode = URLEncoder.encode(data, "UTF-8");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Map<String, Object> params = new HashMap<String, Object>();
                    params.put(String.format("data"), dataEncode);

                    Log.e(TAG, "params =" + params.toString());
                    String url = "https://www.baidu.com/";
                    ajaxHttp.httpPost(MainActivity.this, url, params.toString(), new Handler.Callback() {
                        @Override
                        public boolean handleMessage(Message msg) {
                            String result = (String) msg.obj;
                            Log.e(TAG, "result=" + result);
                            textView.setText(result);
                            return false;
                        }
                    });


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
