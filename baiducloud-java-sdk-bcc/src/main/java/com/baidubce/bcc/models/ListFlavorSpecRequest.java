package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFlavorSpecRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * specs
    */
    @JsonIgnore
    private String specs;

    /**
    * specIds
    */
    @JsonIgnore
    private String specIds;

    public String getZoneName() {
        return zoneName;
    }

    public ListFlavorSpecRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getSpecs() {
        return specs;
    }

    public ListFlavorSpecRequest setSpecs(String specs) {
        this.specs = specs;
        return this;
    }

    public String getSpecIds() {
        return specIds;
    }

    public ListFlavorSpecRequest setSpecIds(String specIds) {
        this.specIds = specIds;
        return this;
    }

}
