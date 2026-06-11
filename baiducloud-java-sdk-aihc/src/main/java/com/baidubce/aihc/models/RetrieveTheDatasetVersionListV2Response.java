package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveTheDatasetVersionListV2Response extends BaseBceResponse {

    /**
    * 数据集版本总数
    */
    private Integer totalCount;

    /**
    * 数据集版本列表
    */
    private List<DatasetVersionEntry> versions;

    public Integer getTotalCount() {
        return totalCount;
    }

    public RetrieveTheDatasetVersionListV2Response setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<DatasetVersionEntry> getVersions() {
        return versions;
    }

    public RetrieveTheDatasetVersionListV2Response setVersions(List<DatasetVersionEntry> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveTheDatasetVersionListV2Response{" + "totalCount=" + totalCount + "\n" + "versions=" + versions + "\n" + "}";
    }

}
