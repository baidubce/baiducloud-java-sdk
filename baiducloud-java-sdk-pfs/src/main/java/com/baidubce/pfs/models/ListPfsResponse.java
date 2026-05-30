package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPfsResponse extends BaseBceResponse {

    /**
    * True表示数据未全部返回，False表示数据全部返回
    */
    private Boolean isTruncated;

    /**
    * 按照instanceId（格式一般为\"\"pfs-xxxxxx\"\"）的字典序排列，从marker之后的第一个开始返回（不包括marker）
    */
    private String marker;

    /**
    * 请求返回的result个数
    */
    private Integer maxKeys;

    /**
    * 下次请求需要传递的marker值
    */
    private String nextMarker;

    /**
    * PFS实例详细信息
    */
    private List<InstanceModel> result;

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListPfsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListPfsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListPfsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListPfsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<InstanceModel> getResult() {
        return result;
    }

    public ListPfsResponse setResult(List<InstanceModel> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListPfsResponse{" + "isTruncated=" + isTruncated + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "nextMarker=" + nextMarker + "\n" + "result="
                + result + "\n" + "}";
    }

}
