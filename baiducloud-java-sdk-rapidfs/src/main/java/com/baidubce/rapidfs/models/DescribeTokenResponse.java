package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTokenResponse extends BaseBceResponse {

    /**
    * tokenInfo
    */
    private TokenInfo tokenInfo;

    public TokenInfo getTokenInfo() {
        return tokenInfo;
    }

    public DescribeTokenResponse setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeTokenResponse{" + "tokenInfo=" + tokenInfo + "\n" + "}";
    }

}
