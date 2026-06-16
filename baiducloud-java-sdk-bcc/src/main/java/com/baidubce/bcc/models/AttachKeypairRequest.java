package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachKeypairRequest extends BaseBceRequest {

    /**
    * keypairId
    */
    @JsonIgnore
    private String keypairId;

    /**
    * 待绑定的虚机短ID列表
    */
    private List<String> instanceIds;

    public String getKeypairId() {
        return keypairId;
    }

    public AttachKeypairRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public AttachKeypairRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
