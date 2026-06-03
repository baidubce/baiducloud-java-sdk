package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCacheNodesRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * MasterManaged 部署模式下，用户待添加的缓存接入类型，当前仅支持：<br> • BCC：云服务器 BCC；<br> • IDC：自建数据中心
    */
    private String type;

    /**
    * 待添加的节点信息列表，见附录 AddCacheNodeInfo
    */
    private List<AddCacheNodeInfo> cacheNodes;

    public String getClientToken() {
        return clientToken;
    }

    public AddCacheNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public AddCacheNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getType() {
        return type;
    }

    public AddCacheNodesRequest setType(String type) {
        this.type = type;
        return this;
    }

    public List<AddCacheNodeInfo> getCacheNodes() {
        return cacheNodes;
    }

    public AddCacheNodesRequest setCacheNodes(List<AddCacheNodeInfo> cacheNodes) {
        this.cacheNodes = cacheNodes;
        return this;
    }

}
