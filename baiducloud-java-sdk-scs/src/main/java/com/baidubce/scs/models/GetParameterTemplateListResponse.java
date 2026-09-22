package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetParameterTemplateListResponse extends BaseBceResponse {

    /**
    * 参数模版列表
    */
    private List<Result> result;

    /**
    * 批量获取列表的查询的起始位置，是一个由系统生成的字符串,起始值可传入-1
    */
    private String marker;

    /**
    * 每页包含的最大数量，最大数量通常不超过1000，缺省值为1000
    */
    private Integer maxKeys;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    public List<Result> getResult() {
        return result;
    }

    public GetParameterTemplateListResponse setResult(List<Result> result) {
        this.result = result;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public GetParameterTemplateListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetParameterTemplateListResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public GetParameterTemplateListResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public GetParameterTemplateListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    @Override
    public String toString() {
        return "GetParameterTemplateListResponse{" + "result=" + result + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "isTruncated=" + isTruncated + "\n"
                + "nextMarker=" + nextMarker + "\n" + "}";
    }

}
