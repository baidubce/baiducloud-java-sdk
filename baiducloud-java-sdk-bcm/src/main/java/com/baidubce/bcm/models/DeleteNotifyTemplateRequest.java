package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteNotifyTemplateRequest extends BaseBceRequest {

    /**
    * 通知模板ID
    */
    private String notifyId;

    public String getNotifyId() {
        return notifyId;
    }

    public DeleteNotifyTemplateRequest setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }

}
