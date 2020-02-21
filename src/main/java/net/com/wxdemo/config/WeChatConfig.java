package net.com.wxdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:application.properties")
public class WeChatConfig {
    @Value("${WX.appid}")
    private String appid;
    @Value("${WX.app_sercet}")
    private String appsercet;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsercet() {
        return appsercet;
    }

    public void setAppsercet(String appsercet) {
        this.appsercet = appsercet;
    }
}
