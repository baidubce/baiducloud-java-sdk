package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyDeploymentSetRequest extends BaseBceRequest {

    /**
    * deploySetId
    */
    @JsonIgnore
    private String deploySetId;

    /**
    * 备注。
    */
    private String desc;

    /**
    * 部署集名称。
    */
    private String name;

    /**
    * 并发度。取值范围：1-127。默认值：20。
    */
    private Integer concurrency;

    public String getDeploySetId() {
        return deploySetId;
    }

    public ModifyDeploymentSetRequest setDeploySetId(String deploySetId) {
        this.deploySetId = deploySetId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ModifyDeploymentSetRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyDeploymentSetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getConcurrency() {
        return concurrency;
    }

    public ModifyDeploymentSetRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

}
