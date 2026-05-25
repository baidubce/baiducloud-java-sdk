package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfElasticNetworkCardsRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * privateIpAddress
    */
    @JsonIgnore
    private List privateIpAddress;

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

    public String getVpcId() {
        return vpcId;
    }

    public QueryTheListOfElasticNetworkCardsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryTheListOfElasticNetworkCardsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryTheListOfElasticNetworkCardsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List getPrivateIpAddress() {
        return privateIpAddress;
    }

    public QueryTheListOfElasticNetworkCardsRequest setPrivateIpAddress(List privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfElasticNetworkCardsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfElasticNetworkCardsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
