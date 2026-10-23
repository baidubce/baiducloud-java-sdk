package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateL3AccessGroupRequest extends BaseBceRequest {

    /**
    * 定位用，不是要改成的新名字。字母开头，可含字母/数字/`.`/`_`/`-`，1~65 字节
    */
    private String accessGroupName;

    /**
    * 定位用，可用区名称
    */
    private String zoneName;

    /**
    * 要更新的描述，UTF-8 编码后不超过 1024 字节
    */
    private String description;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public UpdateL3AccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public UpdateL3AccessGroupRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateL3AccessGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
