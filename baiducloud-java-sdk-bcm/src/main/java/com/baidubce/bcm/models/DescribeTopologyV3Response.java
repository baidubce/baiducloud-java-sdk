package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTopologyV3Response extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 节点列表
    */
    private List<TopoNode> nodes;

    /**
    * 边列表
    */
    private List<TopoEdge> edges;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeTopologyV3Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeTopologyV3Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeTopologyV3Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<TopoNode> getNodes() {
        return nodes;
    }

    public DescribeTopologyV3Response setNodes(List<TopoNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public List<TopoEdge> getEdges() {
        return edges;
    }

    public DescribeTopologyV3Response setEdges(List<TopoEdge> edges) {
        this.edges = edges;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeTopologyV3Response{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "nodes=" + nodes + "\n" + "edges=" + edges
                + "\n" + "}";
    }

}
