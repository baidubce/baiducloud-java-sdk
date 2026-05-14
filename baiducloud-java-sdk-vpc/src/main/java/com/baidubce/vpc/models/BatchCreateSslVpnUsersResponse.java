package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreateSslVpnUsersResponse extends BaseBceResponse {

    /**
    * SSL-VPN用户ID列表
    */
    private List<String> sslVpnUserIds;

    public List<String> getSslVpnUserIds() {
        return sslVpnUserIds;
    }

    public BatchCreateSslVpnUsersResponse setSslVpnUserIds(List<String> sslVpnUserIds) {
        this.sslVpnUserIds = sslVpnUserIds;
        return this;
    }

    @Override
    public String toString() {
        return "BatchCreateSslVpnUsersResponse{" + "sslVpnUserIds=" + sslVpnUserIds + "\n" + "}";
    }

}
