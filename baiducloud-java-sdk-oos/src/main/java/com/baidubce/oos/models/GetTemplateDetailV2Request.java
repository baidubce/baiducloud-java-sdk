package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTemplateDetailV2Request extends BaseBceRequest {

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

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * type
    */
    @JsonIgnore
    private String type;

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    public String getNamespace() {
        return namespace;
    }

    public GetTemplateDetailV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetTemplateDetailV2Request setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTemplateDetailV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetTemplateDetailV2Request setType(String type) {
        this.type = type;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public GetTemplateDetailV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
