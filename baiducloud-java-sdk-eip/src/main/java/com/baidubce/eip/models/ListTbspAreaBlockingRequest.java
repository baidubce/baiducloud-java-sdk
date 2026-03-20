package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspAreaBlockingRequest {

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

    public ListTbspAreaBlockingRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public ListTbspAreaBlockingRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

}
