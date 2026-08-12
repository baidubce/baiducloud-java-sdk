package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteSandboxRequest extends BaseBceRequest {

    /**
    * sandboxID
    */
    @JsonIgnore
    private String sandboxID;

    public String getSandboxID() {
        return sandboxID;
    }

    public DeleteSandboxRequest setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }

}
