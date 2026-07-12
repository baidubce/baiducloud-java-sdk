package com.baidubce.oos.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetExecutionDetailV2Request extends BaseBceRequest {

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
    * withLog
    */
    @JsonIgnore
    private String withLog;

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    public String getNamespace() {
        return namespace;
    }

    public GetExecutionDetailV2Request setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetExecutionDetailV2Request setId(String id) {
        this.id = id;
        return this;
    }

    public String getWithLog() {
        return withLog;
    }

    public GetExecutionDetailV2Request setWithLog(String withLog) {
        this.withLog = withLog;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public GetExecutionDetailV2Request setLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
