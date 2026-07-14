package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetachNodeV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * detachNode
    */
    @JsonIgnore
    private String detachNode;

    /**
    * 待移出实例短id列表
    */
    private List<String> nodes;

    public String getGroupId() {
        return groupId;
    }

    public DetachNodeV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getDetachNode() {
        return detachNode;
    }

    public DetachNodeV2Request setDetachNode(String detachNode) {
        this.detachNode = detachNode;
        return this;
    }

    public List<String> getNodes() {
        return nodes;
    }

    public DetachNodeV2Request setNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

}
