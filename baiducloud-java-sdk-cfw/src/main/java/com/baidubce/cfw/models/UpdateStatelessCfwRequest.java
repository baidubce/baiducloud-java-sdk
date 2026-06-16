package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateStatelessCfwRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * CFW名称，长度不超过65个字符，必须以字母或中文开头，只能包含大小写字母、数字、中文及-_/.字符
    */
    private String name;

    /**
    * CFW描述，不超过200字符
    */
    private String description;

    /**
    * 协议，取值 [ TCP \| UDP \| ICMP \| ALL ]
    */
    private String protocol;

    /**
    * IP列表
    */
    private List<String> ipList;

    public String getCfwId() {
        return cfwId;
    }

    public UpdateStatelessCfwRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateStatelessCfwRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateStatelessCfwRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public UpdateStatelessCfwRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public UpdateStatelessCfwRequest setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

}
