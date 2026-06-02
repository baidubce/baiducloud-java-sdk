package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLbdcBlbResponse extends BaseBceResponse {

    /**
    * 包含查询结果的BLB列表
    */
    private List<AssociateBlbModel> blbList;

    public List<AssociateBlbModel> getBlbList() {
        return blbList;
    }

    public DescribeLbdcBlbResponse setBlbList(List<AssociateBlbModel> blbList) {
        this.blbList = blbList;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLbdcBlbResponse{" + "blbList=" + blbList + "\n" + "}";
    }

}
