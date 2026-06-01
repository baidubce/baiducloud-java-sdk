package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMSessionRequest extends BaseBceRequest {

    /**
    * 会话ID
    */
    private String sessionID;

    /**
    * Session开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * Session结束时间，UTC时间
    */
    private String endDatetime;

    public String getSessionID() {
        return sessionID;
    }

    public DescribeLLMSessionRequest setSessionID(String sessionID) {
        this.sessionID = sessionID;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeLLMSessionRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeLLMSessionRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

}
