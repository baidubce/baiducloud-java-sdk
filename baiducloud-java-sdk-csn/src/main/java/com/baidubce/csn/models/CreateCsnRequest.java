package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCsnRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 云智能网的名称
    */
    private String name;

    /**
    * 云智能网的描述
    */
    private String description;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public CreateCsnRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateCsnRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateCsnRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateCsnRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
