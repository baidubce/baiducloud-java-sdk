package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecodingApikeyPermanentlyValidResponse extends BaseBceResponse {

    /**
    * API Key在的标识
    */
    private String id;

    /**
    * API Key本身
    */
    private String tokenId;

    /**
    * API Key名称
    */
    private String name;

    /**
    * API Key 归属的子用户
    */
    private String userId;

    /**
    * API Key 授权的服务列表
    */
    private List<String> services;

    /**
    * API Key 创建时间
    */
    private String createTime;

    /**
    * API Key 更新时间
    */
    private String updateTime;

    public String getId() {
        return id;
    }

    public DecodingApikeyPermanentlyValidResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }

    public DecodingApikeyPermanentlyValidResponse setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DecodingApikeyPermanentlyValidResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public DecodingApikeyPermanentlyValidResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public List<String> getServices() {
        return services;
    }

    public DecodingApikeyPermanentlyValidResponse setServices(List<String> services) {
        this.services = services;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DecodingApikeyPermanentlyValidResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public DecodingApikeyPermanentlyValidResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "DecodingApikeyPermanentlyValidResponse{" + "id=" + id + "\n" + "tokenId=" + tokenId + "\n" + "name=" + name + "\n" + "userId=" + userId + "\n" + "services="
                + services + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
