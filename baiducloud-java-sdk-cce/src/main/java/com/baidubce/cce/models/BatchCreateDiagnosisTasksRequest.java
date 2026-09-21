package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreateDiagnosisTasksRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 诊断类型，批量诊断仅支持 node
    */
    private String type;

    /**
    * 诊断对象列表，每个元素仅需设置 nodeName，最多 20 个
    */
    private List<Target> targets;

    public String getClusterID() {
        return clusterID;
    }

    public BatchCreateDiagnosisTasksRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getType() {
        return type;
    }

    public BatchCreateDiagnosisTasksRequest setType(String type) {
        this.type = type;
        return this;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public BatchCreateDiagnosisTasksRequest setTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

}
