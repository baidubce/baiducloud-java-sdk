package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PullLogRecordResponse extends BaseBceResponse {

    /**
    * 一组日志记录
    */
    private List<LogRecord> result;

    /**
    * 返回的位置标记
    */
    private String marker;

    /**
    * true: 表示后面还有数据，false: 表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 下次查看的起始位置，可在翻页的时候作为 marker 在请求里携带
    */
    private String nextMarker;

    public List<LogRecord> getResult() {
        return result;
    }

    public PullLogRecordResponse setResult(List<LogRecord> result) {
        this.result = result;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public PullLogRecordResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public PullLogRecordResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public PullLogRecordResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    @Override
    public String toString() {
        return "PullLogRecordResponse{" + "result=" + result + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "}";
    }

}
