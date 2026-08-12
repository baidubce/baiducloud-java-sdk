package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PauseSandboxRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    /**
    * hibernateMode
    */
    @JsonIgnore
    private String hibernateMode;

    public String getSandboxID() {
        return sandboxID;
    }

    public PauseSandboxRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

    public String getHibernateMode() {
        return hibernateMode;
    }

    public PauseSandboxRequest setHibernateMode(String hibernateMode) {
        this.hibernateMode = hibernateMode;
        return this;
    }

}
