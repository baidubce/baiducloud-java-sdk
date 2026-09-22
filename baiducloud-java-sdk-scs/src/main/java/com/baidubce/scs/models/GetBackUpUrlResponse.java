package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBackUpUrlResponse extends BaseBceResponse {

    /**
    * 下载地址。
    */
    private String url;

    /**
    * 过期时间，单位秒。
    */
    private Integer urlExpiration;

    public String getUrl() {
        return url;
    }

    public GetBackUpUrlResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getUrlExpiration() {
        return urlExpiration;
    }

    public GetBackUpUrlResponse setUrlExpiration(Integer urlExpiration) {
        this.urlExpiration = urlExpiration;
        return this;
    }

    @Override
    public String toString() {
        return "GetBackUpUrlResponse{" + "url=" + url + "\n" + "urlExpiration=" + urlExpiration + "\n" + "}";
    }

}
