package com.http;

import android.content.Context;
import android.os.Handler;

import com.http.Util.ThreadUtil;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/30.
 */

public class AjaxHttp {
    private Map<String, Object> params;
    public static int NET_TIMEOUT = 30000;

    public static void setTimeout(int timeout) {
        NET_TIMEOUT = timeout;

    }
    public void httpPost(Context context,String url,String params, Handler.Callback callback){
        ThreadUtil.executeThread(new PostRunnable(context,url,params,callback));
    }

}
