package com.yjf.autoConfigruatuinProperties;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 余俊锋
 * @date 2020/10/21 14:50
 * @Description
 */
@ConfigurationProperties(prefix = "com.xxx")
public class TestAutoConfigProperties {
    private String path;
    private String name;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
