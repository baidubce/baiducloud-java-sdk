package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTlsCertResponse extends BaseBceResponse {

    /**
    * ca证书状态：tocreate（创建中）、inuse（使用中）、todelete（删除中）、deleted（已删除、已失效）
    */
    private String status;

    /**
    * 创建时间。
    */
    private String createTime;

    /**
    * 过期时间。
    */
    private String expireTime;

    /**
    * ca证书。
    */
    private String ca;

    public String getStatus() {
        return status;
    }

    public GetTlsCertResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetTlsCertResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public GetTlsCertResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getCa() {
        return ca;
    }

    public GetTlsCertResponse setCa(String ca) {
        this.ca = ca;
        return this;
    }

    @Override
    public String toString() {
        return "GetTlsCertResponse{" + "status=" + status + "\n" + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n" + "ca=" + ca + "\n" + "}";
    }

}
