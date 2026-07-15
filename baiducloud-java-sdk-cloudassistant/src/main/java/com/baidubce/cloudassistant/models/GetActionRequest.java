package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetActionRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    public String getId() {
        return id;
    }

    public GetActionRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public GetActionRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
