package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBaseDdosAttackRecordRequest extends BaseBceRequest {

    /**
    * ip
    */
    @JsonIgnore
    private String ip;

    /**
    * startTime
    */
    @JsonIgnore
    private String startTime;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    public String getIp() {
        return ip;
    }

    public ListBaseDdosAttackRecordRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public ListBaseDdosAttackRecordRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListBaseDdosAttackRecordRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListBaseDdosAttackRecordRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
