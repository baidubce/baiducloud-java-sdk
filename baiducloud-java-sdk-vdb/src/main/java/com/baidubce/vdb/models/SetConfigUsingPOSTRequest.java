package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetConfigUsingPOSTRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

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

    public String getInstanceId() {
        return instanceId;
    }

    public SetConfigUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public SetConfigUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getAutoBackupConfig() {
        return autoBackupConfig;
    }

    public SetConfigUsingPOSTRequest setAutoBackupConfig(String autoBackupConfig) {
        this.autoBackupConfig = autoBackupConfig;
        return this;
    }

    public Boolean getAutoBackupEnabled() {
        return autoBackupEnabled;
    }

    public SetConfigUsingPOSTRequest setAutoBackupEnabled(Boolean autoBackupEnabled) {
        this.autoBackupEnabled = autoBackupEnabled;
        return this;
    }

    public String getIsEncrypt() {
        return isEncrypt;
    }

    public SetConfigUsingPOSTRequest setIsEncrypt(String isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

}
