package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAuthGroupResponse extends BaseBceResponse {

    /**
    * authGroupInfo
    */
    private AuthGroupInfo authGroupInfo;

    public AuthGroupInfo getAuthGroupInfo() {
        return authGroupInfo;
    }

    public DescribeAuthGroupResponse setAuthGroupInfo(AuthGroupInfo authGroupInfo) {
        this.authGroupInfo = authGroupInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAuthGroupResponse{" + "authGroupInfo=" + authGroupInfo + "\n" + "}";
    }

}
