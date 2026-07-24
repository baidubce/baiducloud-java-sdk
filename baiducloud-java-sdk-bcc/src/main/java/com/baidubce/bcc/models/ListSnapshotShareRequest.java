package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSnapshotShareRequest extends BaseBceRequest {

    /**
    * 批量获取列表的查询的起始位置，是一个由系统生成的字符串
    */
    private String marker;

    /**
    * 每页包含的最大数量，最大数量通常不超过100，缺省值为10
    */
    private Integer maxKeys;

    public String getMarker() {
        return marker;
    }

    public ListSnapshotShareRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListSnapshotShareRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
