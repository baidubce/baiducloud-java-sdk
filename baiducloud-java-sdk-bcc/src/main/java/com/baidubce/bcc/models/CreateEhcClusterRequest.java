package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEhcClusterRequest extends BaseBceRequest {

    /**
    * EHC集群名
    */
    private String name;

    /**
    * 指定zone信息，命名规范是国家-region-可用区序列，例如cn-bj-a
    */
    private String zoneName;

    /**
    * EHC集群描述
    */
    private String description;

    public String getName() {
        return name;
    }

    public CreateEhcClusterRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateEhcClusterRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateEhcClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
