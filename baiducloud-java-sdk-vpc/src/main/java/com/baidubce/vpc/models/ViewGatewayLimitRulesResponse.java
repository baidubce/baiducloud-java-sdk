package com.baidubce.vpc.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewGatewayLimitRulesResponse extends BaseBceResponse {
    /**
     * 限流规则列表
     */
    private List<GlrItem> result;

    /**
     * 标记查询的起始位置
     */
    private String marker;

    /**
     * true表示后面还有数据，false表示已经是最后一页
     */
    private Boolean isTruncated;

    /**
     * 每页包含的最大数量
     */
    private Integer maxKeys;

    /**
     * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
     */
    private String nextMarker;

    public ViewGatewayLimitRulesResponse setResult(List<GlrItem> result) {
        this.result = result;
        return this;
    }

    public List<GlrItem> getResult() {
        return this.result;
    }

    public ViewGatewayLimitRulesResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return this.marker;
    }

    public ViewGatewayLimitRulesResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ViewGatewayLimitRulesResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public ViewGatewayLimitRulesResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    @Override
    public String toString() {
        return "ViewGatewayLimitRulesResponse{" + "result=" + result + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "maxKeys=" + maxKeys + "\n"
                + "nextMarker=" + nextMarker + "\n" + "}";
    }

}