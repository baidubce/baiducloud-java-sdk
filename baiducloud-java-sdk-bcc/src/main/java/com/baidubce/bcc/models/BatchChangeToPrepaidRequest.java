package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchChangeToPrepaidRequest extends BaseBceRequest {

    /**
    * 需要批量转包年包月实例的配置，最多支持20个
    */
    private List<PrepayConfig> config;

    public List<PrepayConfig> getConfig() {
        return config;
    }

    public BatchChangeToPrepaidRequest setConfig(List<PrepayConfig> config) {
        this.config = config;
        return this;
    }

}
