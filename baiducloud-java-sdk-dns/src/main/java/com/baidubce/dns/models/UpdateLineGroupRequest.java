package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLineGroupRequest extends BaseBceRequest {

    /**
    * lineId
    */
    @JsonIgnore
    private Integer lineId;

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

    public Integer getLineId() {
        return lineId;
    }

    public UpdateLineGroupRequest setLineId(Integer lineId) {
        this.lineId = lineId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateLineGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateLineGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getLines() {
        return lines;
    }

    public UpdateLineGroupRequest setLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

}
