package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDeploySetResponse extends BaseBceResponse {

    /**
    * 部署集短id
    */
    private String shortId;

    /**
    * 部署集长id
    */
    private String uuid;

    /**
    * 当前部署集strategy类型下指定可用区配额
    */
    private Integer instanceTotal;

    /**
    * 部署集关联实例数量
    */
    private Integer instanceCount;

    /**
    * 部署集关联bcc实例数量
    */
    private Integer bccInstanceCnt;

    /**
    * 部署集关联bbc实例数量
    */
    private Integer bbcInstanceCnt;

    /**
    * 可用区实例统计列表
    */
    private List<AzIntstanceStatisDetail> azIntstanceStatisList;

    public String getShortId() {
        return shortId;
    }

    public GetDeploySetResponse setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public GetDeploySetResponse setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public Integer getInstanceTotal() {
        return instanceTotal;
    }

    public GetDeploySetResponse setInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
        return this;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public GetDeploySetResponse setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getBccInstanceCnt() {
        return bccInstanceCnt;
    }

    public GetDeploySetResponse setBccInstanceCnt(Integer bccInstanceCnt) {
        this.bccInstanceCnt = bccInstanceCnt;
        return this;
    }

    public Integer getBbcInstanceCnt() {
        return bbcInstanceCnt;
    }

    public GetDeploySetResponse setBbcInstanceCnt(Integer bbcInstanceCnt) {
        this.bbcInstanceCnt = bbcInstanceCnt;
        return this;
    }

    public List<AzIntstanceStatisDetail> getAzIntstanceStatisList() {
        return azIntstanceStatisList;
    }

    public GetDeploySetResponse setAzIntstanceStatisList(List<AzIntstanceStatisDetail> azIntstanceStatisList) {
        this.azIntstanceStatisList = azIntstanceStatisList;
        return this;
    }

    @Override
    public String toString() {
        return "GetDeploySetResponse{" + "shortId=" + shortId + "\n" + "uuid=" + uuid + "\n" + "instanceTotal=" + instanceTotal + "\n" + "instanceCount=" + instanceCount + "\n"
                + "bccInstanceCnt=" + bccInstanceCnt + "\n" + "bbcInstanceCnt=" + bbcInstanceCnt + "\n" + "azIntstanceStatisList=" + azIntstanceStatisList + "\n" + "}";
    }

}
