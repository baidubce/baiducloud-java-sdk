package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAcceleratorFilterDetailResponse extends BaseBceResponse {

    /**
    * 镜像按需加载规则创建时间
    */
    private String creationTime;

    /**
    * 备注
    */
    private String description;

    /**
    * 镜像按需加载规则是否开启
    */
    private Boolean enabled;

    /**
    * 触发规则
    */
    private List<AcceleratorFilter> filters;

    /**
    * 镜像按需加载规则ID
    */
    private Integer id;

    /**
    * 镜像按需加载规则名称
    */
    private String name;

    /**
    * 镜像按需加载规则更新时间
    */
    private String updateTime;

    public String getCreationTime() {
        return creationTime;
    }

    public GetAcceleratorFilterDetailResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetAcceleratorFilterDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public GetAcceleratorFilterDetailResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public List<AcceleratorFilter> getFilters() {
        return filters;
    }

    public GetAcceleratorFilterDetailResponse setFilters(List<AcceleratorFilter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetAcceleratorFilterDetailResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetAcceleratorFilterDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public GetAcceleratorFilterDetailResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "GetAcceleratorFilterDetailResponse{" + "creationTime=" + creationTime + "\n" + "description=" + description + "\n" + "enabled=" + enabled + "\n" + "filters="
                + filters + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
