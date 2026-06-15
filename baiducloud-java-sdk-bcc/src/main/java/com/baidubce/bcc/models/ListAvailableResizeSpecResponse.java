package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAvailableResizeSpecResponse extends BaseBceResponse {

    /**
    * 可变配规格列表
    */
    private List<String> specList;

    public List<String> getSpecList() {
        return specList;
    }

    public ListAvailableResizeSpecResponse setSpecList(List<String> specList) {
        this.specList = specList;
        return this;
    }

    @Override
    public String toString() {
        return "ListAvailableResizeSpecResponse{" + "specList=" + specList + "\n" + "}";
    }

}
