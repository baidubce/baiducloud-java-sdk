package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAndAssignTagRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 需要修改的实例及标签信息，支持批量修改，见附录 TagResource，仅支持 RapidFS 实例绑定标签
    */
    private List<TagResource> tagResources;

    public String getClientToken() {
        return clientToken;
    }

    public CreateAndAssignTagRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<TagResource> getTagResources() {
        return tagResources;
    }

    public CreateAndAssignTagRequest setTagResources(List<TagResource> tagResources) {
        this.tagResources = tagResources;
        return this;
    }

}
