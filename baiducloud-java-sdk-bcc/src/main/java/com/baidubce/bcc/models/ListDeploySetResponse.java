package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListDeploySetResponse extends BaseBceResponse {

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 每页大小
    */
    private Integer pageSize;

    /**
    * 总数
    */
    private Integer totalCount;

    /**
    * 部署集列表
    */
    private List<DeploySetModel> deploySets;

    public Integer getPageNo() {
        return pageNo;
    }

    public ListDeploySetResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListDeploySetResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListDeploySetResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<DeploySetModel> getDeploySets() {
        return deploySets;
    }

    public ListDeploySetResponse setDeploySets(List<DeploySetModel> deploySets) {
        this.deploySets = deploySets;
        return this;
    }

    @Override
    public String toString() {
        return "ListDeploySetResponse{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "deploySets=" + deploySets + "\n" + "}";
    }

}
