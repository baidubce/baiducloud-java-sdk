package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDiagnosisTaskRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 诊断类型，可选 [ pod, node ]
    */
    private String type;

    /**
    * target
    */
    private Target target;

    /**
    * existedOption
    */
    private ExistedOption existedOption;

    public String getClusterID() {
        return clusterID;
    }

    public CreateDiagnosisTaskRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateDiagnosisTaskRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Target getTarget() {
        return target;
    }

    public CreateDiagnosisTaskRequest setTarget(Target target) {
        this.target = target;
        return this;
    }

    public ExistedOption getExistedOption() {
        return existedOption;
    }

    public CreateDiagnosisTaskRequest setExistedOption(ExistedOption existedOption) {
        this.existedOption = existedOption;
        return this;
    }

}
