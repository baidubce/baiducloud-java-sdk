package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTheListOfClusterNodeGroupsV2Request extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * keywordType
    */
    @JsonIgnore
    private String keywordType;

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

    /**
    * autoscalerEnabled
    */
    @JsonIgnore
    private String autoscalerEnabled;

    /**
    * chargingType
    */
    @JsonIgnore
    private String chargingType;

    public String getClusterID() {
        return clusterID;
    }

    public GetTheListOfClusterNodeGroupsV2Request setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetTheListOfClusterNodeGroupsV2Request setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetTheListOfClusterNodeGroupsV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public GetTheListOfClusterNodeGroupsV2Request setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public GetTheListOfClusterNodeGroupsV2Request setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getAutoscalerEnabled() {
        return autoscalerEnabled;
    }

    public GetTheListOfClusterNodeGroupsV2Request setAutoscalerEnabled(String autoscalerEnabled) {
        this.autoscalerEnabled = autoscalerEnabled;
        return this;
    }

    public String getChargingType() {
        return chargingType;
    }

    public GetTheListOfClusterNodeGroupsV2Request setChargingType(String chargingType) {
        this.chargingType = chargingType;
        return this;
    }

}
