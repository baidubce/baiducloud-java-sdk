
package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspIpCleanResponse extends BaseBceResponse  {
    /**
     * 包含查询结果的列表
     */
    private List<TbspIpCleanModel> ipCleanList;

    /**
     * 标记查询的起始位置，若结果列表为空，此项不存在
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

    public ListTbspIpCleanResponse setIpCleanList(List<TbspIpCleanModel> ipCleanList) {
        this.ipCleanList = ipCleanList;
        return this;
    }

    public List<TbspIpCleanModel> getIpCleanList() {
        return this.ipCleanList;
    }

    public ListTbspIpCleanResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return this.marker;
    }

    public ListTbspIpCleanResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListTbspIpCleanResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListTbspIpCleanResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    @Override
    public String toString() {
        return "ListTbspIpCleanResponse{"
                + "ipCleanList=" + ipCleanList + "\n"
                + "marker=" + marker + "\n"
                + "isTruncated=" + isTruncated + "\n"
                + "nextMarker=" + nextMarker + "\n"
                + "maxKeys=" + maxKeys + "\n"
                + "}";
    }




}