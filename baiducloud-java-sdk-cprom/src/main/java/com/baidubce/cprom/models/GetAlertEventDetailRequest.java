package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAlertEventDetailRequest extends BaseBceRequest {

    /**
    * eventId
    */
    @JsonIgnore
    private String eventId;

    public String getEventId() {
        return eventId;
    }

    public GetAlertEventDetailRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

}
