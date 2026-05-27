package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbServerGroupPortResponse extends BaseBceResponse {

    /**
    * 服务器组端口id
    */
    private String id;

    /**
    * 服务器组端口状态，详见[blbStatus](BLB/API参考/附录.md#blbStatus)
    */
    private String status;

    public String getId() {
        return id;
    }

    public CreateAppBlbServerGroupPortResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CreateAppBlbServerGroupPortResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "CreateAppBlbServerGroupPortResponse{" + "id=" + id + "\n" + "status=" + status + "\n" + "}";
    }

}
