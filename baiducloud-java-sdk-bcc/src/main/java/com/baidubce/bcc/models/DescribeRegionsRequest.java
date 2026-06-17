package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeRegionsRequest extends BaseBceRequest {

    /**
    * 指定地域获取对应的域名，不传默认获取全部地域域名列表
    */
    private String region;

    public String getRegion() {
        return region;
    }

    public DescribeRegionsRequest setRegion(String region) {
        this.region = region;
        return this;
    }

}
