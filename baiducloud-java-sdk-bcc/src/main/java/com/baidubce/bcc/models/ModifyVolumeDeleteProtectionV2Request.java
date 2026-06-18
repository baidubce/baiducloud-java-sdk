package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyVolumeDeleteProtectionV2Request extends BaseBceRequest {

    /**
    * 磁盘ID
    */
    private List<String> volumeIds;

    /**
    * 是否开启磁盘释放保护，true为开启，false为关闭
    */
    private Boolean enableDeleteProtection;

    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public ModifyVolumeDeleteProtectionV2Request setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public Boolean getEnableDeleteProtection() {
        return enableDeleteProtection;
    }

    public ModifyVolumeDeleteProtectionV2Request setEnableDeleteProtection(Boolean enableDeleteProtection) {
        this.enableDeleteProtection = enableDeleteProtection;
        return this;
    }

}
