package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL3AccessRuleRequest extends BaseBceRequest {

    /**
    * 权限组名称
    */
    private String accessGroupName;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 规则列表，不能为空数组
    */
    private List<AccessRuleModel> accessRules;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public CreateL3AccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateL3AccessRuleRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public List<AccessRuleModel> getAccessRules() {
        return accessRules;
    }

    public CreateL3AccessRuleRequest setAccessRules(List<AccessRuleModel> accessRules) {
        this.accessRules = accessRules;
        return this;
    }

}
