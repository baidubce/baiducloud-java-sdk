package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostpayConfig {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * （该参数已废弃，bcc挂载的包年包月CDS数据盘必须一起转按量付费）变更关联的数据盘列表，默认为空，all表示关联的全部数据盘（例"cdsList":["all"]，若仅变更部分关联数据盘，传具体的数据盘id）
     */
    private List<String> cdsList;

    /**
     * 生效方式，可选参数：AtOnce（立即转按量付费）、AfterExpiration（到期后转按量付费）。不传默认为到期后按量付费。批量操作该参数必须保持一致。
     */
    private String effectiveType;

    public PostpayConfig setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public PostpayConfig setCdsList(List<String> cdsList) {
        this.cdsList = cdsList;
        return this;
    }

    public List<String> getCdsList() {
        return this.cdsList;
    }

    public PostpayConfig setEffectiveType(String effectiveType) {
        this.effectiveType = effectiveType;
        return this;
    }

    public String getEffectiveType() {
        return this.effectiveType;
    }

    @Override
    public String toString() {
        return "PostpayConfig{" + "instanceId=" + instanceId + "\n" + "cdsList=" + cdsList + "\n" + "effectiveType=" + effectiveType + "\n" + "}";
    }

}