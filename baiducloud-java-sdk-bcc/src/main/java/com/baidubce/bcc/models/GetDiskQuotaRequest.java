package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDiskQuotaRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    public String getZoneName() {
        return zoneName;
    }

    public GetDiskQuotaRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

}
