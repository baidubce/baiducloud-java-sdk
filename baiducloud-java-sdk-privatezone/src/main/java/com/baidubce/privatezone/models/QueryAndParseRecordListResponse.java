package com.baidubce.privatezone.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAndParseRecordListResponse extends BaseBceResponse {
    /**
     * 标记查询的起始位置
     */
    private String marker;

    /**
     * true表示后面还有数据，false表示已经是最后一页
     */
    private Boolean isTruncated;

    /**
     * 获取下一页所需要传递的marker值；当isTruncated为false时，该域不出现
     */
    private String nextMarker;

    /**
     * 每页包含的最大数量
     */
    private Integer maxKeys;

    /**
     * 解析记录的集合
     */
    private List<PrivateRecord> records;

    public QueryAndParseRecordListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return this.marker;
    }

    public QueryAndParseRecordListResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public QueryAndParseRecordListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public QueryAndParseRecordListResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public QueryAndParseRecordListResponse setRecords(List<PrivateRecord> records) {
        this.records = records;
        return this;
    }

    public List<PrivateRecord> getRecords() {
        return this.records;
    }

    @Override
    public String toString() {
        return "QueryAndParseRecordListResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys
                + "\n" + "records=" + records + "\n" + "}";
    }

}