package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyNodeGroupNodeShrinkProtectionStatusV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 需要修改缩容保护状态的节点 ID 列表（CCEInstanceID）
    */
    private List<String> instanceIDs;

    /**
    * 是否开启缩容保护：true 开启（禁止被缩容），false 关闭
    */
    private Boolean scaleDownDisabled;

    public String getClusterID() {
        return clusterID;
    }

    public ModifyNodeGroupNodeShrinkProtectionStatusV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public List<String> getInstanceIDs() {
        return instanceIDs;
    }

    public ModifyNodeGroupNodeShrinkProtectionStatusV2Request setInstanceIDs(List<String> instanceIDs) {
        this.instanceIDs = instanceIDs;
        return this;
    }

    public Boolean getScaleDownDisabled() {
        return scaleDownDisabled;
    }

    public ModifyNodeGroupNodeShrinkProtectionStatusV2Request setScaleDownDisabled(Boolean scaleDownDisabled) {
        this.scaleDownDisabled = scaleDownDisabled;
        return this;
    }

}
