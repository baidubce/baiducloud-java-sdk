package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IAMCredentialSpec {
    /**
     * 凭证名称
     */
    private String name;

    /**
     * IAM APIKey ID
     */
    private String iamApiKeyId;

    /**
     * 脱敏 Token ID
     */
    private String iamTokenIdMasked;

    /**
     * IAM 用户 ID
     */
    private String iamUserId;

    /**
     * IAM 域 ID
     */
    private String iamDomainId;

    /**
     * 授权资源 ID
     */
    private List<String> resourceIds;

    /**
     * 是否放入请求头
     */
    private Boolean inHeader;

    /**
     * 是否放入查询参数
     */
    private Boolean inQuery;

    /**
     * 凭证键名
     */
    private List<String> keyNames;

    /**
     * 凭证状态
     */
    private String status;

    public IAMCredentialSpec setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public IAMCredentialSpec setIamApiKeyId(String iamApiKeyId) {
        this.iamApiKeyId = iamApiKeyId;
        return this;
    }

    public String getIamApiKeyId() {
        return this.iamApiKeyId;
    }

    public IAMCredentialSpec setIamTokenIdMasked(String iamTokenIdMasked) {
        this.iamTokenIdMasked = iamTokenIdMasked;
        return this;
    }

    public String getIamTokenIdMasked() {
        return this.iamTokenIdMasked;
    }

    public IAMCredentialSpec setIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
        return this;
    }

    public String getIamUserId() {
        return this.iamUserId;
    }

    public IAMCredentialSpec setIamDomainId(String iamDomainId) {
        this.iamDomainId = iamDomainId;
        return this;
    }

    public String getIamDomainId() {
        return this.iamDomainId;
    }

    public IAMCredentialSpec setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public List<String> getResourceIds() {
        return this.resourceIds;
    }

    public IAMCredentialSpec setInHeader(Boolean inHeader) {
        this.inHeader = inHeader;
        return this;
    }

    public Boolean getInHeader() {
        return this.inHeader;
    }

    public IAMCredentialSpec setInQuery(Boolean inQuery) {
        this.inQuery = inQuery;
        return this;
    }

    public Boolean getInQuery() {
        return this.inQuery;
    }

    public IAMCredentialSpec setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    public List<String> getKeyNames() {
        return this.keyNames;
    }

    public IAMCredentialSpec setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "IAMCredentialSpec{" + "name=" + name + "\n" + "iamApiKeyId=" + iamApiKeyId + "\n" + "iamTokenIdMasked=" + iamTokenIdMasked + "\n" + "iamUserId=" + iamUserId + "\n"
                + "iamDomainId=" + iamDomainId + "\n" + "resourceIds=" + resourceIds + "\n" + "inHeader=" + inHeader + "\n" + "inQuery=" + inQuery + "\n" + "keyNames=" + keyNames
                + "\n" + "status=" + status + "\n" + "}";
    }

}