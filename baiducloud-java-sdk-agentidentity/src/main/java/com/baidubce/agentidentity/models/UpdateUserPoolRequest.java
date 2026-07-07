package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserPoolRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String id;

    /**
    * 新的用户池名称
    */
    private String name;

    /**
    * 新的用户池描述；不传保持不变，传空字符串表示清空
    */
    private String description;

    public String getId() {
        return id;
    }

    public UpdateUserPoolRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateUserPoolRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateUserPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
