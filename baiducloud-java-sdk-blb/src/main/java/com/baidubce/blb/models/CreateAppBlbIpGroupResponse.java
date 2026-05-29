package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbIpGroupResponse extends BaseBceResponse {

    /**
    * IP组id
    */
    private String id;

    /**
    * IP组名称
    */
    private String name;

    /**
    * IP组描述
    */
    private String desc;

    public String getId() {
        return id;
    }

    public CreateAppBlbIpGroupResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppBlbIpGroupResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAppBlbIpGroupResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAppBlbIpGroupResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "}";
    }

}
