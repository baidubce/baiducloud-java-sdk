package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAccessKeyResponse extends BaseBceResponse {

    /**
    * 用户访问密钥列表
    */
    private List<AccessKey> accessKeys;

    public List<AccessKey> getAccessKeys() {
        return accessKeys;
    }

    public ListAccessKeyResponse setAccessKeys(List<AccessKey> accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }

    @Override
    public String toString() {
        return "ListAccessKeyResponse{" + "accessKeys=" + accessKeys + "\n" + "}";
    }

}
