package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstanceEnisResponse extends BaseBceResponse {

    /**
    * 网卡信息列表
    */
    private List<EniInfo> enis;

    public List<EniInfo> getEnis() {
        return enis;
    }

    public ListInstanceEnisResponse setEnis(List<EniInfo> enis) {
        this.enis = enis;
        return this;
    }

    @Override
    public String toString() {
        return "ListInstanceEnisResponse{" + "enis=" + enis + "\n" + "}";
    }

}
