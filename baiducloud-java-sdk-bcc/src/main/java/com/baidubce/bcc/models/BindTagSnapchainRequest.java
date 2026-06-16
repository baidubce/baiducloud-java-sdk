package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindTagSnapchainRequest extends BaseBceRequest {

    /**
    * chainId
    */
    @JsonIgnore
    private String chainId;

    /**
    * 待绑定的标签列表
    */
    private List<TagModel> changeTags;

    public String getChainId() {
        return chainId;
    }

    public BindTagSnapchainRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public BindTagSnapchainRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
