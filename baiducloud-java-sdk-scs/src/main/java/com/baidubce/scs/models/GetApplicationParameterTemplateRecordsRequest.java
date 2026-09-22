package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetApplicationParameterTemplateRecordsRequest extends BaseBceRequest {

    /**
    * templateShowId
    */
    @JsonIgnore
    private String templateShowId;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    public String getTemplateShowId() {
        return templateShowId;
    }

    public GetApplicationParameterTemplateRecordsRequest setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public GetApplicationParameterTemplateRecordsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetApplicationParameterTemplateRecordsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
