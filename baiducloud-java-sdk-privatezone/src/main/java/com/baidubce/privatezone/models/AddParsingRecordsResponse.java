package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddParsingRecordsResponse extends BaseBceResponse {
    /**
     * 记录的ID
     */
    private String recordId;

    public AddParsingRecordsResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getRecordId() {
        return this.recordId;
    }

    @Override
    public String toString() {
        return "AddParsingRecordsResponse{" + "recordId=" + recordId + "\n" + "}";
    }

}