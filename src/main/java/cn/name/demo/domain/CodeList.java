package cn.name.demo.domain;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class CodeList {
    private Integer id;

    private Long no;

    private String title;

    private String classify;

    private String language;

    private Date time;

    private String tag;

    private String connet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getConnet() {
        return connet;
    }

    public void setConnet(String connet) {
        this.connet = connet == null ? null : connet.trim();
    }
}