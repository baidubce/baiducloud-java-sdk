package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteTemplateV2Request extends BaseBceRequest {

    /**
    * namespace
    */
    @JsonIgnore
    private String namespace;

    /**
    * id
    */
    @JsonIgnore
    private String id;

    public String getNamespace() {
        return namespace;
    }

    public DeleteTemplateV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getId() {
        return id;
    }

    public DeleteTemplateV2Request setId(String id) {
        this.id = id;
        return this;
    }

}
