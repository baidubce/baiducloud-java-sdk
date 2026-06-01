package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveDedicatedChannelUserObjectRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 分配对象
    */
    private List<String> authorizedUsers;

    public String getEtId() {
        return etId;
    }

    public RemoveDedicatedChannelUserObjectRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public RemoveDedicatedChannelUserObjectRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RemoveDedicatedChannelUserObjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getAuthorizedUsers() {
        return authorizedUsers;
    }

    public RemoveDedicatedChannelUserObjectRequest setAuthorizedUsers(List<String> authorizedUsers) {
        this.authorizedUsers = authorizedUsers;
        return this;
    }

}
