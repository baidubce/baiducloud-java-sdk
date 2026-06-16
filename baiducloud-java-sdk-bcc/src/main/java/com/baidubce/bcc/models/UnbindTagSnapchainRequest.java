package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindTagSnapchainRequest extends BaseBceRequest {

    /**
    * chainId
    */
    @JsonIgnore
    private String chainId;

    /**
    * 待解绑的标签列表
    */
    private List<TagModel> changeTags;

    public String getChainId() {
        return chainId;
    }

    public UnbindTagSnapchainRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public UnbindTagSnapchainRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
