package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogShipperResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 总数目
    */
    private Integer totalCount;

    /**
    * 投递任务列表
    */
    private List<ShipperSummary> result;

    public Boolean getSuccess() {
        return success;
    }

    public ListLogShipperResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ListLogShipperResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListLogShipperResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<ShipperSummary> getResult() {
        return result;
    }

    public ListLogShipperResponse setResult(List<ShipperSummary> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListLogShipperResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "totalCount=" + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
