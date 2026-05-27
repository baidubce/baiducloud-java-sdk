package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryCsnDetailResponse extends BaseBceResponse {

    /**
    * 云智能网的名称
    */
    private String name;

    /**
    * 云智能网的描述
    */
    private String description;

    /**
    * 云智能网的ID
    */
    private String csnId;

    /**
    * 云智能网的状态
    */
    private String status;

    /**
    * 云智能网加载的网络实例数量
    */
    private Integer instanceNum;

    /**
    * 云智能网绑定的带宽包数量
    */
    private Integer csnBpNum;

    /**
    * 云智能网的创建时间
    */
    private String createdTime;

    /**
    * 云智能网绑定的标签信息
    */
    private List<TagModel> tags;

    public String getName() {
        return name;
    }

    public QueryCsnDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryCsnDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCsnId() {
        return csnId;
    }

    public QueryCsnDetailResponse setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryCsnDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getInstanceNum() {
        return instanceNum;
    }

    public QueryCsnDetailResponse setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    public Integer getCsnBpNum() {
        return csnBpNum;
    }

    public QueryCsnDetailResponse setCsnBpNum(Integer csnBpNum) {
        this.csnBpNum = csnBpNum;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public QueryCsnDetailResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public QueryCsnDetailResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "QueryCsnDetailResponse{" + "name=" + name + "\n" + "description=" + description + "\n" + "csnId=" + csnId + "\n" + "status=" + status + "\n" + "instanceNum="
                + instanceNum + "\n" + "csnBpNum=" + csnBpNum + "\n" + "createdTime=" + createdTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}
