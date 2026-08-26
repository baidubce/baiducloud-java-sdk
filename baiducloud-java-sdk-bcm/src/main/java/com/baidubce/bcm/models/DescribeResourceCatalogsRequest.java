package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeResourceCatalogsRequest extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    public String getLocale() {
        return locale;
    }

    public DescribeResourceCatalogsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

}
