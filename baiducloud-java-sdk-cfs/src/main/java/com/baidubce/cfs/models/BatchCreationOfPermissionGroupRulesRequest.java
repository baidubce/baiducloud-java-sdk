package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreationOfPermissionGroupRulesRequest extends BaseBceRequest {

    /**
    * 指定创建的规则的权限组名字。
    */
    private String agName;

    /**
    * 批量添加的权限组规则列表，一次请求最多创建100条
    */
    private List<RuleInfo> accessRules;

    public String getAgName() {
        return agName;
    }

    public BatchCreationOfPermissionGroupRulesRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

    public List<RuleInfo> getAccessRules() {
        return accessRules;
    }

    public BatchCreationOfPermissionGroupRulesRequest setAccessRules(List<RuleInfo> accessRules) {
        this.accessRules = accessRules;
        return this;
    }

}
