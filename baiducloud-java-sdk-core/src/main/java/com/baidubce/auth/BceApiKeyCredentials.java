package com.baidubce.auth;

public class BceApiKeyCredentials implements BceCredentials {

    private final String apiKey;

    public  BceApiKeyCredentials(String apiKey) {
        if (apiKey == null || apiKey.isEmpty()){
            throw new IllegalArgumentException("apiKey cannot be empty");
        }
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getAccessKeyId() {
        return "";
    }

    @Override
    public String getSecretKey() {
        return "";
    }

}
