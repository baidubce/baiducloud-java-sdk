package com.baidubce.auth;

import com.baidubce.internal.InternalRequest;

public class BceApiKeySigner implements Signer{

    @Override
    public void sign(InternalRequest request, BceCredentials credentials) {
        if (credentials instanceof BceApiKeyCredentials) {
            String apiKey = ((BceApiKeyCredentials) credentials).getApiKey();
            request.addHeader("Authorization", "Bearer " + apiKey);
        }
    }

    @Override
    public void sign(InternalRequest request, BceCredentials credentials, SignOptions options) {
        sign(request, credentials);
    }
}
