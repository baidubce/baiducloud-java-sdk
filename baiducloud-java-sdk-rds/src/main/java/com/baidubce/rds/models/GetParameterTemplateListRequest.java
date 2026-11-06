package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetParameterTemplateListRequest extends BaseBceRequest {

    /**
    * dbType
    */
    @JsonIgnore
    private String dbType;

    /**
    * dbVersion
    */
    @JsonIgnore
    private String dbVersion;

    public String getDbType() {
        return dbType;
    }

    public GetParameterTemplateListRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    public String getDbVersion() {
        return dbVersion;
    }

    public GetParameterTemplateListRequest setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

}
