package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspProtocolBlockingRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * ip
    */
    @JsonIgnore
    private String ip;

    public String getId() {
        return id;
    }

    public ListTbspProtocolBlockingRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ListTbspProtocolBlockingRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

}
