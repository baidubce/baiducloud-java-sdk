package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuildHistory {
    /**
     * 创建时间
     */
    private String created;

    /**
     * 备注
     */
    private String comment;

    /**
     * 创建命令
     */
    private String createdBy;

    /**
     * 是否为空层
     */
    private Boolean emptyLayer;

    public BuildHistory setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return this.created;
    }

    public BuildHistory setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return this.comment;
    }

    public BuildHistory setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public BuildHistory setEmptyLayer(Boolean emptyLayer) {
        this.emptyLayer = emptyLayer;
        return this;
    }

    public Boolean getEmptyLayer() {
        return this.emptyLayer;
    }

    @Override
    public String toString() {
        return "BuildHistory{" + "created=" + created + "\n" + "comment=" + comment + "\n" + "createdBy=" + createdBy + "\n" + "emptyLayer=" + emptyLayer + "\n" + "}";
    }

}