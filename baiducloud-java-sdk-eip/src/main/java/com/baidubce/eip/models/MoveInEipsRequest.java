package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveInEipsRequest extends BaseBceRequest {

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
    * 待移入的ip数组，包括IPv4 EIP和IPv6 EIP。
    */
    private List<String> eips;

    public String getId() {
        return id;
    }

    public MoveInEipsRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public MoveInEipsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getEips() {
        return eips;
    }

    public MoveInEipsRequest setEips(List<String> eips) {
        this.eips = eips;
        return this;
    }

}
