package com.http;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

/**
 * 执行HTTPS
 * Created by wbg on 2017/10/24.
 */
public class PostRunnable implements Runnable {
    private static final String TAG = "PostRunnable";
    private String data;
    private Handler.Callback callback;
    private String url;
    private String result = "";
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    callback.handleMessage(msg);
                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }
    };

    public PostRunnable(Context context, String url, String params, Handler.Callback callback) {
        this.data = params;
        this.callback = callback;
        this.url = url;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(this.url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(AjaxHttp.NET_TIMEOUT);
            connection.setInstanceFollowRedirects(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", data.length() + "");
            connection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            if (!TextUtils.isEmpty(data)) {
                dataOutputStream.write(data.getBytes());
            } else {
                dataOutputStream.write(null);
            }
            dataOutputStream.flush();
            dataOutputStream.close();

            String responsemessage = connection.getResponseMessage();
            String encoding = connection.getContentEncoding();
            Log.e(TAG, "responsemessage=" + responsemessage);
            Log.e(TAG, "encoding=" + encoding);

            int responseCode = connection.getResponseCode();
            Log.e(TAG, "responseCode=" + responseCode);
            //获得结果码
            if (responseCode == 200) {
                //请求成功
                InputStream is = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(is);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String readLine = null;
                while ((readLine = bufferedReader.readLine()) != null) {
                    result += readLine;
                }
                connection.disconnect();

            } else {
                //请求失败
                result = "";
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            result = "";
        } catch (ProtocolException e) {
            e.printStackTrace();
            result = "";
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        }
        Message message = new Message();
        message.obj = result;
        message.what=1;
        handler.sendMessage(message);

    }
}
