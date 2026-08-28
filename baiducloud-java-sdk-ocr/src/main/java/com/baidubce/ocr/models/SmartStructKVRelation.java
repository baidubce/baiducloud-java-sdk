package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructKVRelation {
    /**
     * 根节点的 object_id，即 k-v 区的 key
     */
    @JsonProperty("root_node")
    private Integer rootNode;

    /**
     * 由根节点指向叶子节点的 object_id，及 k-v 区的 values
     */
    @JsonProperty("leaf_nodes")
    private List<Integer> leafNodes;

    public SmartStructKVRelation setRootNode(Integer rootNode) {
        this.rootNode = rootNode;
        return this;
    }

    public Integer getRootNode() {
        return this.rootNode;
    }

    public SmartStructKVRelation setLeafNodes(List<Integer> leafNodes) {
        this.leafNodes = leafNodes;
        return this;
    }

    public List<Integer> getLeafNodes() {
        return this.leafNodes;
    }

    @Override
    public String toString() {
        return "SmartStructKVRelation{" + "rootNode=" + rootNode + "\n" + "leafNodes=" + leafNodes + "\n" + "}";
    }

}