package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachNodeV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * attachNode
    */
    @JsonIgnore
    private String attachNode;

    /**
    * 期望添加的节点列表
    */
    private List<String> nodes;

    public String getGroupId() {
        return groupId;
    }

    public AttachNodeV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getAttachNode() {
        return attachNode;
    }

    public AttachNodeV2Request setAttachNode(String attachNode) {
        this.attachNode = attachNode;
        return this;
    }

    public List<String> getNodes() {
        return nodes;
    }

    public AttachNodeV2Request setNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

}
