package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAListOfModelVersionsV2Response extends BaseBceResponse {

    /**
    * 模型版本总数
    */
    private Integer totalCount;

    /**
    * 模型版本列表
    */
    private List<ModelVersionEntry> versions;

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetAListOfModelVersionsV2Response setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<ModelVersionEntry> getVersions() {
        return versions;
    }

    public GetAListOfModelVersionsV2Response setVersions(List<ModelVersionEntry> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public String toString() {
        return "GetAListOfModelVersionsV2Response{" + "totalCount=" + totalCount + "\n" + "versions=" + versions + "\n" + "}";
    }

}
