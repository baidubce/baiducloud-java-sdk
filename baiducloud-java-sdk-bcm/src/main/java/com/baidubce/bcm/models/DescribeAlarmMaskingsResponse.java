package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmMaskingsResponse extends BaseBceResponse {

    /**
    * 屏蔽规则列表
    */
    private List<AlarmMaskingModel> maskings;

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    /**
    * 总条数
    */
    private Integer totalSize;

    public List<AlarmMaskingModel> getMaskings() {
        return maskings;
    }

    public DescribeAlarmMaskingsResponse setMaskings(List<AlarmMaskingModel> maskings) {
        this.maskings = maskings;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmMaskingsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmMaskingsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public DescribeAlarmMaskingsResponse setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmMaskingsResponse{" + "maskings=" + maskings + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalSize=" + totalSize + "\n"
                + "}";
    }

}
