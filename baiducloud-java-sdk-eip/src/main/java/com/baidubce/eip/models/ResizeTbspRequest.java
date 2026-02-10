package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeTbspRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * DDoS增强防护包IP容量，需大于升级前的IP容量（5/30/100）
    */
    private Integer ipCapacity;


    public String getId() {
        return id;
    }

    public ResizeTbspRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResizeTbspRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getIpCapacity() {
        return ipCapacity;
    }

    public ResizeTbspRequest setIpCapacity(Integer ipCapacity) {
        this.ipCapacity = ipCapacity;
        return this;
    }


}
