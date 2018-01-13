package cn.name.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class WxUser {
    private Integer id;

    private String url;

    private Integer userId;

    private String wxName;

    private Integer age;

    private String wxAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName == null ? null : wxName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWxAddress() {
        return wxAddress;
    }

    public void setWxAddress(String wxAddress) {
        this.wxAddress = wxAddress == null ? null : wxAddress.trim();
    }
}