package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstanceDomainNameRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 新的实例域名。域名命名规范：<br>1\.由小写字母和数字组成；<br>2\.以小写字母开头；<br>3\.长度在3\-30之间。
    */
    private String domain;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstanceDomainNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public ModifyInstanceDomainNameRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }

}
