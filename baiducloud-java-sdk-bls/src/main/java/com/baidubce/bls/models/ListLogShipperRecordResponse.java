package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogShipperRecordResponse extends BaseBceResponse {

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
    * 投递任务的执行记录
    */
    private List<Record> result;

    public Boolean getSuccess() {
        return success;
    }

    public ListLogShipperRecordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ListLogShipperRecordResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListLogShipperRecordResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<Record> getResult() {
        return result;
    }

    public ListLogShipperRecordResponse setResult(List<Record> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListLogShipperRecordResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "totalCount=" + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
