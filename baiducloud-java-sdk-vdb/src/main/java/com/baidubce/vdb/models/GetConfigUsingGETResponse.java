package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetConfigUsingGETResponse extends BaseBceResponse {

    /**
    * autoBackupConfig
    */
    private String autoBackupConfig;

    /**
    * autoBackupEnabled
    */
    private Boolean autoBackupEnabled;

    /**
    * isEncrypt
    */
    private String isEncrypt;

    public String getAutoBackupConfig() {
        return autoBackupConfig;
    }

    public GetConfigUsingGETResponse setAutoBackupConfig(String autoBackupConfig) {
        this.autoBackupConfig = autoBackupConfig;
        return this;
    }

    public Boolean getAutoBackupEnabled() {
        return autoBackupEnabled;
    }

    public GetConfigUsingGETResponse setAutoBackupEnabled(Boolean autoBackupEnabled) {
        this.autoBackupEnabled = autoBackupEnabled;
        return this;
    }

    public String getIsEncrypt() {
        return isEncrypt;
    }

    public GetConfigUsingGETResponse setIsEncrypt(String isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    @Override
    public String toString() {
        return "GetConfigUsingGETResponse{" + "autoBackupConfig=" + autoBackupConfig + "\n" + "autoBackupEnabled=" + autoBackupEnabled + "\n" + "isEncrypt=" + isEncrypt + "\n"
                + "}";
    }

}
