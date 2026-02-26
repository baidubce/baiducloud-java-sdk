
package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspProtocolBlockingResponse extends BaseBceResponse  {
    /**
     * 包含查询结果的列表
     */
    private List<TbspProtocolBlockingModel> protocolBlockingList;

    /**
     * DDoS增强防护包ID
     */
    private String id;

    public ListTbspProtocolBlockingResponse setProtocolBlockingList(List<TbspProtocolBlockingModel> protocolBlockingList) {
        this.protocolBlockingList = protocolBlockingList;
        return this;
    }

    public List<TbspProtocolBlockingModel> getProtocolBlockingList() {
        return this.protocolBlockingList;
    }

    public ListTbspProtocolBlockingResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ListTbspProtocolBlockingResponse{"
                + "protocolBlockingList=" + protocolBlockingList + "\n"
                + "id=" + id + "\n"
                + "}";
    }




}