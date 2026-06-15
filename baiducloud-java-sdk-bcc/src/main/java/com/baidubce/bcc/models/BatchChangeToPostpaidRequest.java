package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchChangeToPostpaidRequest extends BaseBceRequest {

    /**
    * 需要批量转按量付费实例的配置，最多支持20个
    */
    private List<PostpayConfig> config;

    public List<PostpayConfig> getConfig() {
        return config;
    }

    public BatchChangeToPostpaidRequest setConfig(List<PostpayConfig> config) {
        this.config = config;
        return this;
    }

}
