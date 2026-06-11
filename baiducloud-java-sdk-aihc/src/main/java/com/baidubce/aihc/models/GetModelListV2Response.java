package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetModelListV2Response extends BaseBceResponse {

    /**
    * 模型总数
    */
    private Integer totalCount;

    /**
    * 模型列表
    */
    private List<Model> models;

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetModelListV2Response setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<Model> getModels() {
        return models;
    }

    public GetModelListV2Response setModels(List<Model> models) {
        this.models = models;
        return this;
    }

    @Override
    public String toString() {
        return "GetModelListV2Response{" + "totalCount=" + totalCount + "\n" + "models=" + models + "\n" + "}";
    }

}
