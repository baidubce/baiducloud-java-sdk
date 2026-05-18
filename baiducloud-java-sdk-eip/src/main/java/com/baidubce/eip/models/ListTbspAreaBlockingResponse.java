package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspAreaBlockingResponse extends BaseBceResponse {

    /**
    * 包含查询结果的列表
    */
    private List<TbspAreaBlockingModel> areaBlockingList;

    /**
    * DDoS增强防护包ID
    */
    private String id;

    public List<TbspAreaBlockingModel> getAreaBlockingList() {
        return areaBlockingList;
    }

    public ListTbspAreaBlockingResponse setAreaBlockingList(List<TbspAreaBlockingModel> areaBlockingList) {
        this.areaBlockingList = areaBlockingList;
        return this;
    }

    public String getId() {
        return id;
    }

    public ListTbspAreaBlockingResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "ListTbspAreaBlockingResponse{" + "areaBlockingList=" + areaBlockingList + "\n" + "id=" + id + "\n" + "}";
    }

}
