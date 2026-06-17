package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueDiskInfoResponse {
    /**
     * 故障磁盘sn
     */
    private String issueDiskSn;

    public IssueDiskInfoResponse setIssueDiskSn(String issueDiskSn) {
        this.issueDiskSn = issueDiskSn;
        return this;
    }

    public String getIssueDiskSn() {
        return this.issueDiskSn;
    }

    @Override
    public String toString() {
        return "IssueDiskInfoResponse{" + "issueDiskSn=" + issueDiskSn + "\n" + "}";
    }

}