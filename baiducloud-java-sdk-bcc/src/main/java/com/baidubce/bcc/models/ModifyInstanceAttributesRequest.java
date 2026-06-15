package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstanceAttributesRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例名称，支持大小写字母、数字以及-_ /.特殊字符，必须以字母开头，长度1-65个字符。
    */
    private String name;

    /**
    * 是否开启Jumbo帧，开启:true，关闭:false。注意:只有支持Jumbo帧的套餐才能开启
    */
    private Boolean enableJumboFrame;

    /**
    * 修改后的网卡队列数
    */
    private String netEthQueueCount;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstanceAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyInstanceAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnableJumboFrame() {
        return enableJumboFrame;
    }

    public ModifyInstanceAttributesRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }

    public String getNetEthQueueCount() {
        return netEthQueueCount;
    }

    public ModifyInstanceAttributesRequest setNetEthQueueCount(String netEthQueueCount) {
        this.netEthQueueCount = netEthQueueCount;
        return this;
    }

}
