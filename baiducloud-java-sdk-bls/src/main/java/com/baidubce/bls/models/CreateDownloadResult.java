package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDownloadResult {
    /**
     * 
     */
    private String uuid;

    public CreateDownloadResult setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override
    public String toString() {
        return "CreateDownloadResult{" + "uuid=" + uuid + "\n" + "}";
    }

}