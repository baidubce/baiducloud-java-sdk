package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddRecordResponse extends BaseBceResponse {

    /**
    * 记录的ID
    */
    private String recordId;

    public String getRecordId() {
        return recordId;
    }

    public AddRecordResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    @Override
    public String toString() {
        return "AddRecordResponse{" + "recordId=" + recordId + "\n" + "}";
    }

}
