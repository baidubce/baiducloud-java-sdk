package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbServerGroupResponse extends BaseBceResponse {

    /**
    * 服务器组id
    */
    private String id;

    /**
    * 服务器组的名称
    */
    private String name;

    /**
    * 服务器组的描述
    */
    private String desc;

    /**
    * 服务器组状态，详见[blbStatus](BLB/API参考/附录.md#blbStatus)
    */
    private String status;

    public String getId() {
        return id;
    }

    public CreateAppBlbServerGroupResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppBlbServerGroupResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAppBlbServerGroupResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CreateAppBlbServerGroupResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAppBlbServerGroupResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "status=" + status + "\n" + "}";
    }

}
