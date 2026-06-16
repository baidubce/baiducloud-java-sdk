package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetachKeypairRequest extends BaseBceRequest {

    /**
    * keypairId
    */
    @JsonIgnore
    private String keypairId;

    /**
    * 待解绑的实例ID列表
    */
    private List<String> instanceIds;

    public String getKeypairId() {
        return keypairId;
    }

    public DetachKeypairRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public DetachKeypairRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
