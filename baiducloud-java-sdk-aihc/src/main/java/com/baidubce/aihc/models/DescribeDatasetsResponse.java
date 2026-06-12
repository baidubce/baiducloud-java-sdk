package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDatasetsResponse extends BaseBceResponse {

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

    public DescribeDatasetsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }

    public DescribeDatasetsResponse setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeDatasetsResponse{" + "totalCount=" + totalCount + "\n" + "datasets=" + datasets + "\n" + "}";
    }

}
