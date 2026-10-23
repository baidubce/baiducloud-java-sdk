package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL3AccessGroupRequest extends BaseBceRequest {

    /**
    * 权限组名称。字母开头，可含字母/数字/`.`/`_`/`-`，1~65 字节
    */
    private String accessGroupName;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 描述
    */
    private String description;

    /**
    * 复制源可用区，与 sourceAccessGroupName 成对使用
    */
    private String sourceZoneName;

    /**
    * 复制源权限组名，与 sourceZoneName 成对使用
    */
    private String sourceAccessGroupName;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public CreateL3AccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateL3AccessGroupRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateL3AccessGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSourceZoneName() {
        return sourceZoneName;
    }

    public CreateL3AccessGroupRequest setSourceZoneName(String sourceZoneName) {
        this.sourceZoneName = sourceZoneName;
        return this;
    }

    public String getSourceAccessGroupName() {
        return sourceAccessGroupName;
    }

    public CreateL3AccessGroupRequest setSourceAccessGroupName(String sourceAccessGroupName) {
        this.sourceAccessGroupName = sourceAccessGroupName;
        return this;
    }

}
