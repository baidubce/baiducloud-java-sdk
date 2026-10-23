package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteL3AccessRuleRequest extends BaseBceRequest {

    /**
    * 权限组名称
    */
    private String accessGroupName;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 要删除的规则 ID
    */
    private Integer accessRuleId;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public DeleteL3AccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public DeleteL3AccessRuleRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getAccessRuleId() {
        return accessRuleId;
    }

    public DeleteL3AccessRuleRequest setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

}
