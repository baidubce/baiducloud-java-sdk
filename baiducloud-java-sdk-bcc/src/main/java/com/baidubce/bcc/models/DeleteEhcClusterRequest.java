package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteEhcClusterRequest extends BaseBceRequest {

    /**
    * 删除的EHC集群id列表
    */
    private List<String> ehcClusterIdList;

    public List<String> getEhcClusterIdList() {
        return ehcClusterIdList;
    }

    public DeleteEhcClusterRequest setEhcClusterIdList(List<String> ehcClusterIdList) {
        this.ehcClusterIdList = ehcClusterIdList;
        return this;
    }

}
