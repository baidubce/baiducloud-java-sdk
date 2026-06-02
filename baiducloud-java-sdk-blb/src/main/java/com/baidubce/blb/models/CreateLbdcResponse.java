package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLbdcResponse extends BaseBceResponse {

    /**
    * 集群id
    */
    private String id;

    /**
    * 集群名称
    */
    private String name;

    /**
    * 集群类型
    */
    private String type;

    /**
    * 描述信息
    */
    private String desc;

    public String getId() {
        return id;
    }

    public CreateLbdcResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateLbdcResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateLbdcResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateLbdcResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "CreateLbdcResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "desc=" + desc + "\n" + "}";
    }

}
