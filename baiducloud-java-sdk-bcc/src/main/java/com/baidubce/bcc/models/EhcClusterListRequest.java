package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EhcClusterListRequest extends BaseBceRequest {

    /**
    * EHC集群的ID列表
    */
    private List<String> ehcClusterIdList;

    /**
    * EHC name列表
    */
    private List<String> nameList;

    /**
    * EHC集群的zoneName
    */
    private String zoneName;

    public List<String> getEhcClusterIdList() {
        return ehcClusterIdList;
    }

    public EhcClusterListRequest setEhcClusterIdList(List<String> ehcClusterIdList) {
        this.ehcClusterIdList = ehcClusterIdList;
        return this;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public EhcClusterListRequest setNameList(List<String> nameList) {
        this.nameList = nameList;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public EhcClusterListRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

}
