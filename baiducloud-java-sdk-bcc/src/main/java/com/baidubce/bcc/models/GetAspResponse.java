package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAspResponse extends BaseBceResponse {

    /**
    * autoSnapshotPolicy
    */
    private AutoSnapshotPolicyModel autoSnapshotPolicy;

    public AutoSnapshotPolicyModel getAutoSnapshotPolicy() {
        return autoSnapshotPolicy;
    }

    public GetAspResponse setAutoSnapshotPolicy(AutoSnapshotPolicyModel autoSnapshotPolicy) {
        this.autoSnapshotPolicy = autoSnapshotPolicy;
        return this;
    }

    @Override
    public String toString() {
        return "GetAspResponse{" + "autoSnapshotPolicy=" + autoSnapshotPolicy + "\n" + "}";
    }

}
