package com.baidubce.auth;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class BceApiKeyCredentials implements BceCredentials {

    private final String apiKey;

    public BceApiKeyCredentials(String apiKey) {
        checkNotNull(apiKey, "apiKey should not be null.");
        checkArgument(!apiKey.isEmpty(), "apiKey should not be empty.");
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getAccessKeyId() {
        return null;
    }

    @Override
    public String getSecretKey() {
        return null;
    }

    @Override
    public Signer getSigner() {
        return new BceApiKeySigner();
    }

}
