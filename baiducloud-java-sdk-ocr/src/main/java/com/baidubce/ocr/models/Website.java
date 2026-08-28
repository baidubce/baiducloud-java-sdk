package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Website {
    /**
     * 网站名称
     */
    private String name;

    /**
     * 网站地址
     */
    private String url;

    public Website setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Website setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    @Override
    public String toString() {
        return "Website{" + "name=" + name + "\n" + "url=" + url + "\n" + "}";
    }

}