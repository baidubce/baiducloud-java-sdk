package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeInstanceBySpecRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 目标实例规格
    */
    private String spec;

    /**
    * 实例是否开启Jumbo帧，true:开启Jumbo帧，false:关闭Jumbo帧。默认为空，为空时：变配到不支持Jumbo帧的规格时，不开启Jumbo帧；从不支持变配到支持的规格时，不开启Jumbo帧；从支持到支持得规格是，若实例变配前开启Jumbo帧，变配后也开启Jumbo帧，若变配前不开启，则变配后也不开启。
    */
    private Boolean enableJumboFrame;

    public String getInstanceId() {
        return instanceId;
    }

    public ResizeInstanceBySpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public ResizeInstanceBySpecRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public ResizeInstanceBySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public Boolean getEnableJumboFrame() {
        return enableJumboFrame;
    }

    public ResizeInstanceBySpecRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }

}
