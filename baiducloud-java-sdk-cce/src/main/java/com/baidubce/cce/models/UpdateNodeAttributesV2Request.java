package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateNodeAttributesV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * instanceID
    */
    @JsonIgnore
    private String instanceID;

    /**
    * 节点的标签
    */
    private Map<String, String> labels;

    /**
    * 节点的注解
    */
    private Map<String, String> annotations;

    /**
    * 节点的污点
    */
    private List<Taint> taints;

    /**
    * 节点的优先级
    */
    private Integer cceInstancePriority;

    public String getClusterID() {
        return clusterID;
    }

    public UpdateNodeAttributesV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public UpdateNodeAttributesV2Request setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public UpdateNodeAttributesV2Request setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public UpdateNodeAttributesV2Request setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public List<Taint> getTaints() {
        return taints;
    }

    public UpdateNodeAttributesV2Request setTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public Integer getCceInstancePriority() {
        return cceInstancePriority;
    }

    public UpdateNodeAttributesV2Request setCceInstancePriority(Integer cceInstancePriority) {
        this.cceInstancePriority = cceInstancePriority;
        return this;
    }

}
