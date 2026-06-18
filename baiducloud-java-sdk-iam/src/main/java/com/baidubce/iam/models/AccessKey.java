package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessKey {
    /**
     * AccessKey的公开Id，即AK
     */
    private String id;

    /**
     * AccessKey的密钥，即SK
     */
    private String secret;

    /**
     * AccessKey的创建时间
     */
    private String createTime;

    /**
     * AccessKey的描述
     */
    private String description;

    public AccessKey setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AccessKey setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getSecret() {
        return this.secret;
    }

    public AccessKey setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public AccessKey setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AccessKey{" + "id=" + id + "\n" + "secret=" + secret + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "}";
    }

}