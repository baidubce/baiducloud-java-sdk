package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCustomScrapeTaskResponse extends BaseBceResponse {

    /**
    * 采集任务ID
    */
    private String scrapeJobId;

    public String getScrapeJobId() {
        return scrapeJobId;
    }

    public CreateCustomScrapeTaskResponse setScrapeJobId(String scrapeJobId) {
        this.scrapeJobId = scrapeJobId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateCustomScrapeTaskResponse{" + "scrapeJobId=" + scrapeJobId + "\n" + "}";
    }

}
