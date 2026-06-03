package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSpecsResponse extends BaseBceResponse {

    /**
    * RapidFS 缓存实例规格信息，见附录 InstanceSpecInfo
    */
    private List<InstanceSpecInfo> instanceSpecInfos;

    public List<InstanceSpecInfo> getInstanceSpecInfos() {
        return instanceSpecInfos;
    }

    public DescribeSpecsResponse setInstanceSpecInfos(List<InstanceSpecInfo> instanceSpecInfos) {
        this.instanceSpecInfos = instanceSpecInfos;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeSpecsResponse{" + "instanceSpecInfos=" + instanceSpecInfos + "\n" + "}";
    }

}
