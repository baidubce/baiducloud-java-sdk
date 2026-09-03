package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductImageSearchResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 检索结果数
    */
    @JsonProperty("result_num")
    private Integer resultNum;

    /**
    * 结果数组
    */
    private List<SearchResult> result;

    /**
    * 是否还有下一页
    */
    @JsonProperty("has_more")
    private Boolean hasMore;

    public Integer getErrorCode() {
        return errorCode;
    }

    public ProductImageSearchResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ProductImageSearchResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public ProductImageSearchResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getResultNum() {
        return resultNum;
    }

    public ProductImageSearchResponse setResultNum(Integer resultNum) {
        this.resultNum = resultNum;
        return this;
    }

    public List<SearchResult> getResult() {
        return result;
    }

    public ProductImageSearchResponse setResult(List<SearchResult> result) {
        this.result = result;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public ProductImageSearchResponse setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @Override
    public String toString() {
        return "ProductImageSearchResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "resultNum=" + resultNum + "\n"
                + "result=" + result + "\n" + "hasMore=" + hasMore + "\n" + "}";
    }

}
