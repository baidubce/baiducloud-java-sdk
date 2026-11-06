package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyDescriptionInformationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * dbName
    */
    @JsonIgnore
    private String dbName;

    /**
    * 描述信息
    */
    private String remark;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyDescriptionInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public ModifyDescriptionInformationRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public ModifyDescriptionInformationRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

}
