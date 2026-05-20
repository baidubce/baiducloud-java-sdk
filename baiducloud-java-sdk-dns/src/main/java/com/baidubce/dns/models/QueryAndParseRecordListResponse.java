package com.baidubce.dns.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAndParseRecordListResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置。
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页。
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现。
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量。
    */
    private Integer maxKeys;

    /**
    * 包含查询结果的解析记录列表。
    */
    private List<PublicRecord> records;

    public String getMarker() {
        return marker;
    }

    public QueryAndParseRecordListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryAndParseRecordListResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryAndParseRecordListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryAndParseRecordListResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<PublicRecord> getRecords() {
        return records;
    }

    public QueryAndParseRecordListResponse setRecords(List<PublicRecord> records) {
        this.records = records;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAndParseRecordListResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys
                + "\n" + "records=" + records + "\n" + "}";
    }

}
