package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAspsResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * 返回的自动快照策略列表
    */
    private List<AutoSnapshotPolicyModel> autoSnapshotPolicys;

    public String getMarker() {
        return marker;
    }

    public ListAspsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListAspsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListAspsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListAspsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<AutoSnapshotPolicyModel> getAutoSnapshotPolicys() {
        return autoSnapshotPolicys;
    }

    public ListAspsResponse setAutoSnapshotPolicys(List<AutoSnapshotPolicyModel> autoSnapshotPolicys) {
        this.autoSnapshotPolicys = autoSnapshotPolicys;
        return this;
    }

    @Override
    public String toString() {
        return "ListAspsResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "autoSnapshotPolicys=" + autoSnapshotPolicys + "\n" + "}";
    }

}
