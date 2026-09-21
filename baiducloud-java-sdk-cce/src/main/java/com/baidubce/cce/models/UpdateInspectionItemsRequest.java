package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInspectionItemsRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * 巡检项开关映射。key 为巡检项英文名，value 为开关，true 表示开启，false 表示关闭。一次可设置多个巡检项
    */
    private Map<String, Boolean> （根元素）;


    public String getClusterID() {
        return clusterID;
    }

    public UpdateInspectionItemsRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public Map<String, Boolean> get（根元素）()
    {
        return （根元素）;
    }

    public UpdateInspectionItemsRequest set（根元素）(Map<String,Boolean>（根元素）)
    {
        this.（根元素） = （根元素）;
        return this;
    }

}
