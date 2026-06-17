package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyEhcClusterRequest extends BaseBceRequest {

    /**
    * 需要修改的EHC集群ID
    */
    private String ehcClusterId;

    /**
    * EHC集群名，不能与description同为空
    */
    private String name;

    /**
    * EHC集群描述，不能与name同为空
    */
    private String description;

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public ModifyEhcClusterRequest setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyEhcClusterRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyEhcClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
