package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeBlbServerHealthResponse extends BaseBceResponse {

    /**
    * 后端服务器状态列表
    */
    private List<BackendServerStatus> backendServerList;

    /**
    * 监听器类型，值为\"TCP\"/\"HTTP\"
    */
    private String type;

    /**
    * 监听器的监听端口
    */
    private Integer listenerPort;

    /**
    * 后端服务器的监听端口
    */
    private Integer backendPort;

    /**
    * 标记查询的起始位置，若结果列表为空，此项不存在
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    public List<BackendServerStatus> getBackendServerList() {
        return backendServerList;
    }

    public DescribeBlbServerHealthResponse setBackendServerList(List<BackendServerStatus> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeBlbServerHealthResponse setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public DescribeBlbServerHealthResponse setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public Integer getBackendPort() {
        return backendPort;
    }

    public DescribeBlbServerHealthResponse setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeBlbServerHealthResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeBlbServerHealthResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeBlbServerHealthResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeBlbServerHealthResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeBlbServerHealthResponse{" + "backendServerList=" + backendServerList + "\n" + "type=" + type + "\n" + "listenerPort=" + listenerPort + "\n"
                + "backendPort=" + backendPort + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys
                + "\n" + "}";
    }

}
