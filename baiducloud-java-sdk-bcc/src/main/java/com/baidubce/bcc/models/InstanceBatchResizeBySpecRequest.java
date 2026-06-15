package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceBatchResizeBySpecRequest extends BaseBceRequest {

    /**
    * 批量变配的实例规格
    */
    private String spec;

    /**
    * 实例id组成的集合，最多30个
    */
    private List<String> instanceIdList;

    /**
    * 实例是否开启Jumbo帧，true:开启Jumbo帧，false:关闭Jumbo帧。默认为空，为空时：变配到不支持Jumbo帧的规格时，不开启Jumbo帧；从不支持变配到支持的规格时，不开启Jumbo帧；从支持到支持的规格时，若实例变配前开启Jumbo帧，变配后也开启Jumbo帧，若变配前不开启，则变配后也不开启。
    */
    private Boolean enableJumboFrame;

    /**
    * 子网id
    */
    private String subnetId;

    /**
    * 逻辑可用区标识
    */
    private String logicalZone;

    public String getSpec() {
        return spec;
    }

    public InstanceBatchResizeBySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public InstanceBatchResizeBySpecRequest setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public Boolean getEnableJumboFrame() {
        return enableJumboFrame;
    }

    public InstanceBatchResizeBySpecRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public InstanceBatchResizeBySpecRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getLogicalZone() {
        return logicalZone;
    }

    public InstanceBatchResizeBySpecRequest setLogicalZone(String logicalZone) {
        this.logicalZone = logicalZone;
        return this;
    }

}
