package findyou.testcase;

import java.io.IOException;

import com.beibei.net.HttpManager;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.beibei.utils.JSONUtil;

public class test {
    public String httpResult = null, weatherinfo = null, city = null, exp_city = null;
    public static String cityCode = "";
    private String weatherUrl = "http://www.weather.com.cn/data/cityinfo/%s.html";

    @Test(groups = {"BaseCase"})
    public void getShenZhen_Succ() throws IOException {
        exp_city = "深圳";
        cityCode = "101280601";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        String requestUrl = String.format(weatherUrl, cityCode);
        httpResult = HttpManager.sendRequest(requestUrl);
        Reporter.log("请求地址: " + requestUrl);
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONUtil.getValue(httpResult, "weatherinfo");
        city = JSONUtil.getValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"})
    public void getBeiJing_Succ() throws IOException {
        exp_city = "北京";
        cityCode = "101010100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        String requestUrl = String.format(weatherUrl, cityCode);
        httpResult = HttpManager.sendRequest(requestUrl);
        Reporter.log("请求地址: " + requestUrl);
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONUtil.getValue(httpResult, "weatherinfo");
        city = JSONUtil.getValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }

    @Test(groups = {"BaseCase"})
    public void getShangHai_Succ() throws IOException {
        exp_city = "上海";
        cityCode = "101020100";
        Reporter.log("【正常用例】:获取" + exp_city + "天气成功!");
        String requestUrl = String.format(weatherUrl, cityCode);
        httpResult = HttpManager.sendRequest(requestUrl);
        Reporter.log("请求地址: " + requestUrl);
        Reporter.log("返回结果: " + httpResult);
        weatherinfo = JSONUtil.getValue(httpResult, "weatherinfo");
        city = JSONUtil.getValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city + " ,actual: " + city);
        Assert.assertEquals(city, exp_city);
    }
}