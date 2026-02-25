package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindTbspProtectionObjectRequest extends BaseBceRequest {

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
    * 解绑的防护对象IP列表
    */
    private List<String> ipList;


    public String getId() {
        return id;
    }

    public UnbindTbspProtectionObjectRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UnbindTbspProtectionObjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public UnbindTbspProtectionObjectRequest setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }


}
