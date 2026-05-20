package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLineGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 线路组名称，长度不超过12个字符。
    */
    private String name;

    /**
    * 解析线路。
    */
    private List<String> lines;

    public String getClientToken() {
        return clientToken;
    }

    public AddLineGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public AddLineGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getLines() {
        return lines;
    }

    public AddLineGroupRequest setLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

}
