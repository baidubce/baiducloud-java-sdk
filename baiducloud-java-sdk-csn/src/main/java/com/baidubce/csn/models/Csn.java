package com.baidubce.csn.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Csn {
    /**
     * CSN的ID
     */
    private String csnId;

    /**
     * CSN的名称
     */
    private String name;

    /**
     * CSN的描述
     */
    private String description;

    /**
     * CSN的状态
     */
    private String status;

    /**
     * CSN网络实例个数
     */
    private Integer instanceNum;

    /**
     * CSN带宽包个数
     */
    private Integer csnBpNum;

    /**
     * CSN的创建时间
     */
    private String createTime;

    /**
     * CSN绑定的标签集合
     */
    private List<TagModel> tags;

    public Csn setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getCsnId() {
        return this.csnId;
    }

    public Csn setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Csn setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Csn setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Csn setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    public Integer getInstanceNum() {
        return this.instanceNum;
    }

    public Csn setCsnBpNum(Integer csnBpNum) {
        this.csnBpNum = csnBpNum;
        return this;
    }

    public Integer getCsnBpNum() {
        return this.csnBpNum;
    }

    public Csn setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Csn setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Csn{" + "csnId=" + csnId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "status=" + status + "\n" + "instanceNum=" + instanceNum + "\n"
                + "csnBpNum=" + csnBpNum + "\n" + "createTime=" + createTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}