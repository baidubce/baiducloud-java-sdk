package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRelatedCloudProductsRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 需要关联的云产品列表。取值可通过接口【获取可关联的 BCM 云产品列表】查询，传空数组或不传则表示清空云产品关联。
    */
    private List<String> scopes;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateRelatedCloudProductsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public UpdateRelatedCloudProductsRequest setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

}
