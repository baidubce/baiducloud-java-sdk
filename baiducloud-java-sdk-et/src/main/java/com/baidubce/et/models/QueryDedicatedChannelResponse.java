package com.baidubce.et.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDedicatedChannelResponse extends BaseBceResponse {

    /**
    * 专线通道列表
    */
    private List<EtChannel> etChannels;

    public List<EtChannel> getEtChannels() {
        return etChannels;
    }

    public QueryDedicatedChannelResponse setEtChannels(List<EtChannel> etChannels) {
        this.etChannels = etChannels;
        return this;
    }

    @Override
    public String toString() {
        return "QueryDedicatedChannelResponse{" + "etChannels=" + etChannels + "\n" + "}";
    }

}
