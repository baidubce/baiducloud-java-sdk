package com.baidubce.auth;

import com.baidubce.internal.InternalRequest;

/**
 * 使用 access_token 进行鉴权：在请求 URL 参数中附加 access_token。
 * 适用于百度AI开放平台（aip.baidubce.com）接口。
 */
public class BceAccessTokenSigner implements Signer {

    @Override
    public void sign(InternalRequest request, BceCredentials credentials) {
        if (credentials instanceof BceAccessTokenCredentials) {
            String token = ((BceAccessTokenCredentials) credentials).getAccessToken();
            request.addParameter("access_token", token);
        }
    }

    @Override
    public void sign(InternalRequest request, BceCredentials credentials, SignOptions options) {
        sign(request, credentials);
    }
}
