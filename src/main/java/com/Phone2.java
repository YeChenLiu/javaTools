package com;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Phone2 {

    public static void main(String[] args) {
        try {
            System.out.println(calcMobileCity("18975000544"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public static String calcMobileCity(String mobileNumber) throws MalformedURLException {

        String jsonString = null;
        JSONArray array = null;
        JSONObject jsonObject = null;
        //获取拍拍网的API地址
        String urlString = "http://virtual.paipai.com/extinfo/GetMobileProductInfo?mobile="+mobileNumber+"&amount=10000&callname=getPhoneNumInfoExtCallback";
        StringBuffer sb = new StringBuffer();
        BufferedReader buffer;
        URL url = new URL(urlString);
        try{
            //获取URL地址中的页面内容
            InputStream in = url.openStream();
            // 解决乱码问题
            buffer = new BufferedReader(new InputStreamReader(in,"gb2312"));
            String line = null;
            //一行一行的读取数据
            while((line = buffer.readLine()) != null){
                sb.append(line);
            }
            in.close();
            buffer.close();
            // System.out.println(sb.toString());
            jsonString = sb.toString();
            // 替换掉“getPhoneNumInfoExtCallback(，);<!--[if !IE]>|xGv00|6741027ad78d9b06f5642b25ebcb1536<![endif]-->”，让它能转换为JSONArray对象
            jsonString = jsonString.replace("getPhoneNumInfoExtCallback(", "[");
            jsonString = jsonString.replace(");<!--[if !IE]>|xGv00|6741027ad78d9b06f5642b25ebcb1536<![endif]-->", "]");
            // 把jsonString转化为json对象
            array = JSONArray.parseArray(jsonString);
            // 获取JSONArray的JSONObject对象，便于读取array里的键值对
            jsonObject = array.getJSONObject(0);

        }catch(Exception e){
            e.printStackTrace();
        }
        //从JSONObject对象中读取城市名称
        return jsonObject.getString("cityname");
    }
}
