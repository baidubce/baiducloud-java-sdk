package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveTheDatasetListV2Response extends BaseBceResponse {

    /**
    * 数据集总数
    */
    private Integer totalCount;

    /**
    * 数据集列表
    */
    private List<Dataset> datasets;

    public Integer getTotalCount() {
        return totalCount;
    }

    public RetrieveTheDatasetListV2Response setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }

    public RetrieveTheDatasetListV2Response setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveTheDatasetListV2Response{" + "totalCount=" + totalCount + "\n" + "datasets=" + datasets + "\n" + "}";
    }

}
