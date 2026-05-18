package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateASharedTrafficPackageResponse extends BaseBceResponse {

    /**
    * 共享流量包id
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateASharedTrafficPackageResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateASharedTrafficPackageResponse{" + "id=" + id + "\n" + "}";
    }

}
